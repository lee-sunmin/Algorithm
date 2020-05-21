포인트 : **앞에서부터 뒤로 가면서 진행한다고 생각 - Maximum slice**  
뒤에서 앞으로 간다고 생각하고 이중포문쓰면 시간초과  

그리고 역대 문제중 처음으로 A라는 배열의 크기가 0인 경우가 있었기 때문에 예외처리 :)

~~~ java
import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int res = -1;
        
        if(A.length == 0)
        return 0;
        
        int min = A[0];
        for(int i=1; i<A.length; i++){
            if(min > A[i-1])
                min = A[i-1];
            
            if(A[i]-min > res)
            res = A[i]-min;
        }
        
        if(res < 0)
        return 0;
        
        return res;
    }
}
~~~
