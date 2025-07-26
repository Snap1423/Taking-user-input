public class TryStatement {

    public static void main(String[] args) {
        int currentYear = 2025;

        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your Name?");
        System.out.println("Hi " + name + " Thank you for this course ");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return " So your " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear){
        return "";
    }
}
