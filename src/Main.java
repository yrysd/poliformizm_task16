import Animals.Animal;
import Animals.Eagle;
import Animals.Shark;
import Animals.Turtle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Eagle("Burut", 6),
                new Eagle("Taz", 6),
                new Turtle("Tash", 3),
                new Turtle("Baka", 7),
                new Shark("Akkula", 5),
                new Shark("Balta bash", 7)};
        System.out.println("GetClass");
        for (Animal animal :animals) {
            if(animal.getClass().equals(Eagle.class)){
                animal.fly();
            } else if (animal.getClass().equals(Shark.class)) {
                animal.fly();

            }else if(animal.getClass().equals(Turtle.class)){
                animal.swim();
            }

        }
        System.out.println("InstanceOf");
        animals(animals);


        }
        public static void animals(Animal [] animals){
        int sharkCounter = 0;
        int eagleCounter =0;
        int turtleCounter = 0;
            for (Animal animal :animals) {
                if(animal instanceof Eagle) eagleCounter++;
                else if(animal instanceof Turtle) turtleCounter++;
                else if(animal instanceof Shark) sharkCounter++;
                Animal [] eagles = new Animal[eagleCounter];
                Animal [] sharks = new Animal[sharkCounter];
                Animal [] turtles = new Animal[turtleCounter];

                for (int i = 0; i < animals.length; i++) {
                    for (int j = 0; j < eagles.length; j++) {
                        if(animal instanceof Eagle) eagles[j] = animals[i];

                    }
                    for (int j = 0; j < turtles.length; j++) {
                        if(animal instanceof Turtle) turtles[j] = animals[i];

                    }
                    for (int j = 0; j < sharks.length; j++) {
                        if(animal instanceof Shark) sharks[j] = animals[i];

                    }

                }
                System.out.println("turtle : "+Arrays.toString(turtles));
                System.out.println("eagle : "+Arrays.toString(eagles));
                System.out.println("shark : "+Arrays.toString(sharks));

            }
        }
    }

