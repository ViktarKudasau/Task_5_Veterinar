import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animals");
        Dog dog = new Dog("Bobik");
        Cat cat = new Cat("Pushok");
        Bear bear = new Bear("Taptishka");

        ArrayList<Animal> newList = new ArrayList<>();
        newList.add(0,dog);
        newList.add(1,cat);
        newList.add(2,bear);
        Veterinar veterinar = new Veterinar();

        for (int i = 0; i < newList.size(); i++) {
            System.out.println((i+1) + ") На прием пришел: ");
            veterinar.treatAnimal(newList.get(i));
        }

        for (int i = 0; i < newList.size(); i++) {
            System.out.println((i+1) + ") " + newList.get(i));
            newList.get(i).makeNoise();
            newList.get(i).eat();
        }

    }
}