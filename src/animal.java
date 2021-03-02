import java.util.Locale;
import java.util.Objects;

public class animal {
    public animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public static void main(String args[]){
        animal a1 = new animal("cat");
        animal a2 = new animal("cat");
        animal a3 = new animal("Cat");

        System.out.println(a1.equals(a3));
        System.out.println(a1.hashCode());
        System.out.println(a3.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof animal)) return false;
        animal animal = (animal) o;

        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase(Locale.ROOT));
    }
}
