
package coffeeshop;

import java.text.NumberFormat;

public class JuiceItem {
    
    private int P_ID;
    private String P_NAME;
    private int QUANTITY;
    private float UNIT_PRICE;
    private int PREFERENCE;

    public JuiceItem(int P_ID, String P_NAME, int QUANTITY, float UNIT_PRICE, int PREFERENCE) {
        this.P_ID = P_ID;
        this.P_NAME = P_NAME;
        this.QUANTITY = QUANTITY;
        this.UNIT_PRICE = UNIT_PRICE;
        this.PREFERENCE = PREFERENCE;
    }

    public int getPREFERENCE() {
        return PREFERENCE;
    }

    public void setPREFERENCE(int PREFERENCE) {
        this.PREFERENCE = PREFERENCE;
    }

    public int getP_ID() {
        return P_ID;
    }

    public void setP_ID(int P_ID) {
        this.P_ID = P_ID;
    }

    public String getP_NAME() {
        return P_NAME;
    }

    public void setP_NAME(String P_NAME) {
        this.P_NAME = P_NAME;
    }

    public int getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(int QUANTITY) {
        this.QUANTITY = QUANTITY;
    }

    public float getUNIT_PRICE() {
        return UNIT_PRICE;
    }

    public void setUNIT_PRICE(float UNIT_PRICE) {
        this.UNIT_PRICE = UNIT_PRICE;
    }

    @Override
    public String toString() {
        
        NumberFormat nf=NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(2);
        
        return P_ID+ " - " + P_NAME + " - Rs"+nf.format(UNIT_PRICE) + "  " + "[Quantity-"+ QUANTITY+"]";
    }
    
    
    
}
