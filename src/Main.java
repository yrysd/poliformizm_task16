import Animals.Animal;
import Animals.Eagle;
import Animals.Shark;
import Animals.Turtle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Eagle(), new Shark(), new Turtle()};

        System.out.println("GetClass");
        for (Animal animal : animals) {
            if (animal.getClass().equals(Eagle.class)) {
                animal.name();
                ((Eagle) animal).eat();

            } else if (animal.getClass().equals(Shark.class)) {
                animal.name();
                ((Shark) animal).eat();


            } else if (animal.getClass().equals(Turtle.class)) {
                animal.name();
                ((Turtle) animal).eat();
            }

        }

        System.out.println("InstanceOf ");
        Eagle eagle = new Eagle();
        if(eagle instanceof Eagle){
            eagle.name();
            eagle.eat();
        }
        Shark shark = new Shark();
        if(shark instanceof Shark){
            eagle.name();
            eagle.eat();
        }

        Turtle turtle = new Turtle();
        if(turtle instanceof Turtle){
            eagle.name();
            eagle.eat();
        }
       



    }
}