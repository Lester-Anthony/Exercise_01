public class Month {

    /**
     * Returns the three-character month name corresponding to an month integer.
     * <p>
     * @param nMonth an integer equivalent of a month.
     * @return       the corresponding three-character month name. 
     */
    public String getMonthName(int nMonth) {
        
        String[] sMonth = {"Jan", "Feb", "Mar",
        "Apr", "May", "Jun",
        "Jul", "Aug", "Sep",
        "Oct", "Nov", "Dec"};
        
        return sMonth[nMonth - 1];
    } 
}
