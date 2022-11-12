package Animals;

public class Eagle extends Animal{
    public void eat(){
        System.out.println("Eat : meat");
    }

    @Override
    public void name() {
        System.out.println("Name : Eagle");
    }
}
