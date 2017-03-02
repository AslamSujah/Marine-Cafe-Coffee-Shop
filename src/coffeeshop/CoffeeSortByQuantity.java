
package coffeeshop;

import java.util.Comparator;

public class CoffeeSortByQuantity implements Comparator<CoffeeItem>{

    @Override
    public int compare(CoffeeItem o1, CoffeeItem o2) {
        
         if(o1.getQUANTITY()< o2.getQUANTITY())
            return -1;
        
        else if(o1.getQUANTITY()== o2.getQUANTITY())
            return 0;
        
        else
            return 1;
    }
    
    
    
}
