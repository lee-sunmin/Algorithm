
~~~ java
public static void main(String[] args) throws IOException {
    // 이어지는 숫자가 아닌 문자라도 사용이 가능함 (인덱스로 다루기 때문)
		int[] arr = { 1, 2, 3 };
		dfs(arr, 0, 3);
	}

	static void dfs(int[] arr, int n, int size) {
		if (n == size) {
			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} else {
			for (int i = n; i < size; i++) {
				swap(arr, i, n);
				dfs(arr, n + 1, size);
				swap(arr, i, n);
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
~~~


~~~
처음에 혼자 생각해본 코드.
단점은 arr과 동일한 크기의 visit을 생성해야해서 메모리 효율이 좋지 않을 것 같다.
그리고 이어지는 숫자에만 가능하다는 한계가 있음.
~~~
  
~~~ java
public class Main {
	public static void main(String[] args) throws IOException {
		dfs(new int[3], new boolean[3], 0);
	}
  
  // arr와 동일한 크기의 visit 배열 생성
	static void dfs(int[] arr, boolean[] visit, int n) {
		if (n == 3) {
    // 배열 출력
			for (int i = 0; i < 3; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} else {
			for (int i = 0; i < 3; i++) {
				if (!visit[i]) {
					arr[n] = i;
					visit[i] = true;
					dfs(arr, visit, n + 1);
					visit[i] = false;
					arr[n] = 0;
				}
			}
		}
	}
}

~~~
