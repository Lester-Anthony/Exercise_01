public class Month {
    
    public String getMonthName(int nMonth) {
        
        String[] sMonth = {"Jan", "Feb", "Mar",
        "Apr", "May", "Jun",
        "Jul", "Aug", "Sep",
        "Oct", "Nov", "Dec"};
        
        return sMonth[nMonth - 1];
    } 
}
