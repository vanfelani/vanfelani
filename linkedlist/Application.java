package linkedlist;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
//        list.add(2);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        System.out.println(list.get(0));
        try {
            list.remove(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
//        System.out.println(list.get(0));

    }

}
