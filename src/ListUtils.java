public class ListUtils {

    public static ListElement insert(ListElement first, String str) {    // Добавление элемента в конец списка
        if (first == null) {
            return new ListElement(str);
        } else {
            ListElement p = first;
            while (p.getNext() != null) p = p.getNext();
            p.setNext(new ListElement(str));
            return first;
        }
    }

    public static ListElement filter(ListElement first) {    // Метод фильтрации
        ListElement p = null;
        while (first != null) {
            // Проверка на наличие букв в строке
            if (!(first.getStr().matches(".*[a-zA-Zа-яА-Я].*"))){
                p = insert(p, first.getStr());
            }
            first = first.getNext();
        }
        return p;
    }

    private static String totalStr = "";
    public static String reduce(ListElement first) {

        if (first != null){
            totalStr += first.getStr();
            reduce(first.getNext());
        }

        return totalStr;
    }
}




