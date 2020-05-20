사이즈가 100,000 인데 그냥 Arrays.sort(A) 써도 되는구나 !!@

~~~ java
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8d
       Arrays.sort(A);
       
       int res = A[0]*A[1]*A[A.length-1];
       
       if(res <A[A.length-1]*A[A.length-2]*A[A.length-3])
       res = A[A.length-1]*A[A.length-2]*A[A.length-3];
       return res;
    }
}
~~~
