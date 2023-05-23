public class Month {
    private int nMonth;

    public Month(int nMonth) {

        if(nMonth < 1 || nMonth > 12) {
            System.out.println("ERROR: Invalid Month");
        }

        this.nMonth = nMonth;
    }

    public String getMonthName() {

        String[] sMonth = {"Jan", "Feb", "Mar",
                           "Apr", "May", "Jun",
                           "Jul", "Aug", "Sep",
                           "Oct", "Nov", "Dec"};

        return sMonth[nMonth - 1];
    }
}