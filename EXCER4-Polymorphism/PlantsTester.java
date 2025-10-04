public class PlantsTester {
    public static void main(String[] args) {
        // Polymorphism: all references are type Plant
        Plants p1 = new Herb("Rosemary");
        Plants p2 = new Tree("Acacia");
        Plants p3 = new Shrub("Rose");

        // Same method call, different outputs (polymorphism in action)
        System.out.println("Plant 1: " + p1.getName() + " - " + p1.getPlantType());
        System.out.println("Plant 2: " + p2.getName() + " - " + p2.getPlantType());
        System.out.println("Plant 3: " + p3.getName() + " - " + p3.getPlantType());
    }
}