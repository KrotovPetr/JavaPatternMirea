package task2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;


class Human {//класс, описывающий человека
    public int age=0;
    public String firstName;
    public String lastName;
    public LocalDate birthDate;
    public int weight;

}

class stringComparator implements Comparator<Human>{
    public int compare(Human a, Human b){

        return a.firstName.compareTo(b.firstName);//сравнение двух строк
    }
}


public class testClass {

    public testClass() {
        Human hum0 = new Human();
        Human hum1 = new Human();
        Human hum2 = new Human();
        Human hum3 = new Human();
        Human hum4 = new Human();
        Human hum5 = new Human();
        Human hum6 = new Human();
        Human hum7 = new Human();
        Human hum8 = new Human();
        Human hum9 = new Human();
        ArrayList<Human> arr2 = new ArrayList<Human>();//создаём список

        hum0.age = 23;
        hum0.weight = 72;
        hum0.firstName = "Teplyakov";
        hum0.lastName = "Vladimir";
        hum0.birthDate = LocalDate.of(1999, 10, 12);

        hum1.age = 33;
        hum1.weight = 48;
        hum1.firstName = "Petrenko";
        hum1.lastName = "Anastasia";
        hum1.birthDate = LocalDate.of(1989, 11, 23);

        hum2.age = 15;
        hum2.weight = 63;
        hum2.firstName = "Maryshkin";
        hum2.lastName = "Alexandr";
        hum2.birthDate = LocalDate.of(2007, 1, 17);

        hum3.age = 22;
        hum3.weight = 59;
        hum3.firstName = "Novikova";
        hum3.lastName = "Polina";
        hum3.birthDate = LocalDate.of(2000, 2, 23);

        hum4.age = 27;
        hum4.weight = 51;
        hum4.firstName = "Teplyakova";
        hum4.lastName = "Anna";
        hum4.birthDate = LocalDate.of(1995, 7, 7);

        hum5.age = 80;
        hum5.weight = 80;
        hum5.firstName = "Poyarkov";
        hum5.lastName = "Marsim";
        hum5.birthDate = LocalDate.of(1942, 10, 12);

        hum6.age = 3;
        hum6.weight = 10;
        hum6.firstName = "Teplyakov";
        hum6.lastName = "Ivan";
        hum6.birthDate = LocalDate.of(2019, 9, 15);

        hum7.age = 44;
        hum7.weight = 69;
        hum7.firstName = "Lilina";
        hum7.lastName = "Lilya";
        hum7.birthDate = LocalDate.of(1978, 10, 12);

        hum8.age = 40;
        hum8.weight = 72;
        hum8.firstName = "Kostina";
        hum8.lastName = "Anna";
        hum8.birthDate = LocalDate.of(1982, 1, 12);

        hum9.age = 18;
        hum9.weight = 72;
        hum9.firstName = "Sadalskiy";
        hum9.lastName = "Stanislav";
        hum9.birthDate = LocalDate.of(2004, 10, 12);
        arr2.add(hum0);
        arr2.add(hum1);
        arr2.add(hum2);
        arr2.add(hum3);
        arr2.add(hum4);
        arr2.add(hum5);
        arr2.add(hum6);
        arr2.add(hum7);
        arr2.add(hum8);
        arr2.add(hum9);//закидываем в список

        System.out.println("\nПервичный список:\n");
        for (int i = 0; i < arr2.size(); i++) {
            System.out.println(arr2.get(i).age + "     " + arr2.get(i).birthDate + "     " + arr2.get(i).firstName + "     " + arr2.get(i).lastName + "    " + arr2.get(i).weight);

        }//промежуточный вывод
        System.out.println("\n\n");
        arr2.stream().sorted(new stringComparator()).forEach(testClass::println);//сортируем
        System.out.println("\n\n");
        arr2.stream().filter(date -> date.birthDate.isBefore(LocalDate.of(2000, 6, 24))).forEach(testClass::println);//фильтруем
        System.out.println("\n\n");
        arr2.stream().filter(date -> date.birthDate.isBefore(LocalDate.of(2000, 6, 24))).map(s-> s.age).forEach(System.out::println);//преобразуем
        System.out.println("\n\n");
        int z = arr2.stream().filter(date -> date.birthDate.isBefore(LocalDate.of(2000, 6, 24))).map(s-> s.age).reduce(0,(x,y)->x+y);//считаем сумму
        System.out.println("\n\n"+z);



    }

    private static void println(Human human) {//метод по выводу на экран
            System.out.println(human.age + "     " + human.birthDate + "     " + human.firstName + "     " + human.lastName + "    " + human.weight);
    }


}
