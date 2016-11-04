
package solidprinciple;


public class SolidPrinciple {

    
    public static void main(String[] args) {
        
        
        Pen pn= PenFactory.get("B");
       pn.write();
        
        
    }
    
}
