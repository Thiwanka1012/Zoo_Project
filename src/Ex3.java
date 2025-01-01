class PrintInfo <T> {

    T data;

    PrintInfo(T data) {
        this.data = data;

    }

    public void print() {
        System.out.println(data);
    }


}
public class Ex3{
    public static void main(String[] args) {
        PrintInfo<Integer> info=new PrintInfo<>(10);
        info.print();

    }


}

