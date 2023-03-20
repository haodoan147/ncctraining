package Generic;

import java.util.ArrayList;
import java.util.Arrays;

// Why generic
class DictionaryString {
    private String key;
    private String value;
}
class DictionaryBoolean{
    private String key;
    private boolean value;
}
public class Dictionary<K, V> {
    private K key;
    private V value;

    public Dictionary(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
class DemoGeneric {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        DictionaryString dictionaryString = new DictionaryString();
        DictionaryBoolean dictionaryBoolean = new DictionaryBoolean();

        // Dictionary có value kiểu String
        Dictionary<String, String> d = new Dictionary<String, String>("Study", "hoc");
        String english = d.getKey();
        String vietnamese = d.getValue();
        System.out.println(english + ": " + vietnamese); //Ouput: Study: hoc

        // Dictionary có value kiểu Integer
        Dictionary<String, Integer> zip = new Dictionary<String, Integer>("VN", 710000);
        String country = zip.getKey();
        Integer zipcode = zip.getValue();
        System.out.println(country + ": " + zipcode); //Ouput: VN: 710000

        // Book1 extends từ Generic class Dictionary
        Book1 l = new Book1("001", "Thinking");
        String id = l.getKey();
        String title = l.getValue();
        System.out.println(id + ": " + title); // Ouput: 001: Thinking

        // Generic method
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book());
        System.out.println(Book.getFirst(list).toString());

        // đối tượng generic
        Book<Book1> myObj = new Book<Book1>(Book1.class);
        System.out.println(myObj.getObj());

        // mảng generic
        String[] arr = new String[] { "Dat", "Khoa", "Tin" };
        Book<String> books = new Book<String>(arr);
        System.out.println(Arrays.stream(books.getArray()).count());

    }
}
class Book1 extends Dictionary<String, String> {
    public Book1(String key, String value) {
        super(key, value);
    }
    public Book1() {
        super("key", "value");
    }
}
class Book2<K, V> extends Dictionary<K, V> {
    public Book2(K key, V value) {
        super(key, value);
    }
}
class Book3<K, V, P> extends Dictionary<K, V> {
    private P price;
    public Book3(K key, V value) {
        super(key, value);
    }
    public Book3(K key, V value, P price) {
        super(key, value);
        this.price = price;
    }
}
interface writer<T> {
    void update(T obj);
    void delete(T obj);
    void write(T obj);
}
class Book<T> implements writer<T> {
    private T obj; // khởi tạo đối tượng lưu tham số generic
    public Book(Class<T> classObject) throws InstantiationException, IllegalAccessException {
        // lấy tên Class và gán nó vào đối tượng obj
        this.obj = (T) classObject.newInstance();
    }

    public Book(){}

    @Override
    public void update(T obj) {
        // do something
    }
    @Override
    public void delete(T obj) {
        // do something
    }
    @Override
    public void write(T obj) {
        // do something
    }
    public static <T> T getFirst(ArrayList<T> arr){
        return arr.get(0);
    }
    public T getObj() {
        return obj; // trả về obj
    }

    private T[] array;
    public Book(T[] array) {
        this.array = array;
    }
    public T[] getArray() {
        return array;
    }
}
