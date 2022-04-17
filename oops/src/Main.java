import encapsulation.Encapsulation;

public class Main {
    public static void main(String [] args){
        //object
        Person p1 = new Person();
        p1.name = "Rohit";
        p1.age = 20;

        Person p2 = new Person("premal",23);
        //p2.name = "Rohan";
        //p2.age = 21;

        System.out.println(p1.name+" "+ p1.age);
        System.out.println(p2.name+" "+p2.age);

        //Method
        p1.walk();
        p2.eat();

        //argument
        p1.walk(2);

        System.out.println(Person.count);

        Developer d1 = new Developer("utkarsh",15);
        d1.walk();

        Encapsulation obj = new Encapsulation();
        obj.doWork();
    }
}

//inheritance
class Developer extends Person{
    public Developer(String name, int age) {
        super(name, age);// super keyword use for parent construction call
    }
    void walk(){
        System.out.println("Developer " + name + " is walking.");
    }
}

class Person {
    String name;
    int age;

// static keyword is used for class property direct access
   static int count;

    // default construction
    public Person(){
        count++;
        System.out.println("Creating an object");
    }

    //initialize
    public Person(String name, int age){
        this();//one construction to another construction call
       this.name = name; // this keyword use for  perameter access
        this.age = age;
    }

    void walk(){
        System.out.println(name+" is walking.");
    }

    void eat(){
        System.out.println(name+" is eating.");
    }

    //argument

    void walk(int steps){
        System.out.println(name +" walked "+ steps + " steps");
    }

    void doWork(){
        System.out.println("person is worked");
    }

}