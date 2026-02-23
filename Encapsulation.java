//Binding the data and code together into a single unit and restricting direct access to same of the object's components.
class Human {
    private int age = 21;
    private String name = "Kushal";
    // to use private data we have to create public method, within the same class.

    public int getAge() { // to get the value opf the age.
        return age;
    }

    public void setAge(int a) { // to set the value of the age.
        age = a;
    }

    public String getName() { // to get the value of the name.
        return name;
    }

    public void setName(String a) { // to set the value of the name.
        name = a;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human man = new Human();

        System.out.println("Name of first person is: " + man.getName());
        System.out.println("Age of first person is: " + man.getAge());

        man.setName("Virat");
        man.setAge(36);

        System.out.println("Name of second person is: " + man.getName());
        System.out.println("Age of second person is: " + man.getAge());
    }
}
