import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong(), b=sc.nextLong(), c=sc.nextLong();
        long m=Math.max(a,Math.max(b,c));
        long x=0,y=0,z=0;
        if(a!=m) 
        x=Math.abs(m-a)+1;
        if(b!=m)
        y=Math.abs(m-b)+1;
        if(c!=m)
        z=Math.abs(m-c)+1;
        System.out.println(x+" "+y+" "+z);
    }
}