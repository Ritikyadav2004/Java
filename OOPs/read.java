class book
{
    void read(String name)
    {
        System.out.println("You hav choose "+name+" to read");
    }
}
class Novel extends book
{
    void storyline()
    {
        System.out.println("Once upon a time there was an person living in\n jabalpur become a most whealthesit person in Whole Madhy prasdesh");
    }
}
public class read {
    public static void main(String[] args) {
        Novel n1 = new Novel();
        n1.read("My Biography");
        n1.storyline();
    }
}
