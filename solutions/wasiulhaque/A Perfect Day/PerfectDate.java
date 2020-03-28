public class PerfectDate {
    final int year;
    final int month;
    final int date;

    public PerfectDate(int year, int month, int date) {
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
        String date;
        int currentDate = getDate();
        int currentMonth = getMonth();
        int currentYear = getYear();

        if (currentDate == 32 && currentMonth == 8) {
            currentDate = 1;
            currentMonth = 1;
            currentYear += 1;
        } else if (currentDate == 32) {
            currentDate = 1;
            currentMonth += 1;
        } else {
            currentDate += 1;
        }

        if (currentDate < 10) {
            date = currentYear + "/0" + currentMonth + "/0" + currentDate;
        } else {
            date = currentYear + "/0" + currentMonth + "/" + currentDate;
        }
        return date;    
    }
}

