public class Plants {
    private String name;
    public Plants(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Polymorphic method
    public String getPlantType() {
        return "Unknown";
    }
}

// Subclass for Herbs
class Herb extends Plants {
    public Herb(String name) {
        super(name);
    }

    @Override
    public String getPlantType() {
        return "Herb";
    }
}

// Subclass for Trees
class Tree extends Plants {
    public Tree(String name) {
        super(name);
    }

    @Override
    public String getPlantType() {
        return "Tree";
    }
}

// Subclass for Shrubs
class Shrub extends Plants {
    public Shrub(String name) {
        super(name);
    }

    @Override
    public String getPlantType() {
        return "Shrub";
    }
}
