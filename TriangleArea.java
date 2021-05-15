import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
      System.out.println("Specify base and height of...       (For example: 20.0 5.0)");
      System.out.println("Triangle 1:");
      triangle1.setBase(scnr.nextDouble());
      triangle1.setHeight(scnr.nextDouble());
      
      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
      System.out.println("Triangle 2:");
      triangle2.setBase(scnr.nextDouble());
      triangle2.setHeight(scnr.nextDouble());
      
      // TODO: Determine larger triangle (use getArea())
      double areaTri1 = triangle1.getArea();
      double areaTri2 = triangle2.getArea();

      // TODO: Output larger triangle's info (use printInfo())
      System.out.println();
      System.out.println("Triangle with larger area:");
      if (areaTri1 > areaTri2) {
         triangle1.printInfo();
      } else {
         triangle2.printInfo();
      }

      
   }
}
