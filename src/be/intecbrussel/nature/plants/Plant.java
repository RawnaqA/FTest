package be.intecbrussel.nature.plants;

public class Plant {
    private String name;
    private double height;
    private Colour colour;

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getColour() {
        return colour.toString();
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null || getClass()!=obj.getClass()){
            return false;
        }
        Plant other = (Plant) obj;
        if (name.equalsIgnoreCase(other.name)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Plant" + ", name=" + name + ", height=" + height + ", colour=" + colour;
    }
}