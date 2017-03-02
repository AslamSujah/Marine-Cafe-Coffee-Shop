
package coffeeshop;

import java.util.Comparator;

public class IceCreamSortByPrefernce implements Comparator<IceCreamItem>{

    @Override
    public int compare(IceCreamItem o1, IceCreamItem o2) {
        
        if(o1.getPREFERENCE()< o2.getPREFERENCE())
            return -1;
        
        else if(o1.getPREFERENCE()== o2.getPREFERENCE())
            return 0;
        
        else
            return 1;
    }
    
    
    
}
