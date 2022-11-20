public class MakeQue{
    int rear =0; // 제일 끝부분
    int front =0; // 제일 앞부분
    int now_index; // 추가해야할 부분
    int size;
    int [] que;
    public void makeque(int size){
        this.size = size;
        que = new int [size];
        now_index = -1;
    }
    public void push(int item){
        que[++now_index] = item;
        System.out.println("push " + que[now_index]);
        rear++;
    }
    public void pop(){
        System.out.println("pop "+ que[front]);
        que[front] = 0;
        front++;
    }
    public void peek(){
        System.out.println(que[front]);
    }
}
