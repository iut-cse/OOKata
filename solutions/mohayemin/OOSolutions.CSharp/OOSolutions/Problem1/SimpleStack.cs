namespace OOSolutions.Problem1
{
    public class SimpleStack<T>
    {
        private T[] container;
        private int topIndex;

        public SimpleStack(int size)
        {
            container = new T[size];
        }

        public void Push(T item)
        {
            topIndex++;
            container[topIndex] = item;
        }

        public T Pop()
        {
            T item = container[topIndex--];
            return item;
        }
    }
}
