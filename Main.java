import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    // Step 1 - Create a BST tree object called lab5Tree
    BST<Integer> lab5Tree = new BST<Integer>();

    // Step 2 - Insert the following values: 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10
    lab5Tree.insert(13);
    lab5Tree.insert(22);
    lab5Tree.insert(36);
    lab5Tree.insert(5);
    lab5Tree.insert(48);
    lab5Tree.insert(17);
    lab5Tree.insert(39);
    lab5Tree.insert(2);
    lab5Tree.insert(26);
    lab5Tree.insert(40);
    lab5Tree.insert(29);
    lab5Tree.insert(34);
    lab5Tree.insert(10);

    // Step 3 - Delete the value 17
    lab5Tree.delete(17);

    // Step 4 - Traverse and output the values using inorder (sorted)
    lab5Tree.inorder();

    // Step 5 - Traverse and output the values using postorder
    lab5Tree.postorder();

    // Step 6 - Traverse and output the values using preorder
    lab5Tree.preorder();

    // Step 7 - Display the result of a search for the value 36
    System.out.println(lab5Tree.search(36));

    // Step 8 - Display the result of a search for the value 37
    System.out.println(lab5Tree.search(37));

    // Step 9 - Using the path() method, display the path from the root to 2
    ArrayList<BST.TreeNode<Integer>> path = lab5Tree.path(2);
    for (BST.TreeNode<Integer> node : path) 
    {
      System.out.println((node.element));
    }

    // Step 10 - Display the path from the root to 34
    path = lab5Tree.path(34);
    for (BST.TreeNode<Integer> node : path) 
    {
      System.out.println((node.element));
    }
  }
}