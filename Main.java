class Main{
    public static void main(String[] args){
        //Tree (root)
        //nodes(value,left child,right child)
        //insert(value)
        //find(value):boolean
        Tree tree=new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(10);
        System.out.println(tree.find(11));
    }
}