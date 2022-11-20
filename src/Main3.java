import java.util.*;

public class Main3 {
    //DFS
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정점의 개수
        int M = sc.nextInt(); // 간선의 개수
        int v = sc.nextInt(); // 시작 정점
        boolean [] check = new boolean[M+1];
        int [][] FS = new int [M+1][2];
        for(int i =1; i<=M; i++){
            FS[i][0] = sc.nextInt();
            FS[i][1] = sc.nextInt();
        }
        for (int i=0; i<=M; i++){
            System.out.println(FS[i][0]+" "+FS[i][1]);
        }

        DFS(v,FS,check);
        check = new boolean[M+1];
        System.out.println();
        System.out.println(BFS(v,FS,check));

    }
    static void DFS(int start,int [][] fs, boolean[] check){

        check[start] =true;
        System.out.print(start + " ");
        for(int node : fs[start]){
            if(!check[node]){
                int go = List.of(fs[start][0]).indexOf(node);
                DFS(go,fs,check);
            }
        }

    }
    static String BFS(int start,int [][] fs, boolean[] check){
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        check[start] = true;
        while(!q.isEmpty()){
            int nodeIndex = q.poll();
            sb.append(nodeIndex+ "  ");
            for (int i=0; i< fs[nodeIndex].length; i++){
                int temp = fs[nodeIndex][i];
                if(!check[temp]){
                    check[temp] =true;
                    q.offer(temp);
                }
            }
        }
        return sb.toString();
    }
}
