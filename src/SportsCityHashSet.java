import java.util.HashSet;
import java.util.Iterator;

/*
 author Bohdan Hnatusiv
  26.09.020
 */

public class SportsCityHashSet {
    public static void main(String[] args) {
        /*
        Класс HashSet имплементится от интерфейса Set, который наследуется от интерфейса Collection.
        Основной особенностью интерфейса Set является  то,  что все значения хранящиеся в коллекции
        будут уникальными. Основной особенностью класса HashSet это то, что хранение элементов ,на
         первый взгляд,  осуществляется в прозвольном порядке. На самом же деле порядок хранения осущест-
        вляется по сложному алгоритму. Хранение с использованием  класса HashSet подходит если порядок
         хранения не важен, но важна скорость. На практике  часто выбирается реализация HashSet т.к.
         оптимизируется для быстрого поиска и для удаления элемента , а также для определения принадлежности
         элемента данной коллекции (время(O(1))).В основе HashSet лежит понятие Hash-функция(Hash-код).
         Hash-код -это целое число ,которое является уникальным идентификатором содержимого объекта.Т.е.,
         каждый  объект , с разными данными , имеет свое уникальное число. Благодаря этому числу определяется
         равенство или неравенство объектов.Но при определении Hash-кода могут возникать коллизии. Это когда
         в результате вычисления для разных объектов получаются одинаковые значения Hash-кода.  Для определения
         значения Hash-кода есть соответсвующий метод  .hashCode().Существует также метод .equals для
         определения сравнения объектов  по ссылке.Т.е объекты будут считаться разными  если ссылки не указывают
         на один и тот же объект.
          HashSet подходит если порядок не важен ,но важна скорость.Ведь для оптимизации поиска HashSet хранит элементы
         так, как "ему удобно". Среди HashSet,TreeSet и LinkedHashSet  чаще всего используется HashSet из-за скорости.

         */

        // создаю для примера три коллекции HashSet
        HashSet<Sports> sportsHashSet = new HashSet<>();
        HashSet<Integer> numbersHashSet = new HashSet<>();
        HashSet<String> cityHashSet = new HashSet<>();


        //создаю объекты,причем значения некоторых повторяются(1 и 2)
        Sports sport1 = new Sports("Football");
        Sports sport2 = new Sports("Football");
        Sports sport3 = new Sports("Handball");
        Sports sport4 = new Sports("Volleyball");
        Sports sport5 = new Sports("Tennis");
        Sports sport6 = new Sports("Jim");


        //создаю примитивние переменные,причем значения некоторых повторяются(num2 = 20 и num6 =20 )
        int num1 = 2;
        int num2 = 20;
        int num3 = 12;
        int num4 = 225;
        int num5 = 1232;
        int num6 = 20;


        //добавляю элементы в сответсвующую коллекцию
        sportsHashSet.add(sport1);
        sportsHashSet.add(sport2);
        sportsHashSet.add(sport3);
        sportsHashSet.add(sport4);
        sportsHashSet.add(sport5);
        sportsHashSet.add(sport6);


        numbersHashSet.add(num1);
        numbersHashSet.add(num2);
        numbersHashSet.add(num3);
        numbersHashSet.add(num4);
        numbersHashSet.add(num5);
        numbersHashSet.add(num6);

        cityHashSet.add(" Lviv");
        cityHashSet.add("Kharkiv");
        cityHashSet.add("Kiiv");
        cityHashSet.add("Poltava");
        cityHashSet.add("Warshava");
        cityHashSet.add("Poltava");


        /*  применив for each ,вывожу на  консоль
        и убеждаюсь , что все значения уникальные для примитивных ,
        но для одинаковых значений объектов - это все -таки  разные объекты */
        for (Sports sp : sportsHashSet) {
            System.out.print(sp + " ; ");
        }
        System.out.println();

        for (int n : numbersHashSet) {
            System.out.print(n + " ; ");
        }
        System.out.println();
        for (String c : cityHashSet) {
            System.out.print(c + "  ;  ");
        }
        System.out.println();

        // определение размера  коллекции
        System.out.println(" Size of Collection sportsHashSet  =  " + sportsHashSet.size());
        System.out.println(" Size of Collection numbersHashSet  =  " + numbersHashSet.size());
        System.out.println(" Size of Collection cityHashSet  =  " + cityHashSet.size());

        // значение повторяется , но объкты разные поэтому HashSet  принимает
        Sports sport7 = new Sports("Football");
        sportsHashSet.add(sport7);
        for (Sports sp : sportsHashSet) {
            System.out.print(sp + " ; ");
        }
        System.out.println();
        // значение повторяется и HashSet не принимает
        int num7 = 225;
        numbersHashSet.add(num7);
        for (int n : numbersHashSet) {
            System.out.print(n + " ; ");
        }
        System.out.println();

        // значение повторяется и HashSet не принимает
        cityHashSet.add("Kiiv");
        for (String c : cityHashSet) {
            System.out.print(c + "  ;   ");
        }
        System.out.println();

        System.out.println(" Size of Collection sportsHashSet  =  " + sportsHashSet.size());
        System.out.println(" Size of Collection numbersHashSet  =  " + numbersHashSet.size());
        System.out.println(" Size of Collection cityHashSet  =  " + cityHashSet.size());

        // метод определения Hash-кода
        System.out.println("Hash-code  of  " + sportsHashSet + " =  " + sportsHashSet.hashCode());
        System.out.println("Hash-code  of  " + sport3 + " =  " + sport3.hashCode());
        System.out.println("Hash-code  of  " + sport4 + " =  " + sport4.hashCode());
        System.out.println("Hash-code  of  " + numbersHashSet + " =  " + numbersHashSet.hashCode());
        System.out.println("Hash-code  of  " + cityHashSet + " =  " + cityHashSet.hashCode());
        System.out.println("Hash-code  of  " + "Kharkiv" + " =  " + "Kharkiv".hashCode());
        System.out.println("Hash-code  of  " + "Lviv" + " =  " + "Lviv".hashCode());

        //сравнение объектов  с использованием равенства их Hash-кода
        System.out.print("If Hash -code is equal  =  true  else  =  false :  ");
        System.out.println(sport2.hashCode() == sport2.hashCode());
        System.out.print("If Hash -code is equal  =  true  else  =  false :  ");
        System.out.println(sport2.hashCode() == sport3.hashCode());

        //сравнение объектов  с использованием  метода  .equals
        System.out.println(" If object1 is equal object2  =  true  else  =  false :"
                + sport2.equals(sport2));
        System.out.println(" If object1 is equal object2  =  true  else  =  false :"
                + sport2.equals(sport3));
        System.out.println(" If object1 is equal object2  =  true  else  =  false :"
                + "Lviv".equals("Lviv"));
        System.out.println(" If object1 is equal object2  =  true  else  =  false :"
                + "Lviv".equals("Kiiv"));

        //  метод  поиска  объектов
        System.out.println(" Get object  " + sport3 + " is  " + sport3.getSport());
        System.out.println(" Get object  " + sport2 + " is  " + sport2.getSport());

        //метод удаления объктов
        sportsHashSet.remove(sport5);
        numbersHashSet.remove(num5);
        cityHashSet.remove("Poltava");


        for (Sports sp : sportsHashSet) {
            System.out.print(sp + " ; ");
        }
        System.out.println();


        for (Integer n : numbersHashSet) {
            System.out.print(n + "  ;  ");
        }
        System.out.println();
        for (String c : cityHashSet) {
            System.out.print(c + "  ;   ");
        }
        System.out.println();

        System.out.println(" Size of Collection sportsHashSet  =  " + sportsHashSet.size());
        System.out.println(" Size of Collection numbersHashSet  =  " + numbersHashSet.size());
        System.out.println(" Size of Collection cityHashSet  =  " + cityHashSet.size());

        //метод определения наличия элемента в коллекции , например sport5 (удаленный только - что)
        // и  например 225 ,  и  "Poltava"  ( если есть - то true)
        System.out.println(" Object  " + sport5 + " is  in Collection  sportsHashSet    =   "
                + sportsHashSet.contains(sport5));
        System.out.println(" Element  " + 225 + " is  in Collection  numbersHashSet    =   "
                + numbersHashSet.contains(225));
        System.out.println(" Element  " + "Poltava" + " is  in Collection cityHashSet     =   "
                + cityHashSet.contains("Poltava"));

        // метод удаления всех элементов
        sportsHashSet.clear();
        numbersHashSet.clear();
        cityHashSet.clear();
        System.out.println(" Size of Collection sportsHashSet  =  " + sportsHashSet.size());
        System.out.println(" Size of Collection numbersHashSet  =  " + numbersHashSet.size());
        System.out.println(" Size of Collection cityHashSet  =  " + cityHashSet.size());

        //метод определения пустоты коллекции

        System.out.println(" Collection sportsHashSet  is  Empty  =   " + sportsHashSet.isEmpty());
        System.out.println(" Collection numbersHashSet  is  Empty  =   " + numbersHashSet.isEmpty());
        System.out.println(" Collection cityHashSet  is  Empty  =   " + cityHashSet.isEmpty());

        // воостанавливаю коллекции
        sportsHashSet.add(sport1);
        sportsHashSet.add(sport2);
        sportsHashSet.add(sport3);
        sportsHashSet.add(sport4);
        sportsHashSet.add(sport5);
        sportsHashSet.add(sport6);

        numbersHashSet.add(num1);
        numbersHashSet.add(num2);
        numbersHashSet.add(num3);
        numbersHashSet.add(num4);
        numbersHashSet.add(num5);
        numbersHashSet.add(num6);

        cityHashSet.add(" Lviv");
        cityHashSet.add("Kharkiv");
        cityHashSet.add("Kiiv");
        cityHashSet.add("Poltava");
        cityHashSet.add("Warshava");
        cityHashSet.add("Poltava");

        System.out.println(" Collection sportsHashSet  is  Empty  =   " + sportsHashSet.isEmpty());
        System.out.println(" Collection numbersHashSet  is  Empty  =   " + numbersHashSet.isEmpty());
        System.out.println(" Collection cityHashSet  is  Empty  =   " + cityHashSet.isEmpty());

        System.out.println(" Size of Collection sportsHashSet  =  " + sportsHashSet.size());
        System.out.println(" Size of Collection numbersHashSet  =  " + numbersHashSet.size());
        System.out.println(" Size of Collection cityHashSet  =  " + cityHashSet.size());

        // применение класса Итератор  для вывода всех значений коллекций
        // с применением их основных методов hasNext() , next()
        Iterator<Sports> iteratorSport = sportsHashSet.iterator();
        Iterator<Integer> iteratorNumber = numbersHashSet.iterator();
        Iterator<String> iteratorCity = cityHashSet.iterator();

        System.out.print(" All elements of sportsHashSet :   ");
        while (iteratorSport.hasNext()) {
            System.out.print(iteratorSport.next() + "  //  ");
        }
        System.out.println();

        System.out.print(" All elements of numbersHashSet :   ");
        while (iteratorNumber.hasNext()) {
            System.out.print(iteratorNumber.next() + "  ;  ");
        }
        System.out.println();

        System.out.print(" All elements of cityHashSet :   ");
        while (iteratorCity.hasNext()) {
            System.out.print(iteratorCity.next() + "   //  ");
        }

    }
}
