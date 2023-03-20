package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static Lambda.ReplaceAnonymousInnerClass.DeveloperPredicates.filterDeveloper;
import static Lambda.ReplaceAnonymousInnerClass.DeveloperPredicates.isUnder30;

public class ReplaceAnonymousInnerClass {
    public static void main(String[] args) {
        List<Developer> listDevs = new ArrayList<>();
        listDevs.add(new Developer(30, true));
        listDevs.add(new Developer(20, false));
        listDevs.add(new Developer(18, true));
        listDevs.add(new Developer(25, false));
        listDevs.add(new Developer(32, true));
        listDevs.add(new Developer(48, false));
        listDevs.add(new Developer(27, true));
        listDevs.add(new Developer(38, false));

        //--------------------------------------------------------------------------------------------
        // Comparator -> sort

//        listDevs.sort(new Comparator<Developer>() {
//            @Override
//            public int compare(Developer o1, Developer o2) {
//                return o2.getAge() - o1.getAge();
//            }
//        });

        listDevs.sort((Developer o1, Developer o2)->o2.getAge()-o1.getAge());

        listDevs.forEach(n-> System.out.println(n.getAge()));

        //--------------------------------------------------------------------------------------------
        // Predicate - check điều kiện

//        new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return !s.isEmpty();
//            }
//        };

        Predicate<Developer> minDeveloperPredicate = developer -> developer.getAge()>18  ;
        Predicate<Developer> maxDeveloperPredicate = developer -> developer.getAge()<28  ;

        System.out.println(listDevs.stream().filter(minDeveloperPredicate.and(maxDeveloperPredicate)).collect(Collectors.<Developer>toList()));

        // Implement a class predicate for Developer
        System.out.println(filterDeveloper(listDevs, isUnder30().negate()));

        //--------------------------------------------------------------------------------------------
        // Consumer - It represents a function which takes in one argument and produces a result but these are no return value

        // Consumer to display a number
        Consumer<Integer> display = a -> System.out.println(a);
        // Implement display using accept()
        display.accept(10);

        Consumer<List<Developer> > modify = list -> {
            for (int i = 0; i < list.size(); i++)
                list.get(i).setAge(list.get(i).getAge()*2);
        };
        Consumer<List<Developer> >
                dispList = list -> list.stream().forEach(a -> System.out.println(a.getAge()));

        modify.andThen(dispList).accept(listDevs);

        try {
            modify.andThen(null).accept(listDevs);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
}

    static class Developer{
        private int Age;
        private boolean gender;

        @Override
        public String toString() {
            return this.Age+"";
        }
        public Developer(int age) {
            Age = age;
        }

        public Developer(int age, boolean gender) {
            Age = age;
            this.gender = gender;
        }

        public boolean getGender() {
            return gender;
        }

        public void setGender(boolean gender) {
            this.gender = gender;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }
    }
    static class DeveloperPredicates {

        // Tất cả Developer có tuổi > 21 và có giới tính là Male
        public static Predicate<Developer> isAdultMale() {
            return p -> p.getAge() > 21 && p.getGender()==true;
        }

        public static BiPredicate<Integer, Boolean> biPredicate() {
            return (i, s) -> i> 21 && s==true;
        }

        // Tất cả Developer có tuổi  <30
        public static Predicate<Developer> isUnder30() {
            return p -> p.getAge() < 30;
        }

        // Tất cả Developer lớn hơn số tuổi được truyền vào
        public static Predicate<Developer> isAgeMoreThan(Integer minAge, Integer maxAge) {
            return p -> p.getAge() > minAge && p.getAge()<maxAge;
        }

        // Lấy danh sách Developer thõa mãn predicate được truyền vào
        public static List<Developer> filterDeveloper( //
                                                      List<Developer> employees, Predicate<Developer> predicate) {
            return employees.stream().filter(predicate).collect(Collectors.<Developer>toList());
        }
    }

}
