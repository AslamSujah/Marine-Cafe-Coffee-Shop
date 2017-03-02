
package coffeeshop;

import java.util.Comparator;

public class CakeSortByPrefernce implements Comparator<CakeItem>{

    @Override
    public int compare(CakeItem o1, CakeItem o2) {
        
        if(o1.getPREFERENCE()< o2.getPREFERENCE())
            return -1;
        
        else if(o1.getPREFERENCE()== o2.getPREFERENCE())
            return 0;
        
        else
            return 1;
    }
    
    
    
}
