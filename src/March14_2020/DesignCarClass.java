package March14_2020;

public class DesignCarClass {
    int modelYear;
    String modelName;
    double modelPrice;
    public DesignCarClass(int year, String Name, double price){
        modelYear=year;
        modelName= Name;
        modelPrice= price;
    }
    public static void main(String[] args) {
        DesignCarClass myCar1 = new DesignCarClass(2020, "BMW", 60000);
        DesignCarClass myCar2 = new DesignCarClass(2020, "Mercedess", 80000);
        System.out.println(myCar1.modelName+ "\tVS\t"+myCar2.modelName);
        System.out.println(myCar1.modelPrice+ "\tVS\t"+myCar2.modelPrice);
        System.out.println(myCar1.modelYear+"\tVS\t"+myCar2.modelYear);

        }
    }

