
public class Construction {
    boolean a;
    String m;
    double area;
    double total_cost=0.0;
    public Construction(boolean b,String s,double n){
        a=b;
        m=s;
        area=n;
    }
    public double construct() {
        if (!a) {
            if (m == "standard") {
                total_cost = 1200 * area;
            } else if (m == "above_standard") {
                total_cost = 1500 * area;
            } else if (m == "high_standard") {
                total_cost = 1800 * area;
            }
        } else if (a) {
            total_cost = 2500 * area;
        }

        return total_cost;
    }

}