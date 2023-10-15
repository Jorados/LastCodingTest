package TEST1.Recursive_Tree_Graph;

//DFS 이진트리 순회
//전위 중위 후위
class Node{
    int data;
    Node4 lt,rt; //node객체의 주소를 저장하는 변수
    public Node(int val){
        data=val;
        lt=rt=null;
    }
}
public class ex5 {
    Node4 root;
    public void DFS(Node4 root){
        if(root==null) return;
        else{
            System.out.println(root.data + " ");
            DFS(root.lt);
            DFS(root.rt);
        }
    }
    public static void main(String[] args) {
        ex5 tree = new ex5();
        tree.root=new Node4(1);
        tree.root.lt=new Node4(2);
        tree.root.rt=new Node4(3);
        tree.root.lt.lt=new Node4(4);
        tree.root.lt.rt=new Node4(5);
        tree.root.rt.lt=new Node4(6);
        tree.root.rt.rt=new Node4(7);
        tree.DFS(tree.root);

    }
}


