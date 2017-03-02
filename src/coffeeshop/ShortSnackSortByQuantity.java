
package coffeeshop;

import java.util.Comparator;

public class ShortSnackSortByQuantity implements Comparator<ShortSnackItem>{

    @Override
    public int compare(ShortSnackItem o1, ShortSnackItem o2) {
        
         if(o1.getQUANTITY()< o2.getQUANTITY())
            return -1;
        
        else if(o1.getQUANTITY()== o2.getQUANTITY())
            return 0;
        
        else
            return 1;
    }
    
    
    
}
