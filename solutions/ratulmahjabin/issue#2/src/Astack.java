public class Astack<Titem> {

    private Object[] container;
    private int topIndex;

    public Astack(int size)
    {
        container = new Object[size];
    }

    public void push(Titem item)
    {
        container[++topIndex] = item;
    }

    public Titem pop()
    {
        return (Titem)container[topIndex--];
    }
}
