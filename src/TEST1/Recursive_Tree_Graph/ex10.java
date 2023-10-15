package TEST1.Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

class Node4 {
    int data;
    Node4 lt,rt; //node객체의 주소를 저장하는 변수
    public Node4(int val){
        data=val;
        lt=rt=null;
    }
}
public class ex10 {
    static Node4 root;
    public static int BFS(Node4 root) {
        Queue<Node4> Q = new LinkedList<>();
        Q.offer(root);
        int L=0;
        while(!Q.isEmpty()){
            int len=Q.size();
            for(int i=0; i<len; i++){
                Node4 poll= Q.poll();
                if(poll.lt ==null && poll.rt ==null) return L;
                if(poll.lt!=null) Q.offer(poll.lt);
                if(poll.rt!=null) Q.offer(poll.rt);
            }
            L++;
        }
        return L;
    }
    public static void main(String[] args) {
        root = new Node4(1);
        root.lt = new Node4(2);
        root.rt = new Node4(3);
        root.lt.lt = new Node4(4);
        root.lt.rt = new Node4(5);
        System.out.print(BFS(root));
    }
}
