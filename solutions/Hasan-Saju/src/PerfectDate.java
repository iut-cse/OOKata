public class PerfectDate {

    private String Today;

    public String getToday() {
        return Today;
    }

    public void setToday(String today) {
        Today = today;
    }

    String NextDay()
    {
        int day1,day2,day;
        day1=Today.charAt(8)-'0';
        day2=Today.charAt(9)-'0';
        day = (day1 * 10) + day2;

        int month1,month2,month;
        month1=Today.charAt(5)-'0';
        month2=Today.charAt(6)-'0';
        month = (month1 * 10) + month2;

       int year1,year2,year3,year4,year;
        year1=Today.charAt(0)-'0';
        year2=Today.charAt(1)-'0';
        year3=Today.charAt(2)-'0';
        year4=Today.charAt(3)-'0';
        year = (year1 * 1000) + (year2 * 100) + (year3 * 10) + year4;

        if(day==32 && month==8)
        {
            year+=1;
            month=1;
            day=1;
        }

        else if(month==8 && day<32)
        {
            day+=1;
            month=1;
            year+=1;
        }

        else if(month<8 && day==32)
        {
            month+=1;
            day=1;
        }

        else
        {
            day+=1;
        }

        String temp,answer="";
        temp=String.valueOf(year);
        answer+=temp;
        answer+="/";

        answer+="0";
        temp=String.valueOf(month);
        answer+=month;
        answer+="/";

        if(day<10)
        {
            answer+="0";
            temp=String.valueOf(day);
            answer+=temp;
        }
        else
        {
            temp=String.valueOf(day);
            answer+=temp;
        }




        return answer;
    }


}
