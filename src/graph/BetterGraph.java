package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class BetterGraph {

	LinkedList<String>[] graphL;

	int vertex;
	int vertextIndex = 0;

	Map<String, Node> hmVertexes = new HashMap<String, Node>();

	public BetterGraph(int vertext) {

		this.vertex = vertext;

	}

	public void addVertices(String str) {
		createNewPathSrc(str);
	}

	public void createNewPathSrc(String str) {
		Node node = new Node(str);
		hmVertexes.put(str, node);
	}

	public void addEdges(String src, String des) {
		appendNewVertex(hmVertexes.get(src), des);
	}

	// Append the new node
	public void appendNewVertex(Node node, String data) {

		if (node == null) {
			return;
		}
		Node current = node;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);

	}

	public void printPath(Node node) {

		System.out.println("Path for Vertex : " + node.getData());

		while (node != null) {
			System.out.print("Can go to -> " + node.vertex + "\n");
			node = node.next;

		}

		System.out.println("\n");

	}

	public void printPathForEachVertex() {
		for (String objectName : hmVertexes.keySet()) {
			printPath(hmVertexes.get(objectName));

		}

	}

	class Node {

		String vertex;
		Node next;

		Node(String vertex) {
			this.vertex = vertex;
			this.next = null;
		}

		public String getData() {
			return vertex;
		}

		public void setData(String vertex) {
			this.vertex = vertex;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
