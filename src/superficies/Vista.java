package superficies;

import java.util.Scanner;

/**
 * @version 2.0
 * @author Daniel Seijas
 */
public class Vista {
    
    private static Scanner sc;
    
    /**
     * Pregunta al usuario que tipo de area desea calcular
     * pide que se introduzca por teclado el tipo de objeto, a calcular su area, en ingles
     * @param mod Objeto Modelo
     */
    public static void askType(Modelo mod){
        String shapeType;
        
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        sc = new Scanner(System.in);
        shapeType = sc.nextLine();
        
        mod.setShapeType(shapeType);
        
        System.out.println("You said: " + shapeType);
    }
    
    /**
     * Metodo comun para mostrar el area calculada previamente
     * @param mod Objeto Modelo
     */
    public static void showArea(Modelo mod){
        System.out.println("The area for your " + mod.getShapeType() + ": " + mod.getArea());
    }
    
    /**
     * Metodo que pide la longitud del lado
     * @param mod Objeto Modelo
     */
    public static void sideLenght(Modelo mod){
        System.out.println("what is the side length?");
        mod.setLength(sc.nextFloat());
    }
    
    /**
     * Metodo que pide el radio de la circunferencia
     * @param mod Objeto Modelo
     */
    public static void askRadius(Modelo mod){
        System.out.println("What is the radius of the circle?");
        mod.setRadius(sc.nextFloat());
    }
    
    /**
     * Metodo para pidir la base del triangulo
     * @param mod Objeto Modelo
     */
    public static void askBase(Modelo mod){
        System.out.println("What is the base length of the triangle?");
        mod.setLength(sc.nextFloat());
    }
    
    /**
     * metodo para pedir la altura del triangulo
     * @param mod Objeto Modelo
     */
    public static void askHeight(Modelo mod){
        System.out.println("What is the height of the triangle?");
        mod.setHeight(sc.nextFloat());
    }
    
    /**
     * Metodo para pedir el ancho del rectangulo
     * @param mod Objeto Modelo
     */
    public static void askWidth(Modelo mod){
        System.out.println("what is the rectangles width?");
        mod.setLength(sc.nextFloat());
    }
    
    /**
     * Metodo para pedir el alto el triangulo
     * @param mod Objeto Modelo
     */
    public static void askRHeight(Modelo mod){
        System.out.println("What is the rectangles height?");
        mod.setHeight(sc.nextFloat());
    }
    
    
}
