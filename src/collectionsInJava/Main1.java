package collectionsInJava;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        User user = new User("gswd" , 23);
        User user1 = new User("gswd1" , 231);
        User user2 = new User("gswd2" , 232);
        User user3 = new User("gswd3" , 233);
        User user4 = new User("gswd4" , 234);
        User user5 = new User("gswd5" , 235);
        User user6 = new User("gswd6" , 236);

        Set<User> set = new TreeSet<>(new UserComporator());
        set.add(user);
        set.add(user1);
        set.add(user2);
        set.add(user3);
        set.add(user4);
        set.add(user5);
        set.add(user6);

        System.out.println(set);


//        user.compareTo(user1);
//        System.out.println(user.compareTo(user1));

//        Queue<String> queue = new ArrayDeque<>();
//        queue.add("first");
//        queue.add("next");
//        queue.add("last");
//
//        System.out.println(queue.peek());
//        System.out.println(queue.peek());
//        System.out.println(queue.peek());

//        List<String> arrayList = new ArrayList<>();
//        arrayList.add("first");
//        arrayList.add("second");
//        arrayList.add(1,"test");
//        arrayList.add(1,"test2");
//
//        Iterator<String> iterator = arrayList.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//    }
//
    }

}