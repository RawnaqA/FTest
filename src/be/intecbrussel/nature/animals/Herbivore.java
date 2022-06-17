package be.intecbrussel.nature.animals;

import be.intecbrussel.nature.plants.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal{
    private Set<Plant> plantDiet;

    public Herbivore(String name) {
        super(name);
        plantDiet=new HashSet<>();
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        plantDiet=new HashSet<>();
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
    }
    public void printDiet(){
        System.out.println(plantDiet);
    }
    @Override
    public String toString(){
        return "Herbivore "+ super.toString()+ ", plantDiet=" + plantDiet+"\n";
    }
}
