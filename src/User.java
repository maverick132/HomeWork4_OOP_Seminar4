import java.util.Calendar;

public class User {
    private String firstName;
    private String lastName;
    private String middleName;

    public User(String firstName, String lastName, String middleName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public User(String firstName, String lastName){
        this(firstName,lastName,"-");
    }
    public User(String firstName){
        this(firstName,"-");
    }

    @Override
    public String toString(){
        return String.format("%s %s %s", this.lastName, this.firstName, this.middleName);
    }
}
