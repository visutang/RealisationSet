import java.util.Iterator;
import java.util.TreeSet;
/*
*  author Bohdan Hnatusiv
  28.09.020
 */
public class IntegerCityTreeSet {
    public static void main(String[] args) {

/*     (Эта реализация класса TreeSet осуществлялась факультативно.)
       Класс TreeSet имплементится от интерфейса SortedSet, который наследуется от интерфейса  Set
       а он в свою очередь от интерфейса Collection.
        Основной особенностью интерфейса Set является  то,  что все значения хранящиеся в коллекции
        будут уникальными.Основной же  особенностью класса TreeSet это то, что хранение элементов происходит
         отсортированными.Но по сравнению с классом HashSet работает медленнее(О(n));
             Что же касается класса LinkedHashSet, то он также имплементиться от интерфейса SortedSet , но хранит
          элементы в порядке добавления. Также хранит только уникальные элементы. Но также как и TreeSet работает
          медленнее(О(n))  чем HashSet.
*/

        // creat for example 2 collections
        //создаю для примера 2 коллекций
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        TreeSet<String> cityTreeSet = new TreeSet<>();


        // add  elements in collections
        integerTreeSet.add(45);
        integerTreeSet.add(12);
        integerTreeSet.add(23);
        integerTreeSet.add(23);
        integerTreeSet.add(234);
        integerTreeSet.add(5);
        integerTreeSet.add(123);

        cityTreeSet.add("London");
        cityTreeSet.add("Berlin");
        cityTreeSet.add("Oslo");
        cityTreeSet.add("Bern");
        cityTreeSet.add("Tallinn");
        cityTreeSet.add("Berlin");

        //use operation for each for  go out elements of collections
        System.out.print(" All elements  in integerTreeSet   :  ");
       for (Integer number :  integerTreeSet) {
           System.out.print(number + " /  ");
       }
        System.out.println();

        System.out.print(" All elements  in cityTreeSet  :  ");
       for (  String city : cityTreeSet) {
           System.out.print(city  +  "   /  ");
       }
        System.out.println();

        // use class Iterator for  go out elements of collections
        Iterator<Integer> integerIterator = integerTreeSet.iterator();
        Iterator<String> stringIterator = cityTreeSet.iterator();
        System.out.print(" All elements  in integerTreeSet  :  ");
       while (integerIterator.hasNext()){
           System.out.print(integerIterator.next()+ "  ;  ");
       }
        System.out.println();
        System.out.print(" All elements  in cityTreeSet  :  ");
        while (stringIterator.hasNext()){
            System.out.print(stringIterator.next() +  " ;  ");
        }
        System.out.println();

        // method for definition size collections
        System.out.println(" Size  integerTreeSet  =  "  +   integerTreeSet.size());
        System.out.println(" Size  cityTreeSet  =  "  +   cityTreeSet.size());

         //method for definition hash-code  of element
        System.out.println("Hash-code  of  " + "Oslo" + " =  "  +  " Oslo".hashCode());
        System.out.println("Hash-code  of  " + "Bern" + " =  "  +  " Bern".hashCode());

        // method for definition empty of collection
        System.out.println(" Collection integerTreeSet  is  Empty  =   "  + integerTreeSet.isEmpty());
        System.out.println(" Collection cityTreeSet  is  Empty  =   "  + cityTreeSet.isEmpty());

        //  method for find and get  element in collection
        System.out.println(" Element " + 12 +  "  is  in integerTreeSet  =  "
                +integerTreeSet.contains(12)  +  "    and" +  "   " + 44 +  "  is  in integerTreeSet  = "
                + integerTreeSet.contains(44));

        System.out.println(" Element " + "Roma" +  "  is  in cityTreeSet  =  "
                +cityTreeSet.contains("Roma")  +  "    and" +  "   " + "Oslo" +  "  is  in cityTreeSet  = "
                + cityTreeSet.contains("Oslo"));System.out.println();

          // method removal element
          cityTreeSet.remove("Oslo");
          //audit this collection
        System.out.println(" Size  cityTreeSet  =  "  +  cityTreeSet.size());

        //and audit this collection with use class Iterator
        Iterator<String> stringIterator1 = cityTreeSet.iterator();
        System.out.print(" All elements  in cityTreeSet  :  ");
          while (stringIterator1.hasNext()){
              System.out.print(stringIterator1.next()  +  "  ;  ");
          }
    }
}