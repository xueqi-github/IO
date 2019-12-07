package mapdemo;

import java.util.HashMap;
import java.util.Map;

public class BookStore {
    public static void main(String[] args) {
        Book book1 = new Book(1,"牛立露传","薛淇",108d);
        Book book2 = new Book(2,"格林童话","格林兄弟",100d);
        Book book3 = new Book(3,"射雕英雄传","金庸",150d);
        Book book4 = new Book(4,"神雕侠侣","金庸",148d);

        //传记
        Map<Book, String> biography = new HashMap<>();
        biography.put(book1,"传记");

        //童话故事
        Map<Book, String> story = new HashMap<>();
        story.put(book2,"童话故事");

        //小说
        Map<Book, String> novel = new HashMap<>();
        novel.put(book3,"小说");
        novel.put(book4,"小说");
        Map<Map<Book, String>, String> bookStore = new HashMap<>();
        bookStore.put(biography,"书店");
        bookStore.put(story,"书店");
        bookStore.put(novel,"书店");
//        System.out.println(bookStore);
        //
        for (Map<Book, String> store:bookStore.keySet()){

            String storeTemp = bookStore.get(store);
            for (Book book:store.keySet()){
                String type = store.get(book);
                System.out.println(storeTemp+"--->"+type+"--->"+book);
            }
        }
    }
}
