public class Interfaces implements Cars  {
    public static void main(String [] args){

        Interfaces i = new Interfaces();
        i.start();

    }

    @Override
    public void start() {
        System.out.println("Car is started");
    }

}



interface Cars{
    void start();

}
