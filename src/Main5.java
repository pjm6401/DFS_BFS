import java.util.Deque;
import java.util.LinkedList;

public class Main5 {

    public static void main(String[] args){
        int[] levels_1 = {1, 2, 3, 4};
        int[] levels_2 = {1,2,3,4,5,6,7,8,9};
        System.out.println(solution(levels_1));
        System.out.println(solution(levels_2));
    }
    public static int solution(int [] level){
        int answer=0;
        Deque<Integer> level_q = new LinkedList<>();
        for(int i =0; i < level.length; i++){
            level_q.add(level[i]);
        }
        int choice = (int)((int)level.length * 0.25);
        for (int i=0; i<choice; i++){
            answer=level_q.pollLast();
        }

        return answer;
    }
}
