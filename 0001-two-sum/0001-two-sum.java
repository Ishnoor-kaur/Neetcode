// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] ar = new int[2];
//         for(int i=0; i<nums.length; i++){
//             for(int j=i; j<nums.length; j++){
//                 if(nums[i] + nums[j] == target){
//                     ar[0]=i;
//                     ar[1]=j;
//                     break;
//                 }
//             }
//         }
//          return ar;
//     }
// }

class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }
}
