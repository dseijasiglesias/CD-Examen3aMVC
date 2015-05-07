package superficies;

import java.util.Scanner;

/**
 * @version 2.0
 * @author Daniel Seijas
 */
public class Vista {
    
    private static Scanner sc;
    
    
    public static void askType(Modelo mod){
        String shapeType;
        
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        sc = new Scanner(System.in);
        shapeType = sc.nextLine();
        
        mod.setShapeType(shapeType);
        
        System.out.println("You said: " + shapeType);
    }
    
    
}
