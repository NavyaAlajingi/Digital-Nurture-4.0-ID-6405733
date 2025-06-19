public class Course {
    String courseId;
    String courseTitle;
    String department;

    public Course(String courseId, String courseTitle, String department) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.department = department;
    }

    public String format() {
        return String.format("%-8s | %-30s | %-20s", courseId, courseTitle, department);
    }

    public String brief() {
        return courseId + " - " + courseTitle + " (" + department + ")";
    }
}
