package arraylists;

import java.util.ArrayList;

public class classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(0));
        list.remove(2);
        list.set(0, 5);
        System.out.println(list.contains(5));
        list.add(0, 4);
        System.out.println(list);
    }
}
