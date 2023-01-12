public class stack {
    private int[] elements;
    private int top;
    private int max;

    stack(int size) {
        elements = new int[size];
        top = 0;
        max = size;//max ı boyuta eşitleriz
    }

    public void push(int element)//eleman eklemek için 
    {
        if(!isFull()){//stack full ise yani yeni gelecek ekemana yer yoksa
            elements[top] = element;//yeni gelen elemanı element adındaki ye ni yere koyarız
            top++;
        }
        }

    public int pop() {//stack den eleman silmek için
        top--;
        return elements[top];

    }

    public int peek() {
        return elements[top];

    }

    public boolean isEmpty() {
        if (top > 0)
            return true;
        else
            return false;

    }

    public boolean isFull() {//stack in full olup olmadğına bakılır
        if (top == max)//top maxa eşit ise stack full yani true gönderir
            return true;
        else
            return false;//değilse stack de yer olduğnu belirtir
    }

    public int size() {
        return top;
    }

    public void list()
        {
            for(int i = max - 1; i >=0;i--)
            {
                if(elements[i] !=0)
                    System.out.print(elements[i] + " ");
        }

    }
}