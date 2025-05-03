class device
{
    void poweron()
    {
        System.out.println("Turnning on Your Device keep Watching");
    }
}
class  laptop extends device{

void boot()
{
    System.out.println("Loading all the neccessary file");
}

}
class GamingLaptop extends laptop
{
    void startgamming()
    {
        System.out.println("You game start yet");
    }
}
public class Ec_Devices
{
    public static void main(String[] args) {
        GamingLaptop g1  = new GamingLaptop();
    g1.poweron();
    g1.boot();
    g1.startgamming();

    }
}
