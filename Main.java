import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nMonth, nDay, nYear;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (mm-dd-yy) : ");
        String sInput = sc.nextLine();

        String[] date = sInput.split("-");

        nMonth = Integer.parseInt(date[0]); 
        nDay = Integer.parseInt(date[1]);
        nYear = Integer.parseInt(date[2]);

        System.out.println(nMonth);
        System.out.println(nDay);
        System.out.println(nYear);
    }
}

