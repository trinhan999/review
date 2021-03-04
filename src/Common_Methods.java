import java.util.Objects;

class car implements Comparable<car> {
  public String name;
  public double speed;
  public double weight;

  public car(String name, double speed, double weight) {
    this.name = name;
    this.speed = speed;
    this.weight = weight;
  }


  public int compareTo(car c) {
    return 1;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof car)) return false;
    car car = (car) o;
    return Double.compare(car.speed, speed) == 0 && Double.compare(car.weight, weight) == 0 && Objects.equals(name, car.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, speed, weight);
  }
}

public class Common_Methods {
  public static void main(String args[]) {
    car c1 = new car("c1", 100, 500);
    car c2 = new car("c1", 100, 500);
    car c3 = new car("c3", 200, 300);

    System.out.println(c1.equals(c2));
    System.out.println(c1 == c2);
    System.out.println(c1.equals(c3));
    System.out.println(c1.equals(c3));
  }
}
