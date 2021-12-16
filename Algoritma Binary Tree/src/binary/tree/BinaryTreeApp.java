package binary.tree;

import java.io.IOException;
import java.util.Scanner;

public class BinaryTreeApp {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();

        int pilihan;

        do {

            clrscr();
            System.out.println("\nPROGRAM BINARY TREE");
            System.out.println("-------------------");
            System.out.println("\nMenu");
            System.out.println("1. Tambah");
            System.out.println("2. Lihat pre-order");
            System.out.println("3. Lihat in-order");
            System.out.println("4. Lihat post-order");
            System.out.println("0. Exit");

            System.out.print("\nPilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nInput");
                    System.out.println("-----");
                    System.out.print("Data baru : ");
                    binaryTree.tambahNode(new Node(scanner.nextInt()));
                    
                    break;

                case 2:
                    System.out.println("\nOUTPUT PRE ORDER :");
                    System.out.println("------------------");

                    if(binaryTree.getRoot() != null) {
                        binaryTree.preOrder(binaryTree.getRoot());
                    } else {
                        System.out.println("Masih kosong!");
                    }

                    break;
                    
                case 3:
                    System.out.println("\nOUTPUT IN ORDER : ");
                    System.out.println("------------------");

                    if(binaryTree.getRoot() != null) {
                        binaryTree.inOrder(binaryTree.getRoot());
                    } else {
                        System.out.println("Masih kosong!");
                    }

                    break;

                case 4:
                    System.out.println("\nOUTPUT POST ORDER :");
                    System.out.println("-------------------");

                    if(binaryTree.getRoot() != null) {
                        binaryTree.postOrder(binaryTree.getRoot());
                    } else {
                        System.out.println("Masih kosong!");
                    }

                    break;
                
                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("menu tidak ada");
            }

            System.in.read();

        } while (pilihan != 0);
    }

    private static void clrscr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException ignored) {}
    }
}
