package March14_2020;

public class BicycleClass {
    String color;
    double size;
    public BicycleClass(String bicColor, double number){
        color=bicColor;
        size=number;
    }
     public void sppedBic(int speed){
        if (speed<15) {
            System.out.println("Go Fast");
        } else if (speed<25){
            System.out.println("Go Faster");
        }else if (speed<65){
            System.out.println("Go Slowly");
        }else{
            System.out.println("Slow down");
        }

    }

    public static void main(String[] args) {
        BicycleClass bicycle = new BicycleClass("white", 5.6);
        System.out.println(bicycle.color+" , "+ bicycle.size);
        bicycle.sppedBic(35);
    }
}
