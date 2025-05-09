abstract class animal{
    abstract void sound();
    
    void eat()
    {
        System.out.println("Animal Eating food ");
    }
}
class dog extends animal
{   
    @Override
    void sound(){
        System.out.println("Dogs bark");
    }
}
public class abstract_ {
    public static void main(String[] args) {
        animal a1 = new dog();
        a1.eat();
        a1.sound();
        
    }
    
}
