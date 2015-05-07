package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @version 2.0
 * @author Daniel Seijas
 */
public class Superficies {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelo mod = new Modelo();
        Vista.askType(mod);
        
        Superficies.shapeType(mod);
        
        

    }
    
    public static void shapeType(Modelo mod){
        String shapeType = mod.getShapeType();
        float area;
        
        switch(shapeType.toLowerCase()){
            
            case "square":
                Vista.sideLenght(mod);
                
                area = (float) Math.pow(mod.getLength(), mod.getLength());
                mod.setArea(area);
                
                Vista.showArea(mod);
                break;
            
            case "rectangle":
                
                break;
            
            case "triangle":
                
                break;
            
            case "circle":
                Vista.askRadius(mod);
                
                area = mod.getRadius() * mod.getRadius();
                area = (float) (3.14159265 * area);
                mod.setArea(area);
                
                Vista.showArea(mod);
                break;
            
        }
        
        if (shapeType.equals("rectangle")) {
            //add area calculations for rectangle here
            
            System.out.println("what is the rectangles width?");
            sideLength = sc.nextFloat();
            System.out.println("What is the rectangles height?");
            sideHeight = sc.nextFloat();
            rectangleArea = sideLength * sideHeight;
            System.out.println("The area for your rectangle is: " + rectangleArea);

        }
        if (shapeType.equals("triangle")) {
            //add area calculations for triangle here


            System.out.println("What is the base length of the triangle?");
            baseLength = sc.nextFloat();
            System.out.println("What is the height of the triangle?");
            height = sc.nextFloat();
            triangleArea = (float) (0.5 * baseLength * height);
            System.out.println("Your triangles area is: " + triangleArea);

        }
        
    }
    
}
