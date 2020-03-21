public class PerfectDate {

    final int year, month, date;

    public PerfectDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public String nextDay() {


        int currentYear = getYear();
        int currentMonth = getMonth();
        int currentDate = getDate();

        return processNextDay(currentYear, currentMonth, currentDate);


    }


    private String processNextDay(int currentYear, int currentMonth, int currentDate) {

        String nextDate;
        if (currentMonth == 8 && currentDate == 32) {
            nextDate = ifLastDayOfTheYear(currentYear, currentMonth, currentDate);
        } else if (currentDate == 32) {
            nextDate = ifLastDayOfTheMonth(currentYear, currentMonth, currentDate);

        } else
            nextDate = ifNotLastDay(currentYear, currentMonth, currentDate);

        return nextDate;
    }

    private String ifLastDayOfTheYear(int currentYear, int currentMonth, int currentDate) {

        currentYear += 1;
        currentMonth = 1;
        currentDate = 1;

        return formatTime(currentYear, currentMonth, currentDate);
    }


    private String ifLastDayOfTheMonth(int currentYear, int currentMonth, int currentDate) {
        currentMonth += 1;
        currentDate = 1;

        return formatTime(currentYear, currentMonth, currentDate);
    }

    private String ifNotLastDay(int currentYear, int currentMonth, int currentDate) {
        currentDate += 1;

        return formatTime(currentYear, currentMonth, currentDate);
    }


    private String formatTime(int currentYear, int currentMonth, int currentDate) {
        String formattedDate;

        if (currentDate >= 1 && currentDate <= 9) {
            formattedDate = currentYear + "/0" + currentMonth + "/0" + currentDate;
        } else {
            formattedDate = currentYear + "/0" + currentMonth + "/" + currentDate;
        }

        return formattedDate;


    }


}
