package inheritance.placeSetting;


class Plate {
    Plate(int i) {
        System.out.println("Конструктор Plate()");
    }
}

class DinnerPlate extends Plate {

    DinnerPlate(int i) {
        super(i);
        System.out.println("Конструктор DinnerPlate()");
    }
}

class Utensil {
    Utensil(int i) {
        System.out.println("Конструктор Utensil()");
    }
}

class Spoon extends Utensil {

    Spoon(int i) {
       super(i);
        System.out.println("Конструктор Spoon()");
    }
}

class Fork extends Utensil {

    Fork(int i) {
        super(i);
        System.out.println("Конструктор Fork()");
    }
}

class Knife extends Utensil {

    Knife(int i) {
        super(i);
    }
}

class Custom {
    Custom (int i){
        System.out.println("Конструктор Custom()");
    }
}

public class PlaceSetting extends Custom {
    private Spoon sp;
    private Fork frk;
    private Knife knf;
    private DinnerPlate dp;


    PlaceSetting(int i) {
        super(i);
        sp = new Spoon(i+2);
        frk = new Fork(i+3);
        knf = new Knife(i+4);
        dp = new DinnerPlate(i + 5);
        System.out.println("Констурктор PlaceSetting()");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
}
