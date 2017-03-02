
package coffeeshop;

import java.util.Comparator;

public class CoffeeSortByPrefernce implements Comparator<CoffeeItem>{

    @Override
    public int compare(CoffeeItem o1, CoffeeItem o2) {
        
        if(o1.getPREFERENCE()< o2.getPREFERENCE())
            return -1;
        
        else if(o1.getPREFERENCE()== o2.getPREFERENCE())
            return 0;
        
        else
            return 1;
    }
    
    
    
}
