leetcode. 
https://leetcode.com/problems/remove-duplicates-from-sorted-array/  

  
~~~ java
import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        int s = 0, e = 0;
		int res = 0;
		int size = nums.length;

        if(nums.length==0)
            return 0;
        
		while (e < size) {
			if (s == e) {
				e++;
			} else if (nums[s] == nums[e]) {
				e++;
			} else { // 두개가 다르다.
				s++;
				nums[s] = nums[e];
				e++;
				res++;
			}
		}
        return res+1;
    }
}
~~~
