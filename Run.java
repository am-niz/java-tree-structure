import java.util.List;

public class Run {
    public static void main(String[] args) {
        Node<String> parentNode = new Node<String>("One");
        Node<String> childNode1 = new Node<String>("four", parentNode);
        Node<String> childNode2 = new Node<String>("two");

        childNode2.setParent(parentNode);

        Node<String> grandchildNode = new Node<String>("five", childNode1);
        List<Node<String>> childrenNodes = parentNode.getChildren();

        // Print information about the nodes
        System.out.println("Parent Node: " + parentNode.getData());
        System.out.println("Child Nodes:");
        for (Node<String> child : childrenNodes) {
            System.out.println("- " + child.getData());
            List<Node<String>> grandchildren = child.getChildren();
            for (Node<String> grandchild : grandchildren) {
                System.out.println("  - " + grandchild.getData());
            }
        }
    }
}
