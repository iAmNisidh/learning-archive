import java.util.HashMap;

public class HashMapWithOverrides {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();

        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Ram", 2);
        Person p3 = new Person("Alice", 1); // Same content as p1

        map.put(p1, "Engineer");
        map.put(p2, "Carpenter");
        map.put(p3, "Painter"); // Replaces value for p1

        System.out.println("With overrides:");
        System.out.println("Map size: " + map.size());
        System.out.println("Value for p1: " + map.get(p1));
        System.out.println("Value for p3: " + map.get(p3));
    }
}

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    // ✅ Override equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return this.id == other.id && this.name.equals(other.name);
    }

    // ✅ Override hashCode
    @Override
    public int hashCode() {
        return name.hashCode() * 31 + id;
    }
}
                           