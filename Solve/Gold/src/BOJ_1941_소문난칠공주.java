import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1941_소문난칠공주 {
    static int[][] map;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
    static boolean[][] isElect;
    static boolean[][] isVisited;
    static final int n = 5;
    static int res = 0;
    static int tmp = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new int[n][n];
        for (int i = 0; i < map.length; i++) {
            String st = new String(br.readLine());
            for (int j = 0; j < map.length; j++) {
                if (st.charAt(j) == 'S')
                    map[i][j] = 1;
                else
                    map[i][j] = 0;
            }
        }
        // 이다솜파가 1
        isElect = new boolean[n][n];
        isVisited = new boolean[n][n];
        subset(0, 0);
        System.out.println(res);
    }

    static void subset(int idx, int cnt) {
        if (cnt >= 7) {
            isVisited = new boolean[n][n];
            tmp = 0;
            out: for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (isElect[i][j]) {
                        isVisited[i][j] = true;
                        tmp++;
                        dfs(i, j, 0);
                        break out;
                    }
                }
            }

            return;
        }
        if (idx >= 25) {
            return;
        }

        int x = idx / n;
        int y = idx % n;
        isElect[x][y] = true;
        subset(idx + 1, cnt + 1);
        isElect[x][y] = false;
        subset(idx + 1, cnt);
    }

    static void dfs(int x, int y, int num) {
        if (tmp >= 7) { // 전부 이어져 있구나
            int idsCnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (isElect[i][j] && map[i][j] == 1 && isVisited[i][j]) {
                        idsCnt++;
                    }
                }
            }
            if (idsCnt >= 4) {
                res++;
            }
            return;
        }
        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && isElect[nx][ny] == true && isVisited[nx][ny] != true) {
                isVisited[nx][ny] = true;
                tmp++;
                dfs(nx, ny, num + 1);
            }
        }
    }
}
