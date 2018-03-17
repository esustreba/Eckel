package inheritance.cartoon;

class Art {
    Art() {
        System.out.println("Конструктор Art()");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Конструктор Drawing()");
    }
}



public class Cartoon extends Drawing {
    Cartoon() {
        System.out.println("Конструктор Cartoon()");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
