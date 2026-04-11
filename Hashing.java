import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // insert element
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // search
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }

        set.remove(1);
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        } else {
            System.out.println("1 is not in the set");
        }

        System.out.println(set);

        // iterator
        // HasNext(),next()
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
