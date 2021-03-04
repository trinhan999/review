import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface LamdaHolder {
  public String lamMe(String s1, String s2);
}

public class animal implements Cloneable {
  //region animalClass
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof animal)) return false;
    animal animal = (animal) o;

    return Objects.equals(name, animal.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  protected Object clone() throws CloneNotSupportedException {
    animal cloned = (animal) super.clone();
    return cloned;
  }
  //endregion

  public static void main(String args[]) throws CloneNotSupportedException {
    animal a1 = new animal("cat");
    animal a2 = (animal) a1.clone();
    animal a3 = new animal("Cat");

    System.out.println(a1.equals(a2));
    System.out.println(a1.hashCode());
    System.out.println(a3.hashCode());

    ArrayList<animal> zoo = new ArrayList<>();
    zoo.add(new animal("cat"));
    zoo.add(new animal("dog"));
    zoo.add(new animal("bird"));

    LamdaHolder ogj = (s1,s2) ->
    {
      return s1 + s2;
    };

    Iterator<animal> z = zoo.iterator();
    System.out.println(z.next().getName());
    Consumer<animal> met = (n) -> {System.out.println(n.getName());};
    zoo.forEach(met);


    System.out.println(zoo.stream().count());
    System.out.println(ogj.lamMe(zoo.get(0).name, zoo.get(1).name));

  }
}
