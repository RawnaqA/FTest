package be.intecbrussel.nature.animals;

import be.intecbrussel.nature.plants.Plant;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal {
    private Set<Plant> plantDiet;
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
        plantDiet=new HashSet<>();
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        plantDiet=new HashSet<>();

    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }
    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return "Omnivore "+ super.toString() +", plantDiet=" + plantDiet + ", maxFoodSize=" + maxFoodSize+"\n";
    }
}
