import java.util.*;

public class ChainPairs {
    public static void main(String args[]){
        int pairs[][] = {{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int ans=1;
        int pairEnd = pairs[0][1]; //last pair end // chain end

        for(int i=1; i<pairs.length; i++){
            if(pairEnd < pairs[i][0]){
                ans++;
                pairEnd = pairs[i][1];
            }
        }
        System.out.println("Max length of Chain: "+ ans);
    }   
} 