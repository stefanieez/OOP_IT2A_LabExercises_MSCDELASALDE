package AgriConnect;

public class Farmers {
    private String name;
    private String location;

    public Farmers(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("Farmer Name: " + name);
        System.out.println("Location: " + location);
    }
}
