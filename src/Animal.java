public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise (){
        System.out.println("���� ���������");
    }
    public void eat (){
        System.out.println("��, ��� �������� ��������");
    }

    public void getDescription() {
        System.out.println("�������� ��������� ������ Animal");
    }

    public void printName(){
        System.out.println(name + " Class Animal");
    }

    public String toString() {
        return  "�� ����� ������ - " + name;
    }

}
