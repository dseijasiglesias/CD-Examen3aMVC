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
                Vista.askWidth(mod);
                Vista.askRHeight(mod);
                
                area = mod.getLength() * mod.getHeight();
                mod.setArea(area);
                
                Vista.showArea(mod);
                break;
            
            case "triangle":
                Vista.askBase(mod);
                Vista.askHeight(mod);
                
                area = (float) (0.5 * mod.getLength() * mod.getHeight());
                mod.setArea(area);
                
                Vista.showArea(mod);
                break;
            
            case "circle":
                Vista.askRadius(mod);
                
                area = mod.getRadius() * mod.getRadius();
                area = (float) (3.14159265 * area);
                mod.setArea(area);
                
                Vista.showArea(mod);
                break;
            
        }
        
    }
    
}