public class Cat extends Animal{

String passportCat;

    public Cat(String name) {
        super(name);
    }

    public void printName(){
        System.out.println("Cat " + name);
    }
    @Override
    public void getDescription() {
        System.out.println("Кот является домашним питомцем");
    }

    @Override
    public void makeNoise (){
        System.out.println("Мяу");

    }
    @Override
    public void eat (){
        System.out.println("Рыба, мясо, молоко, корм");
    }

    @Override
    public String toString() {
        return  "Cat: ";
    }
}
