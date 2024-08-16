package August.ex_10082024.Encapsulation;

public class ICICIBank {
    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.
    //- Getter and Setter - help you to get or set the value via the methods only, not with the reference.
    //- Use Getter and Setter with Condition to secure your data members by methods
    //- Getter -> Fetch the data members - secure this also
    //- Setter-Update the value - secure this also (based on the condition)
    //- Uses of Getter and Setter
    //- Web Automation - Page Class
    //API Automation - Pojo Class

    //Advantages of Encapsulation
    //Data Hiding
    //Increased Flexibility: You can make the variables of the class read-only or write-only depending on your requirements.
    //Security

    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean isAdmin) {
        if(isAdmin) {
            this.name = name;
            System.out.println("Allowed!");
        }
        else{
            System.out.println("Not Allowed!");
        }
    }

    public long getBal(boolean isAdmin) {
        if (isAdmin){
            return bal;
        }
        else{
            return 0;
        }

    }

    public void setBal(long bal, boolean isAdmin) {
        if(isAdmin) {
            this.bal = bal;
            System.out.println("Allowed");
        }
        else {
            System.out.println("Not Allowed");
        }
    }
}
