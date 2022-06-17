package be.intecbrussel.nature.app;

import be.intecbrussel.nature.ForestNotebook;
import be.intecbrussel.nature.animals.Animal;
import be.intecbrussel.nature.animals.Carnivore;
import be.intecbrussel.nature.animals.Herbivore;
import be.intecbrussel.nature.animals.Omnivore;
import be.intecbrussel.nature.plants.*;


import java.util.Comparator;

public class App {
    public static void main(String[] args) {

        ForestNotebook notebook = new ForestNotebook();
        //5 plants
        Bush bush = new Bush("Lilac",80);
        bush.setColour(Colour.BLUE);
        bush.setFruit("Lili");
        bush.setLeafType(LeafType.HEART);

        Flower flower = new Flower("steenbloem", 50);
        flower.setColour(Colour.RED);
        flower.setSmell(Scent.SWEET);

        Tree tree = new Tree("Eik",300);
        tree.setColour(Colour.BROWN);
        tree.setLeafType(LeafType.ROUND);

        Weed weed = new Weed("Wewe",30);
        weed.setColour(Colour.GREEN);
        Flower flower1 = new Flower("Rose", 100);
        flower1.setColour(Colour.YELLOW);
        flower1.setSmell(Scent.ORANGE);

        notebook.addPlant(bush);
        notebook.addPlant(flower);
        notebook.addPlant(tree);
        notebook.addPlant(weed);
        notebook.addPlant(flower1);

        //9 animals
        Omnivore omnivore1 = new Omnivore("Bear", 200, 250, 100);
        omnivore1.setDecibel(10);
        Omnivore omnivore2 = new Omnivore("Dog", 50, 50, 50);
        //Omnivore omnivore2 = new Omnivore("Bear", 80, 50, 50);

        omnivore2.setDecibel(100);
        Omnivore omnivore3 = new Omnivore("Cat", 20, 30, 60);
        omnivore3.setDecibel(70);

        Carnivore carnivore1 = new Carnivore("Lion", 200, 150, 80);
        carnivore1.setDecibel(80);
        Carnivore carnivore2 = new Carnivore("Tiger", 250, 180, 90);
        carnivore2.setDecibel(40);
        Carnivore carnivore3 = new Carnivore("Alligator", 300, 150, 50);
        carnivore3.setDecibel(60);

        Herbivore herbivore1 = new Herbivore("Cow", 200, 150, 80);
        herbivore1.setDecibel(5);
        Herbivore herbivore2 = new Herbivore("Duck", 20, 50, 20);
        herbivore2.setDecibel(105);
        Herbivore herbivore3 = new Herbivore("Goat", 100, 90, 50);
        herbivore3.setDecibel(55);

        notebook.addAnimal(omnivore1);
        notebook.addAnimal(omnivore2);
        notebook.addAnimal(omnivore3);

        notebook.addAnimal(carnivore1);
        notebook.addAnimal(carnivore2);
        notebook.addAnimal(carnivore3);

        notebook.addAnimal(herbivore1);
        notebook.addAnimal(herbivore2);
        notebook.addAnimal(herbivore3);

        notebook.printNotebook();

        System.out.println("plantCount= " + notebook.getPlantCount());
        System.out.println("animalCount= " + notebook.getAnimalCount());

        // lists of carnivores, omnivores and herbivores
        System.out.println("Omnivores:\n"+notebook.getOmnivores());
        System.out.println("Carnivores:\n"+notebook.getCarnivores());
        System.out.println("Herbivores:\n"+notebook.getHerbivores());
        //sort
        notebook.sortAnimalsByName();
        notebook.sortPlantsByName();
        System.out.println(" sort animals and plants by name:");
        notebook.printNotebook();


        System.out.println("sort plants by colour");
        notebook.sortPlantsByColour();
        notebook.printNotebook();

        System.out.println("Sort animals by sound");
        notebook.getAnimals().stream()
                .sorted(Comparator.comparing(Animal::getDecibel).reversed())
                .filter(animal -> animal.getDecibel()>50)
                .forEach(System.out::println);




    }
}
