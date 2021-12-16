package binary.tree;

public class Node {
    
    private int data;
    private Node kiri;
    private Node kanan;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getKiri() {
        return kiri;
    }

    public void setKiri(Node kiri) {
        this.kiri = kiri;
    }

    public Node getKanan() {
        return kanan;
    }

    public void setKanan(Node kanan) {
        this.kanan = kanan;
    }
}
