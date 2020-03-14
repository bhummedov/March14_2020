package March14_2020;

public class ShippingOverload {
    public static void main(String[] args) {
        calculatecost(90,14);
        calculatecost(90,11.3,14);

    }public static void calculatecost( double baseprice, double tax){
        double costprodct=(baseprice+tax)*1.1;
        System.out.println(costprodct);

    }public static void calculatecost(double baseprice,double shipping, double tax){
        double costproduct=(baseprice+tax)*1.1+shipping;
        System.out.println(costproduct);
    }
}
