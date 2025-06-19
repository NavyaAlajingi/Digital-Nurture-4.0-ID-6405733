import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Course[] courses = {
            new Course("CS101", "Intro to Programming", "Computer Science"),
            new Course("MA201", "Linear Algebra", "Mathematics"),
            new Course("PH110", "Physics of Waves", "Physics"),
            new Course("EE220", "Digital Circuits", "Electrical Engineering"),
            new Course("HS301", "Ethics and Society", "Humanities")
        };

        System.out.println("=====================================");
        System.out.println("     UNIVERSITY COURSE SEARCH");
        System.out.println("=====================================\n");

        // Linear Search
        System.out.println(">> LINEAR SEARCH");
        Course result1 = SearchSystem.linearSearch(courses, "EE220");
        if (result1 != null)
            System.out.println("Found: " + result1.brief());
        else
            System.out.println("Course not found.");

        // Sort by courseId
        Arrays.sort(courses, (a, b) -> a.courseId.compareToIgnoreCase(b.courseId));

        System.out.println("\n>> SORTED COURSE LIST");
        SearchSystem.displayCourses(courses);

        // Binary Search
        System.out.println("\n>> BINARY SEARCH");
        Course result2 = SearchSystem.binarySearch(courses, "EE220");
        if (result2 != null)
            System.out.println("Found: " + result2.brief());
        else
            System.out.println("Course not found.");

        // Performance Report
        System.out.println("\n>> PERFORMANCE ANALYSIS");
        System.out.println("Linear Search:");
        System.out.println(" - Time Complexity: O(n)");
        System.out.println(" - Simple, works without sorting");
        System.out.println("\nBinary Search:");
        System.out.println(" - Time Complexity: O(log n)");
        System.out.println(" - Requires sorted data (sorting = O(n log n))");

        System.out.println("\n>> RECOMMENDATIONS");
        System.out.println("1. Use Binary Search if course list is static and sorted.");
        System.out.println("2. Use Linear Search if data changes frequently or for small lists.");
        System.out.println("3. Use HashMap for ultra-fast lookups by course ID (O(1)).");

        System.out.println("\n=====================================");
        System.out.println("         END OF COURSE REPORT");
        System.out.println("=====================================");
    }
}
