어려웠다 진짜로
범위가 넓어서 2차원 배열 생각없이 만들면 시간초과
빼는 방법 사용했는데 참신하고 좋았다. 다른 사람들 코드 참고해서 겨우 이해함


~~~ java
class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[][] map = new int[4][S.length()];
        
        for(int i=0; i<S.length(); i++)
        {
            char tmp = S.charAt(i);
            switch(tmp){
                case 'A':
                    map[0][i] = 1;
                    break;
                case 'C':
                    map[1][i] = 1;
                    break;
                case 'G':
                    map[2][i] = 1;
                    break;
                case 'T':
                    map[3][i] = 1;
            }
        }
        
        for(int i=0;i<4; i++)
        {
            for(int j=1; j<S.length(); j++)
            {
                map[i][j] += map[i][j-1];
            }
        }
        
        
        int[] result = new int[P.length];
        
        for(int i=0; i<P.length; i++)
        {
            for(int j=0; j<4; j++){
                int sum = 0;
                if(P[i]>0)
                    sum=map[j][P[i]-1];
                
                if(map[j][Q[i]]-sum > 0){
                    result[i] = j+1;
                    break;
                }
            }
        }
        
        return result;     
    }
}
~~~

![sol](https://user-images.githubusercontent.com/17976251/82444546-5eac7880-9ade-11ea-81f4-6e1a8629e0e3.jpeg)

