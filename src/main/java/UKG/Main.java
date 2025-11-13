package UKG;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;


public class Main {


    private static final String BASE_URL = "http://json.hackerrank.com/api/universities";

    public String bestUniversityByCountry(String country) {
        int page = 1;
        int totalPages = 1;

        String bestUniversity = null;
        int bestRank = Integer.MAX_VALUE;

        try {
            do {
                String apiUrl = BASE_URL + "?page=" + page;

                // Make HTTP GET Request
                URL url = new URL(apiUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder responseBuilder = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    responseBuilder.append(line);
                }

                reader.close();
                conn.disconnect();

                // Parse JSON response
                JSONObject responseJson = new JSONObject(responseBuilder.toString());
                totalPages = responseJson.getInt("total_pages");

                JSONArray data = responseJson.getJSONArray("data");

                for (int i = 0; i < data.length(); i++) {
                    JSONObject university = data.getJSONObject(i);

                    if (!university.has("location")) continue;

                    JSONObject location = university.getJSONObject("location");
                    String uniCountry = location.optString("country", "");

                    if (uniCountry.equalsIgnoreCase(country)) {
                        String name = university.optString("name", "");
                        int rank = university.has("rank") && !university.isNull("rank")
                                ? university.getInt("rank")
                                : Integer.MAX_VALUE;

                        if (rank < bestRank) {
                            bestRank = rank;
                            bestUniversity = name;
                        }
                    }
                }
                page++;
            } while (page <= totalPages);

        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }

        return bestUniversity != null ? bestUniversity : "No university found for country: " + country;
    }

    // Test method
    public static void main(String[] args) {
        Main service = new Main();
        String result = service.bestUniversityByCountry("India");
        System.out.println("Best University: " + result);
    }


}
