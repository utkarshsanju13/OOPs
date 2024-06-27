//package TeraTermLoginScript;
//
//
//
//import expect4j.Expect4j;
//import expect4j.ExpectUtils;
//import expect4j.matches.Match;
//import expect4j.matches.RegExpMatch;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TeraTermLogin {
//
//    private static final String HOST = "your.server.address";
//    private static final String USERNAME = "your_username";
//    private static final String PASSWORD = "your_password";
//    private static final int SSH_PORT = 22;
//
//    private static final int COMMAND_EXECUTION_SUCCESS_OPCODE = -2;
//    private Expect4j expect = null;
//
//    public static void main(String[] args) {
//        TeraTermLogin login = new TeraTermLogin();
//        login.login();
//    }
//
//    public void login() {
//        String[] sshCommand = {"/usr/bin/ssh", USERNAME + "@" + HOST, "-p", String.valueOf(SSH_PORT)};
//        try {
//            expect = ExpectUtils.SSH(HOST,USERNAME,PASSWORD);
//            List<Match> matchList = new ArrayList<Match>();
//            matchList.add(new RegExpMatch(".*[Pp]assword:.*", (expectState) -> {
//                expect.send(PASSWORD);
//                expect.send("\r");
//                return COMMAND_EXECUTION_SUCCESS_OPCODE;
//            }));
//            matchList.add(new RegExpMatch(".*[Ll]ogin:.*", (expectState) -> {
//                expect.send(USERNAME);
//                expect.send("\r");
//                return COMMAND_EXECUTION_SUCCESS_OPCODE;
//            }));
//
//            expect.expect(matchList);
//
//            // Now you are logged in, you can send more commands
//            expect.send("ls -la\r");
//            expect.send("exit\r");
//
//            expect.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
