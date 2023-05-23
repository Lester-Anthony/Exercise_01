import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (mm-dd-yy) : ");
        String sInput = sc.nextLine();

        String[] date = sInput.split("-");

        for(int i = 0; i < 3; i++) {
            System.out.println(date[i]);
        }

    }
}

