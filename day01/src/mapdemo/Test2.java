package mapdemo;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Book book1 = new Book(1,"牛立露传","薛淇",108d);
        Book book2 = new Book(2,"格林童话","格林兄弟",100d);
        Book book3 = new Book(3,"射雕英雄传","金庸",150d);
        Book book4 = new Book(4,"神雕侠侣","金庸",148d);
        //传记
        List<Book> books = new ArrayList<>();
        books.add(book1);
        Map<String, List<Book>> biography = new HashMap<>();
        biography.put("传记",books);
        List<Book> books1 = new ArrayList<>();
        //童话故事
        Map<String, List<Book>> story = new HashMap<>();
        books1.add(book2);
        story.put("童话故事",books1);
        List<Book> books2 = new ArrayList<>();
        //小说
        Map<String, List<Book>> novel = new HashMap<>();
        books2.add(book3);
        books2.add(book4);
        novel.put("小说",books2);
        //加入书店
        Map<Integer,Map<String,List<Book>>> bookStore1 = new HashMap<>();
        bookStore1.put(1,biography);
        bookStore1.put(2,story);
        bookStore1.put(3,novel);
        //遍历书店
        Set<Integer> keySet = bookStore1.keySet();
        for (Integer i:keySet){
            Map<String, List<Book>> map = bookStore1.get(i);
            Set<String> strings = map.keySet();
            for (String type:strings){
                List<Book> bookList = map.get(type);
                for (Book book:bookList){
                    System.out.println("三味书屋-->"+type+"--->"+book.getName());
                }
            }
        }

    }
}
