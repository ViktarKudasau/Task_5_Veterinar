public class Bear extends Animal{

    String passportName;

    public Bear(String name) {
        super(name);
    }

    @Override
    public void getDescription() {
        System.out.println("Медведь является крупным хищником...");
    }

    @Override
    public void printName(){
        System.out.println("Bear " + name);
    }

    @Override
    public void makeNoise (){
        System.out.println("РРРРРРРрррррр");

    }
    @Override
    public void eat (){
        System.out.println("Рыба, ягоды, мед");
    }

    @Override
    public String toString() {
        return  "Bear: ";
    }

}
