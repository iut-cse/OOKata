public class PerfectDate {
    final int year;
    final int month;
    final int date;

    public PerfectDate(int year, int month, int date){
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }

    public String nextDay() {
        String nextDayDate;
        int currentDate = getDate();
        int currentMonth = getMonth();
        int currentYear = getYear();

        if (currentDate == 32 && currentMonth == 8) {
            currentDate = 1;
            currentMonth = 1;
            currentYear += 1;
            nextDayDate = getFormattedDate(currentDate, currentMonth, currentYear);
        } else if (currentDate == 32) {
            currentDate = 1;
            currentMonth += 1;
            nextDayDate = getFormattedDate(currentDate, currentMonth, currentYear);
        } else {
            currentDate += 1;
            nextDayDate = getFormattedDate(currentDate, currentMonth, currentYear);
        }

        return nextDayDate;
    }

    private String getFormattedDate(int currentDate, int currentMonth, int currentYear) {
        String formattedDate;
        if(currentDate < 9){
            formattedDate = currentYear + "/0" + currentMonth + "/0" + currentDate;
        } else{
            formattedDate = currentYear + "/0" + currentMonth + "/" + currentDate;
        }
        return formattedDate;
    }
}
