//Generics


class Lion{
    String details="Lion Details";
}

class Elephant{
    String details="Elephant Details";
}

class Fish{
    String details="Fish Details";
}

class PrintInformation <T>{
    T details;

    PrintInformation(T details){
        this.details=details;

    }

    public void printData(){
        System.out.println(details);
    }




    }








public class Example {
    public static void main(String[] args) {

        Lion lion=new Lion();

        PrintInformation information=new PrintInformation<>(lion);

        information.printData();

    }
}
