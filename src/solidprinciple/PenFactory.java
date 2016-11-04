
package solidprinciple;


public class PenFactory {
    
    
    public static Pen get(String param){
        
        if(param.equalsIgnoreCase("B")){
            return new BallPen();
        }
        else if(param.equalsIgnoreCase("G")){
            return new GelPen();
        }
        else if(param.equalsIgnoreCase("I")){
            return new InkPen();
        }
        return null;
    }
    
}
