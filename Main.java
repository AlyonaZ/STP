package Collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Stack<String> colors = new Stack<>();
        colors.add("blue");
        colors.add("green");
        colors.add("blue");
        System.out.println(colors);
        System.out.println(task_1(colors));
        System.out.println("-----------");
        task_2_add();
        System.out.println("-----------");
        task_3("Синий красный зелёный красный красный синий");
        System.out.println("-----------");
    }
    static Collection task_1(Collection col){
        Collection col_new = new ArrayList();
        for (Object val:col) {
            if (!col_new.contains(val)){
                col_new.add(val);
            }
        }
        return col_new;
    }
    static void task_2_add(){
        ArrayList col_array = new ArrayList();
        LinkedList col_linked = new LinkedList();
        for (int i = 0; i < 1000000; i++){
            int num = (int) Math.random();
            col_array.add(num);
            col_linked.add(num);
        }
        long time = System.nanoTime();
        task_2_choice(col_array);
        time = System.nanoTime()-time;
        System.out.println(time);
        time = System.nanoTime();
        task_2_choice(col_linked);
        time = System.nanoTime()-time;
        System.out.println(time);
    }
    static void task_2_choice(List col){
        for (int i = 0; i < 100000; i++){
            int ind = (int) Math.random();
            col.get(ind);
        }
    }
    static void task_3(String text){
        text = text.toLowerCase();
        String[] words = text.split(" ");
        Map<String, Integer> wordlist = new HashMap();
        for (String val:words){
            wordlist.compute(val, (k, v) -> v == null ? 1 : v + 1);
        }
        TreeMap<String, Integer> wordlist_tree = new TreeMap<>();
        wordlist_tree.putAll(wordlist);
        for (Map.Entry<String, Integer> word : wordlist_tree.entrySet()) {
            System.out.println(word.getKey() + " = " + word.getValue());
        }
    }
}
