package use_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(3);
        set.add(5);
        set.add(2);
        set.add(9);

        // 在代码中，能调用哪些方法，根据引用的类型来决定的
        // set 引用是 Set<Integer> 类型
        // Set<Integer> 中不包含 first() 方法
        // 所以无法调用
        // set.first();

        TreeSet<Integer> treeSet = (TreeSet<Integer>) set;
        System.out.println(treeSet.first());    // 2
        System.out.println(treeSet.last()); //9

        System.out.println(treeSet.floor(3));   // 3
        System.out.println(treeSet.lower(3));   // 2
        System.out.println(treeSet.lower(2));   // null


        System.out.println(treeSet.floor(4));   // 3
        System.out.println(treeSet.lower(4));   // 3
    }
}

