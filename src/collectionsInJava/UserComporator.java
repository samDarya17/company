package collectionsInJava;

import java.util.Comparator;

public class UserComporator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.getAge()> o2.getAge() ? 1 : -1;
//        if(o1.getAge() > o2.getAge());
//        return 0;
//    } else return -1 это не работает почеуму, я хз
    }}