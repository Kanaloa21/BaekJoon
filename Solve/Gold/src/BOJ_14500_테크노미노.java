import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * BOJ_14500_테크노미노
 */
public class BOJ_14500_테크노미노 {
    static int n;
    static int m;
    static int maxSum = 0;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // iShape();
        // sShape();
        lShape();
        // zShape();
        // tShape();
        int[] dx = { 0, 0, 1, 1 };
        int[] dy = { 0, 1, 0, 1 };
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tmp = 0;
                for (int k = 0; k < dy.length; k++) {

                }
                maxSum = Math.max(maxSum, tmp);
            }
        }
        System.out.println(maxSum);
    }

    static void iShape() { // 일자로 움직임
        int[] d = { 0, 1, 2, 3 };
        int tmp = 0;
        for (int i = 0; i < n; i++) { // 세로
            for (int j = 0; j <= m - 4; j++) {
                tmp = 0;
                for (int k = 0; k < d.length; k++) {
                    tmp += arr[i][j + d[k]];
                }
                maxSum = Math.max(maxSum, tmp);
            }
        }
        for (int i = 0; i < m; i++) { // 가로
            for (int j = 0; j <= n - 4; j++) {
                tmp = 0;
                for (int k = 0; k < d.length; k++) {
                    tmp += arr[j + d[k]][i];
                }
                maxSum = Math.max(maxSum, tmp);
            }
        }
    }

    static void sShape() { // 네모네모
        int[] dx = { 0, 0, 1, 1 };
        int[] dy = { 0, 1, 0, 1 };
        int tmp = 0;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= m - 2; j++) {
                tmp = 0;
                for (int k = 0; k < dy.length; k++) {
                    tmp += arr[i + dx[k]][j + dy[k]];
                }
                maxSum = Math.max(maxSum, tmp);
            }
        }
    }

    static void lShape() { // 8가지, d배열을 역순으로 돌면 대칭변환
        int[] dx1 = { 0, 1, 2, 2 };
        int[] dy1 = { 0, 0, 0, 1 };
        int[] dx2 = { 0, 0, 1, 2 };
        int[] dy2 = { 1, 0, 0, 0 };
        int tmp = 0;
        for (int i = 0; i <= n - 3; i++) { // L일때, X축 대칭r일때
            for (int j = 0; j <= m - 2; j++) {
                tmp = 0;
                for (int k = 0; k < 4; k++) {
                    tmp += arr[i + dx1[k]][j + dy1[k]];
                }
                maxSum = Math.max(maxSum, tmp);

                tmp = 0;
                for (int k = 0; k < 4; k++) {
                    tmp += arr[i + dx2[k]][j + dy2[k]];
                }
                maxSum = Math.max(maxSum, tmp);
            }
        }

        dx1 = new int[] { 0, 1, 2, 2 };
        dy1 = new int[] { 1, 1, 1, 0 };
        dx2 = new int[] { 0, 0, 1, 2 };
        dy2 = new int[] { 0, 1, 1, 1 };
        for (int i = 0; i <= n - 3; i++) { // L y축 회전일때, X축 대칭일때
            for (int j = 0; j <= m - 2; j++) {
                tmp = 0;
                for (int k = 0; k < 4; k++) {
                    tmp += arr[i + dx1[k]][j + dy1[k]];
                }
                maxSum = Math.max(maxSum, tmp);

                tmp = 0;
                for (int k = 0; k < 4; k++) {
                    tmp += arr[i + dx2[k]][j + dy2[k]];
                }
                maxSum = Math.max(maxSum, tmp);
            }
        }

        dx1 = new int[] { 0, 0, 0, 1 };
        dy1 = new int[] { 0, 1, 2, 2 };
        dx2 = new int[] { 1, 0, 0, 0 };
        dy2 = new int[] { 0, 0, 1, 2 };
        for (int i = 0; i <= n - 2; i++) { // ㄱ 일때, y축 대칭일때
            for (int j = 0; j <= m - 3; j++) {
                tmp = 0;
                for (int k = 0; k < 4; k++) {
                    tmp += arr[i + dx1[k]][j + dy1[k]];
                }
                maxSum = Math.max(maxSum, tmp);

                tmp = 0;
                for (int k = 0; k < 4; k++) {
                    tmp += arr[i + dx2[k]][j + dy2[k]];
                }
                maxSum = Math.max(maxSum, tmp);
            }
        }

        dx1 = new int[] { 0, 0, 0, 1 };
        dy1 = new int[] { 0, 1, 2, 2 };
        dx2 = new int[] { 1, 0, 0, 0 };
        dy2 = new int[] { 0, 0, 1, 2 };
        for (int i = 0; i <= n - 2; i++) { // ㄱ x축 대칭일때, y축 대칭일때
            for (int j = 0; j <= m - 3; j++) {
                tmp = 0;
                for (int k = 0; k < 4; k++) {
                    tmp += arr[i + dx1[k]][j + dy1[k]];
                }
                maxSum = Math.max(maxSum, tmp);

                tmp = 0;
                for (int k = 0; k < 4; k++) {
                    tmp += arr[i + dx2[k]][j + dy2[k]];
                }
                maxSum = Math.max(maxSum, tmp);
            }
        }
    }
}