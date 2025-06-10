public class class__ {
    int n;
    class__(){
        n = 10;
    }

    void show(){
        System.out.print("n: " + n);
    }

    public static void main(String[] args){
        class__ c= new class__();
        c.show();
        System.out.print("\n"+c.n);
    }
}
