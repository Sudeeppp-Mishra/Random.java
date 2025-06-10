public class Inheritance {
    int data = 30;

    public static void main(String[] args){
        Child c = new Child();
        c.show();
    }
}

class Child extends Inheritance{
    int data = 40;
    void show(){
        System.out.print("Local Scope: "+data);
        System.out.print("\nParent Variable: "+super.data);
    }
}
