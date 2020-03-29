using Xunit;

namespace OOSolutions.Problem0010
{
    public class PerfectDateTest
    {
        [Fact]
        void ARegularDay()
        {
            var next = new PerfectDate(1813, 1, 3).NextDay();
            Assert.Equal(4, next.date);
            Assert.Equal(1, next.month);
            Assert.Equal(1813, next.year);
        }

        [Fact]
        void LastDayOfMonth()
        {
            var next = new PerfectDate(1813, 1, 32).NextDay();
            Assert.Equal(1, next.date);
            Assert.Equal(2, next.month);
            Assert.Equal(1813, next.year);
        }

        [Fact]
        void LastDayOfYear()
        {
            var next = new PerfectDate(1813, 8, 32).NextDay();
            Assert.Equal(1, next.date);
            Assert.Equal(1, next.month);
            Assert.Equal(1814, next.year);
        }
    }
}
