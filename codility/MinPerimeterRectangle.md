Prime and Composite nunmber  
  
Prime : 5  
Composite : 6  
  
**해결법 : 제곱근 (Math.sqrt())**  
  
~~~ java
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int res = Integer.MAX_VALUE;
        int end = (int)Math.sqrt(N);
        
        if(N==1)
        {
            return 4;
        }
        
        for(int i=1;i<=end;i++){
            if(N%i == 0){
                int tmp = 2*((N/i)+i);
                if(tmp < res)
                res = tmp;
            }
        }     
        return res;
    }
}
~~~
