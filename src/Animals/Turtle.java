package Animals;

public class Turtle extends Animal{

    public void eat(){
        System.out.println("Eat : fruit");
        System.out.println("\n");
    }
    @Override
    public void name() {
        System.out.println("Name : Turtle");
    }
}
