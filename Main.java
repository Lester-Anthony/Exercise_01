import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nMonth, nDay, nYear;
        boolean error = false;

        Scanner sc = new Scanner(System.in);
        // do while scan loop
        
        System.out.print("Enter date : ");
        
        do {
            error = false;

            String sInput = sc.nextLine();

            String[] date = sInput.split("-");

            // System.out.println(date[0]);
            // System.out.println(date[1]);
            // System.out.println(date[2]);
            
            nMonth = Integer.parseInt(date[0]);
            if (nMonth < 1 || nMonth > 12) {
                error = true;
                System.out.println("Invalid Month. ");
            }
            // System.out.println(nMonth);
            
            nDay = Integer.parseInt(date[1]);
            if (nDay < 1 ||
                (nMonth == 1 && nDay > 31) || 
                (nMonth == 2 && nDay > 29) || 
                (nMonth == 3 && nDay > 31) || 
                (nMonth == 4 && nDay > 30) || 
                (nMonth == 5 && nDay > 31) || 
                (nMonth == 6 && nDay > 30) || 
                (nMonth == 7 && nDay > 31) || 
                (nMonth == 8 && nDay > 31) || 
                (nMonth == 9 && nDay > 30) || 
                (nMonth == 10 && nDay > 31) || 
                (nMonth == 11 && nDay > 30) || 
                (nMonth == 12 && nDay > 31) 
               ) {
                error = true;
                System.out.println("Invalid Day. ");
            }
            // System.out.println(nDay);
            
            nYear = Integer.parseInt(date[2]);
            if (nYear < 0 || (nYear > 99 && nYear < 999)) {
                error = true;
                System.out.println("Invalid Year. ");
            }
            // System.out.println(nYear);
            
            if (error == true)
                System.out.println("Enter date (mm-dd-yy/yyyy) : ");
        } while (error == true);
        
        if(nYear < 100) {
            nYear += 2000;
        }
        
        Month m = new Month();

        System.out.println(m.getMonthName(nMonth) + " " + nDay + ", " + nYear); 

        sc.close();
    }
}

