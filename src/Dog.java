public class Dog extends Animal{

    String passportNumber;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void getDescription() {
        System.out.println("������ - ������ ���� ��������");
    }

    @Override
    public void printName(){
        System.out.println("Dog " + name);
    }

    @Override
    public void makeNoise (){
        System.out.println("���");

    }
    @Override
    public void eat (){
        System.out.println("����, ����, ����, ����");
    }

    @Override
    public String toString() {
        return  "Dog: ";
    }
}
