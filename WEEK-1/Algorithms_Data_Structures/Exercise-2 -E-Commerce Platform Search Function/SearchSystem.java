
public class SearchSystem {

    public static Course linearSearch(Course[] courses, String targetId) {
        for (Course c : courses) {
            if (c.courseId.equalsIgnoreCase(targetId)) return c;
        }
        return null;
    }

    public static Course binarySearch(Course[] sortedCourses, String targetId) {
        int left = 0, right = sortedCourses.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = sortedCourses[mid].courseId.compareToIgnoreCase(targetId);
            if (cmp == 0) return sortedCourses[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void displayCourses(Course[] courses) {
        System.out.println(String.format("%-8s | %-30s | %-20s", "ID", "Course Title", "Department"));
        System.out.println("---------------------------------------------------------------");
        for (Course c : courses) {
            System.out.println(c.format());
        }
    }
}
