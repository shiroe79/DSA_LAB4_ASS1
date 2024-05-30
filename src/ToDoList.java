public class ToDoList {
    private Node head;

    public ToDoList() {
        this.head = null;
    }

    public void addToDo(Task task){
        Node newTask = new Node(task);
        if(head == null){
            head = newTask;
        }else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newTask;
        }
        System.out.printf("Task: %s has been added to the ToDo list.",task.getTitle());
    }

    public void markToDoAsCompleted(String title){
        if (head == null){
            System.out.println("You have no ongoing tasks.");
            return;
        }
        Node current = head;
        while (current.next != null){
            if(current.task.getTitle().equals(title)){
                current.task.markCompleted();
                System.out.printf("%s has been completed!",title);
                return;
            }
            current = current.next;
        }
        System.out.println("The task is not in the ToDo list.\n" +
                "You can add it using the 'addToDo' method.");
    }

    public boolean isEmpty(){
        return head==null;
    }
    public void viewToDoList(){
        if (head == null){
            System.out.println("You have nothing in the ToDo list.");
            return;
        }
        Node current = head;
        System.out.println("Your to do list contains: ");
        while (current != null){
            System.out.println(current.task);
            current = current.next;
        }
    }
}
