public class Main {
    public static void main(String[] args) {
            // массив значений для добавления в дерево
            int b[] = { 10, 15, 28, 30, 45, 50, 70};
            BinaryTree tree = new BinaryTree(b[0]);
            // добавление элементов массива в дерево
            for (int i = 1; i < b.length; i++)
                tree.insertNode(tree, b[i]);
            // вывод содержимого дерева
            tree.printBinaryTree(tree, 0);

    }
}
