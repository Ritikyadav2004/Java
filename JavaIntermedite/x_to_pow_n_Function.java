public class x_to_pow_n_Function {
    public static int x_pow_n(int base,int power) {
        int bas = base;
        if(power==0)return 1;
        else{
        for(int i=1;i<power;i++)
        {   if(power!=1)
            base*=bas;
        }
        return base;
    }

        
    }
    public static void main(String[] args) {
        System.out.println(x_pow_n(2,10));
    }
}
