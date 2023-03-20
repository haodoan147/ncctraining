import java.util.*;

public class DRAGONBALL {

    static class Node{
        Node child1;
        Node child2;
        Set<Integer> balls = new HashSet<>();

        public Node(Node child1, Node child2, Set<Integer> balls) {
            this.child1 = child1;
            this.child2 = child2;
            this.balls = balls;
        }

        public Node(int ball) {
            balls.add(ball);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int q = sc.nextInt();

        List<Integer> balls = new ArrayList<>();
        for (int i=0; i<k;i++){
            balls.add(sc.nextInt());
        }
        Node root = new Node(balls.get(0));
        for (int i=0; i<k;i++){
            balls.add(sc.nextInt());
        }
    }
}
