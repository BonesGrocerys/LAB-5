import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите кол-во строк");
        int n = s.nextInt();
        System.out.println("Введите строку первого элемента");
        ListElement elem1 = new ListElement(s.next());
        for (int i = 2; i <= n; i++)
        {
            System.out.println("Введите " + i + " элемент списка: ");
            ListUtils.insert(elem1, s.next());
        }
        System.out.println("Список: ");
        print(elem1);

        System.out.println("Список после фильтрации");
        var elem2 = ListUtils.filter(elem1);
        print(elem2);

        System.out.println("Итоговая строка");
        System.out.println(ListUtils.reduce(elem2));
    }

    public static void print(ListElement first){    // Вывод списка на экран
        if (first != null){
            System.out.print("(" + first.getStr() + ") ");
            print(first.getNext());
        } else
            System.out.println();
    }
}