package floats;

import static java.lang.Math.abs;

public class aa {

    public static  void main(String [] args)
    {
        float a=0.2f;
        float b =0.1f;
        System.out.println(a*b);

        double c=0.2;
        double d=0.1;
        System.out.println(c*d);

        if(abs(0.2 * 3 - 0.6) < 1E-6)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
