	import java.util.Scanner;

public class main {
	    public static void main(String[] args){

	         //Please Enter Your Code Here
	         Scanner scan = new Scanner(System.in);
	         	int[] dx = { -1,0,1,0 };
	         	int[] dy = { 0,1,0,-1 };
	          int[][] input = new int[5][5];
	          char[][] output = new char[5][5];

	          for(int i = 0; i < 5; i++){
	            for(int j = 0; j < 5; j++){
	              input[i][j] = scan.nextInt();
	            }
	          }
	          
	          for(int i = 0; i < 5; i++){
	            for(int j = 0; j < 5; j++){
	              Boolean isSmaller = false;
	              for(int z = 0; z < 4; z++){
	                int nx = dx[z]+i;
	                int ny = dy[z]+j;
	                
	                if(nx >= 0 && ny >= 0 && nx<=4 && ny<=4){
	                  if(input[nx][ny] > input[i][j]){
	                    isSmaller = true;
	                  }
	                }
	              }
	              if(isSmaller){
	                output[i][j] = '*';
	              }else{
	                output[i][j] = (char)(input[i][j] + '0');
	              }
	            }
	          }
	          
	          // print output
	          for(int i = 0; i < 5; i++){
	            for(int j= 0; j < 5; j++){
	              System.out.print(output[i][j]);
	            }
	            System.out.println();
	          }
	    
	}
}
