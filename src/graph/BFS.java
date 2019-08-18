package graph;

import java.util.LinkedList;

public class BFS {
	
	
	
	final String TAG =  BFS.class.getSimpleName();
	
	LinkedList<Integer> adj[];
	int mVertices = 4;
	
	
	public BFS() {
		// TODO Auto-generated constructor stub
		adj = new LinkedList[mVertices];
		for(int i =0; i< mVertices; i++) {
			adj[i] = new LinkedList<Integer>();
		}
		
		addEdge(0, 1); 
        addEdge(0, 2); 
        addEdge(1, 2); 
        addEdge(2, 0); 
        addEdge(2, 3); 
        addEdge(3, 3); 
        
        for( LinkedList<Integer> list: adj) {
        	System.out.println("each vertices size - "+list.size());
        }
        
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
        	
       findBFS(2); 
		
		
	}
	
	public void addEdge(int src, int dec) {
		
		adj[src].add(dec);
		
		
		
	}
	
//	https://www.youtube.com/watch?v=K9ptqh2pU9M
	
	public void findBFS(int startVertices){
		
		System.out.println(TAG);
		
	}
	
	

}
