package leetcode.p692;

import java.util.*;

public class Solution2 {
    static class WordCount2 implements Comparable<WordCount2> {
        String word;
        int count;

        WordCount2(String word, int count) {
            this.word = word;
            this.count = count;
        }

        @Override
        public int compareTo(WordCount2 o) {
            if (this.count==o.count){
                return o.word.compareTo(this.word);
            }else{
                return this.count-o.count;
            }
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        // 统计每次单词的出现次数
        Map<String, Integer> countMap = new TreeMap<>();
        for (String w : words) {
            int count = countMap.getOrDefault(w, 0);
            countMap.put(w, count + 1);
        }

        // 组织成关于 WordCount 类型的线性结构（数组 OR List）
        List<WordCount2> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();

            WordCount2 wc = new WordCount2(word, count);
            list.add(wc);
        }

        // 利用堆（PriorityQueue），找到 TopK
        PriorityQueue<WordCount2> queue = new PriorityQueue<>();
        for (WordCount2 wc : list) {
            if (queue.size() < k) {
                queue.add(wc);
            } else {
                int cmp = wc.compareTo(queue.element());
                if (cmp > 0) {
                    queue.remove();
                    queue.add(wc);
                }
            }
        }

        // 堆中保存的元素就是我需要的 TopK 元素
        // 取堆顶元素 + 头插
        List<String> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            WordCount2 wc = queue.remove();
            ans.add(0, wc.word);
        }

        return ans;
    }
}
