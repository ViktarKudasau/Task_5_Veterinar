public class Bear extends Animal{

    String passportName;

    public Bear(String name) {
        super(name);
    }

    @Override
    public void getDescription() {
        System.out.println("������� �������� ������� ��������...");
    }

    @Override
    public void printName(){
        System.out.println("Bear " + name);
    }

    @Override
    public void makeNoise (){
        System.out.println("�������������");

    }
    @Override
    public void eat (){
        System.out.println("����, �����, ���");
    }

    @Override
    public String toString() {
        return  "Bear: ";
    }

}
