import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2293_동전1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 1일때 동전들로 만들 수 있는 경우의 수
		// 10'000일때 동전들로 만들 수 있는 경우의 수
		// 뱀과 사다리 문제와 유사
		// 10에서 빼기로 구하기?
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int coin[] = new int[n];
		int coinSum[] = new int[k + 1];
		for (int i = 0; i < coin.length; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		coinSum[0] = 1;
		for (int i = 1; i <= k; i++) {
			for (int j = 0; j < n && coin[j] <= i; j++) {
				coinSum[i] += coinSum[i - coin[i]];
			}
			System.out.println(i + ": " + coinSum[i]);
		}

		System.out.println(coinSum[k]);
	}
}1 11 2 111 12 3 1 2
