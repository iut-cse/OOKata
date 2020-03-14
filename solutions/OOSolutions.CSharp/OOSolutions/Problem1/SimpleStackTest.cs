using System;
using Xunit;

namespace OOSolutions.Problem1
{
    public class SimpleStackTest
    {
        [Fact]
        void WithInt()
        {
            var stack = new SimpleStack<int>(3);
            stack.Push(3);
            stack.Push(15);

            Assert.Equal(15, stack.Pop());
            Assert.Equal(3, stack.Pop());
        }

        [Fact]
        void WithString()
        {
            var stack = new SimpleStack<string>(3);
            stack.Push("an item");
            stack.Push("another");

            Assert.Equal("another", stack.Pop());
            Assert.Equal("an item", stack.Pop());
        }

        [Fact]
        void WithDateTime()
        {
            var stack = new SimpleStack<DateTime>(3);
            stack.Push(new DateTime(2020, 1, 1));
            stack.Push(new DateTime(2020, 12, 12));

            Assert.Equal(new DateTime(2020, 12, 12), stack.Pop());
            Assert.Equal(new DateTime(2020, 1, 1), stack.Pop());
        }
    }
}
