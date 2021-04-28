import java.util.*;

public class Main {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            BinaryTree tree = new BinaryTree(a);
            tree.insertNode(tree,a);
            while (true) {
                a=in.nextInt();
                if(a==0){
                    break;
                }
                //вводим в обычное дерево
                tree.insertNode(tree, a);
                //делаем из обычного дерева сбалансированное
                tree = BinaryTree.setbalance(tree);
                //выводи дерево
                tree.printBinaryTree(tree, 0);
            }

        }

}
