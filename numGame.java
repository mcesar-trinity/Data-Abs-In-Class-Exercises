import java.util.PriorityQueue;

class numGame{

    public int[] numberGame(int[] nums) {
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
        
        return arr;
    }

}







