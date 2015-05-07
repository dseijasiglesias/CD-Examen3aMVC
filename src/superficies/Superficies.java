package superficies;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @version 2.0
 * @author Daniel Seijas
 */
public class Superficies {
    
    /**
     * Runnable Method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelo mod = new Modelo();
        Vista.askType(mod);
        
        Superficies.shapeType(mod);
    }
    
    /**
     * Metodo que contiene la logica del programa
     * segun el tipo de objeto que el usuario a pedido clacular su area, 
     * el metodo tras un switch hará llamamientos a la clase vista para pedir 
     * al usuario que introduzca manualmente distintos datos para poder calcular
     * el area del objeto que a pedido con anterioridad
     * @param mod Objeto Modelo
     */
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