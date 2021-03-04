import java.util.ArrayList;
import java.util.Collections;

class human implements Comparable<human> {
  public String name;
  public int age;
  public double height;

  public human(String name, int age, double height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }


  public int compareTo(human m) {
    if (age == m.age)
      return 0;
    else if (age > m.age)
      return 1;
    else
      return -1;
  }
}

public class Compare {
  public static void main(String args[]) {
    ArrayList<human> mk = new ArrayList<>();
    mk.add(new human("nhan", 23, 1.72));
    mk.add(new human("phuc", 30, 1.72));
    mk.add(new human("hien", 17, 1.72));

    Collections.sort(mk);
    for (human h : mk) {
      System.out.println(h.age);
    }
  }
}
