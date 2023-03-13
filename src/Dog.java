public class Dog extends Animal{

    String passportNumber;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void getDescription() {
        System.out.println("Собака - лучший друг человека");
    }

    @Override
    public void printName(){
        System.out.println("Dog " + name);
    }

    @Override
    public void makeNoise (){
        System.out.println("Гаф");

    }
    @Override
    public void eat (){
        System.out.println("Рыба, мясо, хлеб, каша");
    }

    @Override
    public String toString() {
        return  "Dog: ";
    }
}
