package Phone;


public class Stack {

    LinkedList list;

    public Stack()
    {
        list = new LinkedList();
    }

    public void push(String name, String phone, String relation)
    {
        list.addFromFirst(name, phone, relation);
    }

    public Node pop()
    {
        Node node = list.removeFromFirst();
        return node;
    }

    public void display()
    {
        list.display();
    }



}
