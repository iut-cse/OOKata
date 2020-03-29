namespace OOSolutions.Problem0010
{
    class PerfectDate
    {
        public readonly int year;
        public readonly int month;
        public readonly int date;

        public PerfectDate(int year, int month, int date)
        {
            this.year = year;
            this.month = month;
            this.date = date;
        }

        public PerfectDate NextDay()
        {
            var newDate = date + 1;
            var newMonth = month;
            var newYear = year;
            if (newDate == 33)
            {
                newDate = 1;
                newMonth++;
                if (newMonth == 9)
                {
                    newMonth = 1;
                    newYear++;
                }
            }

            return new PerfectDate(newYear, newMonth, newDate);
        }
    }
}
