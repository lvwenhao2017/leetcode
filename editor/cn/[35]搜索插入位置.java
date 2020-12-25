//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 
//
// 你可以假设数组中无重复元素。 
//
// 示例 1: 
//
// 输入: [1,3,5,6], 5
//输出: 2
// 
//
// 示例 2: 
//
// 输入: [1,3,5,6], 2
//输出: 1
// 
//
// 示例 3: 
//
// 输入: [1,3,5,6], 7
//输出: 4
// 
//
// 示例 4: 
//
// 输入: [1,3,5,6], 0
//输出: 0
// 
// Related Topics 数组 二分查找 
// 👍 766 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
//        int begin=0;
//        int end=nums.length-1;
//        int mid=(begin+end)/2;
//        while(begin<=end){
//            if(nums[mid]>target){
//                end=mid-1;
//            }
//            if(nums[mid]<target){
//                begin=mid+1;
//            }
//            if(nums[mid]==target){
//                break;
//            }
//            mid=(begin+end)/2;
//        }
//        return mid;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]==target || (nums[i]>target && nums[i-1]<target)){
//                flag=true;
//                index=i;
//                break;
//            }
            if(nums[i]<target){
                index=i+1;
            }
            if(nums[i]>=target){
                index=i;
                break;
            }
        }
        return index;
//        if(flag){
//            return index;
//        }else{
//            return nums.length;
//        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
