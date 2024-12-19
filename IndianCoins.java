import java.util.*;

public class IndianCoins {
    public static void main(String args[]){
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();

        int amount = 5900;
        int count = 0;

        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    ans.add(coins[i]);
                    count++;
                    amount -= coins[i];
                }
            }
        }
        System.out.println("The coin count is:"+ count);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }    
}
