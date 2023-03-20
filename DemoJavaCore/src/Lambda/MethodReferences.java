package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test {
    public static void main(String[] args) {
        List<String> messages = Arrays.asList("12", "12.4", "141.1241");
        List<Double> list = new ArrayList<Double>();

        //--------------------------------------------------------------------------------------------
        // Static Method
        messages.forEach(word -> list.add(Double.valueOf(word)));
        list.stream().forEach(c -> System.out.println(c.getClass().getName() + c));

        //--------------------------------------------------------------------------------------------
        // Instance Method of a Particular Object
        List<Developer> listDevs = new ArrayList<>();
        listDevs.add(new Developer(30, true));
        listDevs.add(new Developer(20, false));
        listDevs.add(new Developer(18, true));
        listDevs.add(new Developer(25, false));
        listDevs.add(new Developer(32, true));
        listDevs.add(new Developer(48, false));
        listDevs.add(new Developer(27, true));
        listDevs.add(new Developer(38, false));

        DeveloperComparator developerComparator = new DeveloperComparator();

        Developer[] rosterAsArray = listDevs.toArray(new Developer[listDevs.size()]);

        Arrays.sort(rosterAsArray, (a , b)->developerComparator.compare(a, b));
//        Arrays.sort(rosterAsArray, developerComparator::compare);

        Arrays.stream(rosterAsArray).forEach(a-> System.out.println(a));

        //--------------------------------------------------------------------------------------------
        // Instance Method of an Arbitrary Object of a Particular Type

        Developer[] rosterAsArray2 = listDevs.toArray(new Developer[listDevs.size()]);

        Arrays.sort(rosterAsArray2, (a, b)->a.compareTo(b));
//        Arrays.sort(rosterAsArray2, Developer::compareTo);
        Arrays.stream(rosterAsArray2).forEach(a-> System.out.println(a));

        //--------------------------------------------------------------------------------------------
        // Reference to a Constructor
        List<Integer> devsAge = Arrays.asList(32, 22, 19, 40);

        Developer[] listDev = devsAge.stream()
                .map(Developer::new)
                .toArray(Developer[]::new);
        Arrays.stream(listDev).forEach(d-> System.out.println(d));
    }

}

class DeveloperComparator{

    public int compare(Developer a, Developer b) {
        return a.getAge() - b.getAge();
    }
}

class Developer{
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
    public int compareTo(Developer a){
        return Age-a.getAge();
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