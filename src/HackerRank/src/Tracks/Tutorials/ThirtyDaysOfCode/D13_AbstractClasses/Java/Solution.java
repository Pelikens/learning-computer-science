package HackerRank.src.Tracks.Tutorials.ThirtyDaysOfCode.D13_AbstractClasses.Java;

import java.util.*;


class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();
        Book new_novel=new MyBook(title,author,price);
        new_novel.display();
        sc.close();
    }
}

abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();
}

class MyBook extends Book {
    private int price;

    MyBook(String t, String a, int price){
        super(t, a);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + title +
                        "\nAuthor: " + author +
                        "\nPrice: " + price);
    }
}
