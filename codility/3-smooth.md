~~~
DP는 언제쯤 익숙해질까  
속상하네
~~~

~~~ java
public class Main {
	public static void main(String[] args) throws IOException {
		int[] arr = new int[201];
		arr[0] = 1;
		int i2 = 0;
		int i3 = 0;

		for (int idx = 1; idx <= 200; idx++) {
			int n2 = 2 * arr[i2];
			int n3 = 3 * arr[i3];

			arr[idx] = Math.min(n2, n3);

			if (n2 <= n3) {
				i2++;
			}
			if (n2 >= n3) {
				i3++;
			}
		}

		for (int i = 0; i <= 200; i++) {
			System.out.println(arr[i]);
		}
	}
}
~~~
