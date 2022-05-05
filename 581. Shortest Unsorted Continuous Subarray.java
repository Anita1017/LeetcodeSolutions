
import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {4,3,2,1};
		System.out.println(findUnsortedSubarray(nums));
	}
	
	public static int findUnsortedSubarray(int[] nums) {
		if(nums.length < 2)
	        return 0;
	    int [] temp = new int[nums.length];
        
        for(int i=0; i < nums.length; i++)
            temp[i] = nums[i];
        
        Arrays.sort(temp);
        
        int i = 0;
        int j = 0;
        
        int start = 0;
        int end = 0;
        for(i = 0; i < nums.length; i++){
            if(nums[i] != temp[i]) {
                start = i;
                break;}
        }
        
        for(j = nums.length-1; j >=0; j--){
            if(nums[j] != temp[j]) {
                end = j;
            	break;}
        }
       
        if(start == end) {
	    	return 0;
	    }
        return end-start+1;
	}

}
