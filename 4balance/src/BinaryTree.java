import java.util.Arrays;

public class BinaryTree {
    //размер всего дерева
    int size;
    //корневой элемент, нужен для обхода всего дерева
    BinaryTree root;
    //метод для получения размера
    public int getSize() {
        return size;
    }

    int value;
    BinaryTree lchild; // левый потомок
    BinaryTree rchild; // правый потомок

    public BinaryTree(int value) {
        this.value = value;
        this.lchild = null;
        this.rchild = null;
        size++;
        //если корня еще нет
        if (root == null) {
            root=this;
        }
    }
    /* конструктор для внутренних методов
        root - корневой элемент, передается от родителя к потомку
        size - размер на данный момент
        value - значение
     */
    private BinaryTree(BinaryTree root,int size,int value) {
        this.value = value;
        this.lchild = null;
        this.rchild = null;
        this.size=size;
        this.root=root;
    }
    /* метод вставки элементов в дерево
          node - ссылка на текущий узел дерева
          для создания дерева будем передавать null в качестве node
          valueNode - значение, которое добавляем в дерево
       */
    public BinaryTree insertNode(BinaryTree node, int targetValue) {
        // если дерево пустое
        if (node == null) {
            root=new BinaryTree(targetValue);
            return node;
        }
             /*если значение в текущем узле больше valueNode, то переходим в
               левое поддерево*/
        if (node.value > targetValue) {
            //если левого потомка нет, то создаем его с значением valueNode
            if (node.lchild == null) {
                size++;
                return node.lchild = new BinaryTree(root,size,targetValue);
                // если левый потомок есть, то переходим ниже в левое поддерево
            }
            else
                return insertNode(node.lchild, targetValue);
        }
             /*если значение в текущем узле меньше вставляемого,
               то переходим в правое поддерево*/
        else if (node.value < targetValue) {
            //если правого потомка нет, то создаем его с значением valueNode
            if (node.rchild == null)
            {
                size++;
                return node.rchild = new BinaryTree(root,size,targetValue);
                // если правый потомок есть, то переходим ниже в правое поддерево
            }else
                return insertNode(node.rchild, targetValue);
        }
        // Если ключи одинаковые, вставки не происходит
        return null;
    }

    // метод вывода дерева на экран
    public void printBinaryTree(BinaryTree node, int level) {
        if (node != null) {
            printBinaryTree(node.lchild, level + 1);
            for (int i = 0; i < level; i++)
                System.out.print("   ");//чем ниже уровень, тем отступ больше
            System.out.println(node.value);
            printBinaryTree(node.rchild, level + 1);
        }
    }
    // метод для получения всех элементов
    public int[] getAllElements(){
        int array[]=new int[this.getSize()];
        //внутренний класс для рекурсии
        class  Recursfun{
            int array[];
            int i=0;
            public Recursfun(int size) {
                array=new int[size];
            }

            public int[] getArray() {
                return array;
            }
            //рекурсивно обходим все объекты и добавляем значения в массив
            public void recurs(BinaryTree tree) {
                BinaryTree element = tree;
                if(element.lchild != null){
                    recurs(element.lchild);
                }
                if(element.rchild !=null){
                    recurs((element.rchild));
                }
                    array[i]=element.value;
                    i++;

            }
        }

        Recursfun recursfun=new Recursfun(this.getSize());
        recursfun.recurs(root);


        return recursfun.getArray();
    }
    //востановить баланс во вселенной(*щелчок*)
    public static BinaryTree setbalance(BinaryTree tree){
        //внутренний класс
        class PartArr{
            int arr[];
            int i=0;
            public PartArr(int size) {
                arr=new int[size];
            }

            public int[] getArr() {
                return arr;
            }
            /*рекурсия, в ней мы делим массив пополам
             и добавляем в массив arr серединный элемент
             рекурсия идет до момента пока массив не станет единичным
             */
            public void recurs(int size, int[] array){
                if(size==1){
                    arr[i]=array[0];
                    i++;
                    return;
                }
                int part1[]=new int[size/2];
                int part2[]=new int[size-size/2-1];

                arr[i]=array[size/2+1-1];
                i++;

                System.arraycopy(array,0,part1,0,size/2);

                recurs(size/2,part1);
                //проверка на то нужно ли создавать рекурсия для правой части или на этом всё
                if(size/2+2<=size) {
                    System.arraycopy(array,size/2+2-1,part2,0,size-size/2-1);
                    recurs(size - size / 2-1, part2);
                }
            }
        }
        int treebalance[] = new int[tree.getSize()];
        //получаем все элементы
        treebalance =tree.getAllElements();
        //сортируем
        Arrays.sort(treebalance);
        PartArr partArr=new PartArr(treebalance.length);
        //используем рекурсию чтобы получить массив arr
        partArr.recurs(treebalance.length,treebalance);
        //получаем arr
        treebalance=partArr.getArr();
        //создаем дерево сбалансированно-бинарное
        tree=new BinaryTree(treebalance[0]);
        for(int i=1;i<treebalance.length;i++){
            tree.insertNode(tree,treebalance[i]);
        }

        return tree;


    }
}
