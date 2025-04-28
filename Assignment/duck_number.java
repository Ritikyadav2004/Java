public class duck_number {
    public static void duck(int num) {
        boolean flag = true;
        while(num>10)
        {
            int rem = num%10;
             if(rem==0)
            {   
                flag = false;
                System.out.println("Duck Duck Go");
                break;
            }
            num/=10;
            
        }
        if(flag==true)
        System.out.println("Not A duck Number");
    }
        public static void main(String[] args)
        {
            duck(89899);
        }
    
}
//number whic contains 0 in between them not from strting