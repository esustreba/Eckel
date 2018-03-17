
public class Tree {
    int height;
    Tree() {
        System.out.println("Сажаем росток");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Создание нового дерева высотой " + height + " м. ");
    }

    void info () {
        System.out.println("Дерево высотой " + height + " м. ");
    }

    void info (String s) {
        System.out.println(s + ": Дерево высотой " + height + " м. ");
    }
}

