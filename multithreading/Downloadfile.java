
class FileDowonload extends Thread
{
   String filename;
   public FileDowonload(String filename)
   {
    this.filename = filename;
   }
   public void run()
   {
    for(int i=1;i<=5;i++)
    {
        System.out.println("Donloading..."+filename+" "+i*20+"%");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Error Occred");
        }
    }
    System.out.println("Downloading Completed.."+filename);
   }

}


public class Downloadfile
{
    public static void main(String[] args)
    { 
        FileDowonload d1 = new FileDowonload("File A");
        FileDowonload d2 = new FileDowonload("File B");
        d1.start();
        d2.start();
        
     
    }
}

