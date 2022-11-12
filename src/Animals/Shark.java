package Animals;

public class Shark extends Animal{

    public void eat(){
        System.out.println("Eat : meat");
    }

    @Override
    public void name() {
        System.out.println("Name : Shark");
    }
}
