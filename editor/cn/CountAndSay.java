//The count-and-say sequence is a sequence of digit strings defined by the recur
//sive formula: 
//
// 
// countAndSay(1) = "1" 
// countAndSay(n) is the way you would "say" the digit string from countAndSay(n
//-1), which is then converted into a different digit string. 
// 
//
// To determine how you "say" a digit string, split it into the minimal number o
//f groups so that each group is a contiguous section all of the same character. T
//hen for each group, say the number of characters, then say the character. To con
//vert the saying into a digit string, replace the counts with a number and concat
//enate every saying. 
//
// For example, the saying and conversion for digit string "3322251": 
//
// Given a positive integer n, return the nth term of the count-and-say sequence
//. 
//
// 
// Example 1: 
//
// 
//Input: n = 1
//Output: "1"
//Explanation: This is the base case.
// 
//
// Example 2: 
//
// 
//Input: n = 4
//Output: "1211"
//Explanation:
//countAndSay(1) = "1"
//countAndSay(2) = say "1" = one 1 = "11"
//countAndSay(3) = say "11" = two 1's = "21"
//countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 30 
// 
// Related Topics 字符串 
// 👍 615 👎 0

//Java：外观数列
public class CountAndSay {
    public static void main(String[] args) {
        Solution solution = new CountAndSay().new Solution();
        // TO TEST
        System.out.println(solution.countAndSay(5));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String countAndSay(int n) {
            //n等于1的时候
            if (n == 1) {
                return "1";
            }
            //n不等于1的时候，一定为偶数
            String src = countAndSay(n - 1);
            //dest为最终字符串
            StringBuilder dest = new StringBuilder();
            //temp记录当前分组的元素
//            StringBuilder temp = new StringBuilder();
//            temp.append(src.charAt(0));
            int start=0;
            //描述逻辑：相同元素分组，每组输出的数据是个数+数据
            for (int i = 1; i < src.length(); i++) {
                //分组逻辑
                if (src.charAt(i) != src.charAt(i - 1)) {
                    //指针当前元素与前一个元素不同，分组结束
                    //此时生成当前分组的数据
                    dest.append(i-start).append(src.charAt(start));
                    //temp记录新分组元素
//                    temp = new StringBuilder();
//                    temp.append(src.charAt(i));.
                    start = i;
                } else {
//                    temp.append(src.charAt(i));
                }
            }
            //循环中必定少处理一次分组情况
            dest.append(src.length()-start).append(src.charAt(start));
            return new String(dest);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}