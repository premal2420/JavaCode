
public class ObjectExample  {
    public static void main(String[] args) {
        Myclass obj = new Myclass(10);
        knowName.printName(obj);

    }
}

class  Myclass {
    int x;
    Myclass(int x){
        this.x = x;
    }
}

class knowName{

    static void printName(Object obj)
    {
       Class c = obj.getClass();
       String name = c.getName();
        System.out.println("The class name= "+ name);

    }
}