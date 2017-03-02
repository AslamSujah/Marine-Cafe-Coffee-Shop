
package coffeeshop;

import java.util.Comparator;

public class ShortSnackSortByPrefernce implements Comparator<ShortSnackItem>{

    @Override
    public int compare(ShortSnackItem o1, ShortSnackItem o2) {
        
        if(o1.getPREFERENCE()< o2.getPREFERENCE())
            return -1;
        
        else if(o1.getPREFERENCE()== o2.getPREFERENCE())
            return 0;
        
        else
            return 1;
    }
    
    
    
}
