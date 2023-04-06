import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14890_경사로 {
    public static void main(String[] args) throws IOException {
        // 가로로 탐색
        // 진행... 완료되면 +1
        // 진행... 진행중인 수와 다른걸 만나면 검사
        // 경사가 2 이상이면 break;
        // 경사가 1 이면 추가 검사
        // L 만큼 연속해야함
        // 양끝은 n, n+1로
        // 귀찮으니까 양 끝에 하나씩 더 두를까?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 0~n-1 까지 간다.
        // 가로로 가보자잇
        for (int i = 0; i < n; i++) {
            int start = map[i][0];
            int end = map[i][n - 1];
            // int cur = map[i][0];
            for (int j = 0; j < n - 1; j++) {
                if (map[i][j] == map[i][j + 1]) // 높이가 같으니 계속 진행
                    continue;
                fail: if (map[i][j] != map[i][j + 1]) { // 높이가 다르다!
                    int diff = map[i][j] - map[i][j + 1];
                    if (Math.abs(diff) >= 2) {// 높이가 1이상이군 돔황챠
                        break fail;
                    } else if (diff == 1) {// 내려가야할때
                        int cur = map[i][j + 1];
                        for (int k = 0; k < l; k++) { // 길이 l의 경사로를 둘 수 있는가?
                            if (cur != map[i][j + 1 + k])
                                break fail;
                        } // 통과 경사로 설치

                    } else if (diff == -1) { // 올라가야할때

                    }
                }
            }
        }
    }
}
