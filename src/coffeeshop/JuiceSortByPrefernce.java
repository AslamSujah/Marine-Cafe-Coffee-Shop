
package coffeeshop;

import java.util.Comparator;

public class JuiceSortByPrefernce implements Comparator<JuiceItem>{

    @Override
    public int compare(JuiceItem o1, JuiceItem o2) {
        
        if(o1.getPREFERENCE()< o2.getPREFERENCE())
            return -1;
        
        else if(o1.getPREFERENCE()== o2.getPREFERENCE())
            return 0;
        
        else
            return 1;
    }
    
    
    
}
