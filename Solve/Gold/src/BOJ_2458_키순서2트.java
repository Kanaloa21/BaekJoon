import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2458_키순서2트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[][] arr = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    arr[i][j] = 0;
                else
                    arr[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            arr[start][end] = 1;
        }

        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length; i++) {
                if (k == i)
                    continue;
                for (int j = 0; j < arr.length; j++) {
                    if (k == j || j == i)
                        continue;
                    arr[i][j] = Math.min(arr[i][k] + arr[k][j], arr[i][j]);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i == 3)
                    System.out.print(i + ", " + j + ", " + arr[i][j] + "\n");
                else if (arr[i][j] >= Integer.MAX_VALUE) {
                    break;
                }
                cnt++;
            }
            if (cnt == n)
                res++;
        }
        System.out.println("\n" + res);
    }
}
