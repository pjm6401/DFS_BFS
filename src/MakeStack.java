public class MakeStack {
    int size;
    int top;
    int [] stack;
    public void makestack(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    public void push(int item){ // 삽입
        stack[++top] = item;
        System.out.println("push" + stack[top]);
    }
    public void pop(){ // 삭제 선입 후출
        System.out.println("pop" + stack[top]);
        stack[top--] = 0;
    }
}
