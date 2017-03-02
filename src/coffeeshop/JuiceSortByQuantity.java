
package coffeeshop;

import java.util.Comparator;

public class JuiceSortByQuantity implements Comparator<JuiceItem>{

    @Override
    public int compare(JuiceItem o1, JuiceItem o2) {
        
         if(o1.getQUANTITY()< o2.getQUANTITY())
            return -1;
        
        else if(o1.getQUANTITY()== o2.getQUANTITY())
            return 0;
        
        else
            return 1;
    }
    
    
    
}
