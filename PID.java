import java.util.Scanner;

public class PID
{
    public static void main (String args[])
    {
        double Kp=1;
        double Ki=1;
        double Kd=1;
        double we=0;
        double wy;
        double e=0;
        double T=1;

        for(int i =2; i<100;i++)
        {
            wy=e*(Kp+Ki*(T/2)*(i+1)/(i-1)+Kd*(i-1)/(T*i));
            e=we-wy;
            if(i>2)
                we=1;

        }
    }
}