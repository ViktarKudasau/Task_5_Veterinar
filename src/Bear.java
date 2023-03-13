public class Bear extends Animal{

    String passportName;

    public Bear(String name) {
        super(name);
    }

    @Override
    public void getDescription() {
        System.out.println("ћедведь €вл€етс€ крупным хищником...");
    }

    @Override
    public void printName(){
        System.out.println("Bear " + name);
    }

    @Override
    public void makeNoise (){
        System.out.println("–––––––рррррр");

    }
    @Override
    public void eat (){
        System.out.println("–ыба, €годы, мед");
    }

    @Override
    public String toString() {
        return  "Bear: ";
    }

}
