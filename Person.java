import java.util.Date;          //Date class for dates
import java.util.LinkedHashSet; //LinkedHashSet for hobbies

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String nickname;
    private Date birthday;
    private int phoneNumber;

    public Person(int id, String f, String l) {
        this.id = id;
        this.firstName = f;
        this.lastName = l;
        this.nickname = null;
        this.birthday = null;
        this.phoneNumber = -1;
        this.hobbies = new LinkedHashSet<Integer>();

    }
    public void setFirstName(String a) {
        this.firstName = a;
    }
    public void setLastName(String a) {
        this.lastName = a;
    }
    public void setNickname(String a) {
        this.nickname = a;
    }
    public void setBirthday(Date a) {
        this.birthday = a;
    }
    public void setPhoneNumber(int a) {
        this.phoneNumber = a;
    }
}
