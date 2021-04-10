package use_set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        // 元素类型是 Integer 类型，Integer 自身具备 Comparable 能力
        Set<Integer> set = new TreeSet<>();

        // 放入元素
        System.out.println(set.add(7));
        System.out.println(set.add(5));
        System.out.println(set.add(2));
        System.out.println(set.add(9));

        // 打印 set : 默认也是中序方式（key 有序）
        System.out.println(set);

        System.out.println(set.add(7));
        System.out.println(set);

        System.out.println(set.contains(7));
        System.out.println(set.remove(7));

        // 迭代：中序
//        Iterator<Integer> it = set.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//
//        for (Integer i : set) {
//            System.out.println(i);
//        }
    }
}
