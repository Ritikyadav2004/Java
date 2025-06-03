class MyThread extends Thread {
    public void run(){
       
            System.out.println("Hello from MyThread");
            try
            {
                 Thread.sleep(5000);
            }
            catch(Exception e)
            {
                System.out.println("HI");
            }
             System.out.println("After Delay");
           
    
    }
}
// here we not creating thread
// bina object ke call hoga 
class downloadFile{
    public static void file(String file )
    {
       System.out.println("Downloading...\n"+file);

       // to show % of downloading
       
       for(int i=1;i<=5;i++)
       {

        System.out.println("downloading..." + (i*20) + "%");
        //taking pause after eache 20%
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            
            System.out.println(file +"\ndone");
        }
       }
       System.out.println(file +"\nDone");
    }
}

public class SimpleThreadExample {
    public static void main(String[] args) {
       // MyThread t1 = new MyThread(); // Create a thread
      //  t1.start(); // Start the thread
        downloadFile.file("NCERT-Class-12-Political-Science-Part-1.pdf");
        
        downloadFile.file("NCERT Political Science Book Fre.pdf");
            // System.out.println(" Hello from main");
       
    }
}
//PROBLEM WITH DONWLOADING WITHOUT THREAD JAB TK EK FILE DOWNLOAD NHI HO JATI NEXT FILE
//DOWNLOAD HONA START NI HOTI 
//BETTER SOLUTION --> DONO FILE EL SATH DOWNLOAD HONA START HO 
//CONCEPT OF MULTITHEDING WILL BE USED HERE 