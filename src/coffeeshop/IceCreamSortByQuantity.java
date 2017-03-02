
package coffeeshop;

import java.util.Comparator;

public class IceCreamSortByQuantity implements Comparator<IceCreamItem>{

    @Override
    public int compare(IceCreamItem o1, IceCreamItem o2) {
        
         if(o1.getQUANTITY()< o2.getQUANTITY())
            return -1;
        
        else if(o1.getQUANTITY()== o2.getQUANTITY())
            return 0;
        
        else
            return 1;
    }
    
    
    
}
