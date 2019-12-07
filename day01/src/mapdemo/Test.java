package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book(1,"牛立露传","薛淇",108d);
        Book book2 = new Book(2,"格林童话","格林兄弟",100d);
        Book book3 = new Book(3,"射雕英雄传","金庸",150d);
        Book book4 = new Book(4,"神雕侠侣","金庸",148d);
        //传记
        Map<String,Book > biography = new HashMap<>();
        biography.put("传记",book1);

        //童话故事
        Map<String,Book > story = new HashMap<>();
        story.put("童话故事",book2);

        //小说
        Map<String,Book > novel = new HashMap<>();
        System.out.println(novel);
        novel.put("小说",book3);
        System.out.println(novel);
        novel.put("小说",book4);
        System.out.println(novel);

        //加入书店
        Map<Integer,Map<String,Book > > bookStore1 = new HashMap<>();
        bookStore1.put(1,biography);
        bookStore1.put(2,story);
        bookStore1.put(3,novel);
        //遍历书店
        Set<Integer> keySet = bookStore1.keySet();
        for (Integer i:keySet){
            Map<String, Book> bookMap = bookStore1.get(i);
            Set<Map.Entry<String, Book>> entrySet = bookMap.entrySet();
            Iterator<Map.Entry<String, Book>> iterator = entrySet.iterator();
            while (iterator.hasNext()){
                Map.Entry<String, Book> bookEntry = iterator.next();
                String key = bookEntry.getKey();
                String name = bookEntry.getValue().getName();
                System.out.println("三味书店===>"+key+"===>"+name);
            }
        }

    }
}
