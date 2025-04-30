class Bookapp {
    String title;
    double Price;
    String author;

    Bookapp(String t, String a, double p) {
        title = t;
        author = a;
        Price = p;
    }

    void displayinfo() {
        System.out.print("Title :" + title);
        System.out.print("Author :" + author);
        System.out.println("Price :" + Price);

    }

    void applydiscount(int dis) {
        System.out.println("Previous Price:" + Price);
        Price = Price - ((Price * dis) / 100);
        System.out.println(dis + "% Discounted Price: " + Price);
}


}
public class book {

    public static void main(String[] args) {

        Bookapp m1 = new Bookapp("The Secret", "Rhonda Byrne", 180);
        m1.displayinfo();
        m1.applydiscount(10);
       

    }
}
