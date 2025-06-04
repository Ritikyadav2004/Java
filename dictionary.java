import java.util.HashMap;
public class dictionary
{

    public static void main(String [] args)
    {
     HashMap<Integer,Integer> score = new HashMap<>();
       int arr[] = {1,2};
       score.put(1, 91);
       score.put(3, 10);
       System.out.println(score.containsKey(arr[1]));
    }
}
