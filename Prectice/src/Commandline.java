public class Commandline {
    public static double main(String [] args) {
        int n = args.length;
        System.out.println("No of args is :"+n);

        System.out.println("args is :");
        for (int i=0;i<n;i++)
            System.out.println( args[i]);

        String s1 = args[0];
        String s2 = args[1];

        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);

        double c = a+b;
        return c;

    }
}
