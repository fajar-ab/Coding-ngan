package binary.tree;

public class BinaryTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void tambahNode(Node note) {
        if (root == null) {
            root = note;
        } else {
            insertNode(root, note);
        }

        System.out.println("Data bertambah");
    }

    public void insertNode(Node parent, Node note) {

        if (parent.getData() > note.getData()) {
            if (parent.getKiri() == null) {
                parent.setKiri(note);
            } else {
                insertNode(parent.getKiri(), note);
            }
        } else if (parent.getData() < note.getData()){
            if (parent.getKanan() == null) {
                parent.setKanan(note);
            } else {
                insertNode(parent.getKanan(), note);
            }
        }
    }

    public void preOrder(Node root) {
        if(root != null){
            System.out.print(root.getData() + " ");
            preOrder(root.getKiri());
            preOrder(root.getKanan());
        }
    }

    public void inOrder(Node root) {
        if(root != null){
            inOrder(root.getKiri());
            System.out.print(root.getData() + " ");
            inOrder(root.getKanan());
        }
    }

    public void postOrder(Node root) {
        if(root != null){
            postOrder(root.getKiri());
            postOrder(root.getKanan());
            System.out.print(root.getData() + " ");
        }
    }
}
