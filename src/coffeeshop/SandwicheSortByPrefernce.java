
package coffeeshop;

import java.util.Comparator;

public class SandwicheSortByPrefernce implements Comparator<SandwicheItem>{

    @Override
    public int compare(SandwicheItem o1, SandwicheItem o2) {
        
        if(o1.getPREFERENCE()< o2.getPREFERENCE())
            return -1;
        
        else if(o1.getPREFERENCE()== o2.getPREFERENCE())
            return 0;
        
        else
            return 1;
    }
    
    
    
}
