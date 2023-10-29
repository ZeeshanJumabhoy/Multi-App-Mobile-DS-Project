package Phone;

public class Queue {
    LinkedList list1;

    public Queue () {

        list1 = new LinkedList();
    }
    public void enqueue (String name, String phone, String relation) {
        list1.add(name, phone, relation);
    }
    public Node dequeue () {
        Node node = list1.removeFromFirst();
        return node;
    }
    public void display()
    {
        list1.display();
    }


}
