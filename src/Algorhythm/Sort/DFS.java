package Algorhythm.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author rua
 */
public class DFS {
    static ArrayList<Integer>[] A; // 인접 리스트
    static boolean[] visited; // 방문 배열
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 노드 수
        int M = Integer.parseInt(br.readLine()); // 간선 수

        // 인접 리스트, 방문 배열 초기화
        A = new ArrayList[N+1];
        visited = new boolean[N+1];
        for (int i=1; i<=N; i++) {
            A[i] = new ArrayList<>();
        }

        // 간선 정보 입력 및 양방향 저장
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            A[u].add(v);
//            A[v].add(u);
        }

        // 1번 노드에서 DFS 시작
        DFS(1);

        System.out.println(count);
    }

    static void DFS(int v) {
        visited[v] = true;

        // 인접 리스트 탐색
        for (int a : A[v]) {
            if (!visited[a]) {
                count ++;
                DFS(a);
            }
        }
        }
}

