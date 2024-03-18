public class Person {

    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }


    public void assignName() {
        if (age == 8)
            name = "Aarya";
        else if (age == 13)
            name = "Aadhya";
        else if (age == 40)
            name = "Pinal/Jatin";
        else
            name = "Stranger!";
    }


}