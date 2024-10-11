enum Gender {Male,Female};
enum Course {Database,Programming,Math,ERP};
enum Semester {Summer,Winter,Fall,Spring};

public class RegisterForm {
    private String stdName;
    private Gender stdGender;
    private Course stdCourse;
    private Semester stdSemester;

    public RegisterForm() {
        this.stdName = "No Name";
        this.stdGender = Gender.Male;
        this.stdCourse = Course.Database;
        this.stdSemester = Semester.Winter;
    }

    public RegisterForm(String stdName, Gender stdGender, Course stdCourse, Semester stdSemester) {
        if (stdName == null || stdName.trim().isEmpty()) {
            System.out.println("Error: Student name is required.");
            this.stdName = "No Name";
        } else {
            this.stdName = stdName;
        }
        this.stdGender = stdGender;
        this.stdCourse = stdCourse;
        this.stdSemester = stdSemester;
    }

    // getters and setters
    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        if (stdName == null || stdName.trim().isEmpty()) {
            System.out.println("Error: Student name is required.");
            this.stdName = "No Name";
        } else {
            this.stdName = stdName;
        }
    }

    public Gender getStdGender() {
        return stdGender;
    }

    public void setStdGender(Gender stdGender) {
        this.stdGender = stdGender;
    }

    public Course getStdCourse() {
        return stdCourse;
    }

    public void setStdCourse(Course stdCourse) {
        this.stdCourse = stdCourse;
    }

    public Semester getStdSemester() {
        return stdSemester;
    }

    public void setStdSemester(Semester stdSemester) {
        this.stdSemester = stdSemester;
    }
}