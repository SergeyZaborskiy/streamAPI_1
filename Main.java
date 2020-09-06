import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(List.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));


        //Сортируем оставшееся в натуральном порядке
        intList.sort(Comparator.naturalOrder());

        Iterator<Integer> iterator = intList.iterator();

        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            //Убираем то что меньше нуля
            if (0 >= integer) {
                iterator.remove();
            }
            //Убираем нечетные
            else if (integer % 2 != 0) {
                iterator.remove();
            }
        }

        for (Integer integer : intList) {
            System.out.println(integer);
        }
    }
}

    /*
    Насколько понял из подсказок идеи, все же есть короткий путь сделать все эти операции без StreamAPI,
    но наверное эти методы относятся к Collection API.
    intList.sort(Comparator.naturalOrder());
    intList.removeIf(integer -> integer < 0);
    intList.removeIf(integer -> integer % 2 != 0);
     */