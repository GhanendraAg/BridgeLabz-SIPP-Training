public class Course {
    private String courseName;
    private int duration; // in weeks or months
    private double fee;
    private static String instituteName = "Default Institute";


    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: ₹" + fee +
                           ", Institute: " + instituteName);
    }


    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
