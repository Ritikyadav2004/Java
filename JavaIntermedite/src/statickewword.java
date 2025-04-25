public class statickewword {

    /*
     * static keyword lga ke varibale declare kiya to static variable
     * 
     * if nhi lagaya to class ke object bna ke access kernge usse instence kahnge 
     * 
     */
    int x =10;  //instance varibale
    static int y =9; // global variable and static same
    public static void main(String[] args)
     {   
        int z = 8;// local varibale
        statickewword m1 = new statickewword();
        
        System.out.println("This is static means global variable:"+y);
        System.out.println("This is instance variable:"+m1.x);
        System.out.println("This is Local Varibal :"+z);
    }
}
