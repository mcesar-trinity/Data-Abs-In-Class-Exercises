import java.util.Arrays;
import java.util.PriorityQueue;

class numGame{

    public int[] numberGame(int[] nums) {
        //Priority Queue time complexity is nlog(n). 
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int arr[] = new int[nums.length];

        for(int num : nums){
            queue.add(num);
        }

        int index = 0;

        while(!queue.isEmpty()){
            int alice = queue.remove();
            int bob = queue.remove();
            arr[index] = bob;
            index++;
            arr[index] = alice;
            index++;
        }   

        //OR DO THE FOLLOWING
        
        /*Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i<n-1;  i= i+2){
            int tmp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]= tmp;
        }*/
        
        return arr;
    }

}







