public class Methodoverloading {
	
    static int addition(int a,int b) //creating method
     {
         return a+b;
     }
     static int addition(int a,int b,int c) //creating method
     {
         return a+b+c;
     }
     static double addition(double a,double b,int c) //creating method
     {
         return a+b+c;
     }

     public static void main(String[] args) {
        System.out.println(addition(2,3,4));
        System.out.println(addition(2.1,3.2,4));
        System.out.println(addition(2,3));

     }
}