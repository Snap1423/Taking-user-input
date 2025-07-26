import java.util.Scanner;

public class Practice {

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
        Scanner sc = new Scanner(System.in);

        System.out.println(" Hi, What is your name ? ");
        String name = sc.nextLine();
        System.out.println(" Hi " + name + " Thank you for taking this course");

        System.out.println(" Which year were you born ? ");

        boolean validDob = false;
        int age = 0;

        do {
            System.out.println(" Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, sc.nextLine());
                validDob = age < 0 ? false : true;
            } catch (NumberFormatException badUserData){
                System.out.println("Characters are not allowed");
            }
        }while(!validDob);

        return " so you're " + age + " years old ";
    }

    public static int checkData(int currentYear, String dateOfBirth){

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }

        return(currentYear - dob);

    }
}
