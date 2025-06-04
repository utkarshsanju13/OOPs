package DesignPatternRevision.Builder;

public class Student {

    private int id;
    private String name;
    private int age;
    private String gender;
    private int gradeYear;

    public Student(int id, String name, int age, String gender, int gradeYear) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.gradeYear = gradeYear;
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }

    public static class Builder{
        private int id;
        private String name;
        private int age;
        private String gender;
        private int gradeYear;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setGradeYear(int gradeYear) {
            this.gradeYear = gradeYear;
            return this;
        }

        public void validateAge(){
            if(age < 18)
                throw new InvalidAgeException("teh age must be above 18");
        }

        public void validateGradYear(){
            if(this.gradeYear > 2025){
                throw new InvalidGradYear("grade year must be below 2025");
            }
        }

        public void validate(){
            validateAge();
            validateGradYear();
        }

        public Student build(){
            validate();
            return new Student(id, name, age, gender, gradeYear);
        }
    }
}
