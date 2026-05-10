package javex;
import java.util.*;

public class hashset_tostring {

    int roll;
    String name;
    double percentage;

    public hashset_tostring(int roll, String name, double percentage) {
        this.roll = roll;
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return roll + " " + name + " " + percentage;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        hashset_tostring s = (hashset_tostring) obj;
        return roll == s.roll &&
               Double.compare(percentage, s.percentage) == 0 &&
               Objects.equals(name, s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name, percentage);
    }

    public static void main(String[] args) {
        hashset_tostring hs = new hashset_tostring(12, "favi", 65.6);
        hashset_tostring hs2 = new hashset_tostring(812, "ravi", 95.6);

        HashSet<hashset_tostring> hss = new HashSet<>();
        hss.add(hs);
        hss.add(hs2);

        System.out.println(hss);
    }
}

