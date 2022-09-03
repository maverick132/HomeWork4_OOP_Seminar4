import java.util.*;

public class TaskList implements Iterable<Task>{
    private List<Task> tasks;
    public TaskList(){
        this.tasks = new ArrayList<Task>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void deleteTask(int taskId) {
        this.tasks.remove(taskId);
    }
    public Task getTask(int taskId) {
        return this.tasks.get(taskId);
    }
    public void printTask() {
        for (Task t:tasks) {
            System.out.println(t);
        }
        System.out.println();
    }

    public void sortTask(){
        Collections.sort(tasks);
    }


    @Override
    public Iterator<Task> iterator() {
        Iterator<Task> it = new Iterator<Task>() {
            private int id = 0;

            @Override

            public boolean hasNext() {
                return id <tasks.size();
            }

            @Override
            public Task next() {
                return tasks.get(id++);
            }
        };
        return it;
    }
}
