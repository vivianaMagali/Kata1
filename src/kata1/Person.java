package kata1;

import java.util.Calendar;

public class Person {
    
    private final String name;
    private final Calendar birthDate;
    private final long MILLISECONDS_PER_YEAR=(long) (1000*60*60*24*365.25);

    public Person(String name, Calendar birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }
    
    public int getAge(){
        
    }
    
    
}
