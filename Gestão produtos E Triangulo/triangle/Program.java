package triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
     
      Triangle x,y;
      x = new Triangle();
      y = new Triangle();
        String a = "s";
      
      while( a == "s"){
        System.out.println("Enter the measures of Triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println();
        System.out.println("Enter the measures of Triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
      
        double areax = x.area();
        double areay = y.area();
        
        System.out.println("====================================");
        System.out.printf("Triangle X area: %.4f%n", areax);
        System.out.printf("Triangle Y area: %.4f%n", areay);
        System.out.println("====================================");    
        if(areax > areay){
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area: Y");
        }
        
          System.out.println("You wanna repeat this ??[S/N] ");
          a = sc.next().toLowerCase().substring(0,1);
            if(a.toLowerCase().equals("n")){
                a = "n";
            }else{
                a = "s";
            }
      }
      sc.close();
    }
}
