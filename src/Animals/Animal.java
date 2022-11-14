package Animals;

public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void name(){

    }
    public void swim(){
        System.out.println("Turtle swims fast in water");
    }
    public void attack(){
        System.out.println("A shark a fish");
    }
    public void fly(){
        System.out.println("Eagle flies high");
    }

    @Override
    public String toString() {
        return "Name: "+name+"\n"+
                "Age: "+age;
    }
}
