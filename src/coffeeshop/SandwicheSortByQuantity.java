
package coffeeshop;

import java.util.Comparator;

public class SandwicheSortByQuantity implements Comparator<SandwicheItem>{

    @Override
    public int compare(SandwicheItem o1, SandwicheItem o2) {
        
         if(o1.getQUANTITY()< o2.getQUANTITY())
            return -1;
        
        else if(o1.getQUANTITY()== o2.getQUANTITY())
            return 0;
        
        else
            return 1;
    }
    
    
    
}
