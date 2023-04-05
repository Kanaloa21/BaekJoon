import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * BOJ_2531_회전초밥
 */
public class BOJ_2531_회전초밥 {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int maxRes = 0;
        HashMap<Integer, Integer> dish = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                for (int j = 0; j < k; j++) {
                    if (dish.containsKey(arr[(i + j) % n]))
                        dish.put(arr[(i + j) % n], dish.get(arr[(i + j) % n]) + 1);
                    else
                        dish.put(arr[(i + j) % n], 1);
                }
            } else {
                // 연속 접시 뽑기
                // 원형 회전 초밥인걸 유의해야한다.
                // 앞에 빼기
                if (dish.get(arr[i - 1]) == 1)
                    dish.remove(arr[i - 1]);
                else
                    dish.put(arr[i - 1], dish.get(arr[i - 1]) - 1);
                // 뒤에 넣기
                if (dish.containsKey(arr[(i + k - 1) % n]))
                    dish.put(arr[(i + k - 1) % n], dish.get(arr[(i + k - 1) % n]) + 1);
                else
                    dish.put(arr[(i + k - 1) % n], 1);
            }
            // 쿠폰 추가
            if (dish.containsKey(c))
                dish.put(c, dish.get(c) + 1);
            else
                dish.put(c, 1);
            // 연속 접시 검사
            maxRes = Math.max(maxRes, dish.size());
        }
        System.out.println(maxRes);
    }

}