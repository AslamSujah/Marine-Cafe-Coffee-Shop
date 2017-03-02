
package coffeeshop;

import java.util.Comparator;

public class CakeSortByQuantity implements Comparator<CakeItem>{

    @Override
    public int compare(CakeItem o1, CakeItem o2) {
        
         if(o1.getQUANTITY()< o2.getQUANTITY())
            return -1;
        
        else if(o1.getQUANTITY()== o2.getQUANTITY())
            return 0;
        
        else
            return 1;
    }
    
    
    
}
