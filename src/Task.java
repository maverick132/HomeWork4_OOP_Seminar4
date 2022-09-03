import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task<E> implements Comparable<Task>{

    private E id ;
    private final Date dateTask;
    private Calendar deadLine;
    private User user;
    private final Priority priority;
    private String whatTheTask;

    public Task(Calendar deadLine, User user, Priority priority,E id){
        this(deadLine,user, priority, id, "");
    }
    public Task(Calendar deadLine, User user, Priority priority,E id, String whatTheTask){
        this.dateTask = new GregorianCalendar().getTime();
        this.deadLine = deadLine;
        this.user = user;
        this.priority = priority;
        this.id = id;
        this.whatTheTask = whatTheTask;
    }

    public Date getDateTask() {
        return dateTask;
    }

    public Calendar getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Calendar deadLine) {
        this.deadLine = deadLine;
    }

    public User getUser() {
        return user;
    }
    public E getId(){
        return this.id;
    }
    public Priority getPriority(){
        return this.priority;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public void stringToTask(String s){

    }

    @Override
    public String toString(){
        return String.format("ID:%d, Создан:%tc, Сделать до:%td, Пользователь:%s, Приоритет:%s", this.id,
                this.dateTask, this.deadLine, this.user, this.priority);
    }

    @Override
    public int compareTo(Task o) { // Продумать если id будет не int
        switch (this.priority){
            case Low -> {
             switch (o.priority){
                 case Low -> {
                     return Integer.compare((Integer) o.id, (Integer) this.id);
                 }
                 case Medium, HIGH -> {
                     return 1;
                 }
                 }
             }
            case Medium -> {
                switch (o.priority){
                    case Low -> {
                        return -1;
                    }
                    case Medium -> {
                        return Integer.compare((Integer) o.id, (Integer) this.id);
                    }
                    case HIGH -> {
                        return 1;
                    }
                }
            }
            case HIGH ->                 {
                switch (o.priority){
                    case Low, Medium -> {
                        return -1;
                    }
                    case HIGH -> {
                        return Integer.compare((Integer) o.id, (Integer) this.id);
                    }
                }
            }

        }
        return Integer.compare((Integer) o.id, (Integer) this.id);
    }

    public String getWhatTheTask() {
        return whatTheTask;
    }

    public void setWhatTheTask(String whatTheTask) {
        this.whatTheTask = whatTheTask;
    }
}
