import java.util.Locale;
import java.util.Objects;

public class Person {
    private String fName;
    private String lName;

    public Person(String fName, String lName) {
        setfName(fName);
        setlName(lName);
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName.toLowerCase();
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName.toLowerCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(fName, person.fName) && Objects.equals(lName, person.lName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName);
    }

    public void restDay(int dayNumber) throws Exception {
        if (dayNumber < 1 || dayNumber > 7) {
            throw new Exception("Invalid day number");
        }
        if (dayNumber != 6 && dayNumber != 7) {
            throw new Exception("Sorry, you need to tech in TLV");
        }
        System.out.println("Enjoy the weekend");
    }
}

