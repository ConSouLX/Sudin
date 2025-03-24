public class SchoolRun {
    public static void main(String[] args) {
        System.out.println("main started");
        School.chairman();
        Chairman.appointsPrincipal();
        Principal.makeRules();
        Students.followRules();
        System.out.println("Main ended");
    }
}
