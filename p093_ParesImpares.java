import java.util.Random;

public class p093_ParesImpares {
    public static void GenerarAleatorio(int[] nums){
        Random rnd= new Random();
        for(int i=0; i<nums.length; i++)
        nums[i]=rnd.nextInt(21);

    }


    
}
