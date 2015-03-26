package Solution;

import java.util.HashMap;
import java.util.Map;

/**
 * Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.


OJ's undirected graph serialization:
Nodes are labeled uniquely.

We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
As an example, consider the serialized graph {0,1,2#1,2#2,2}.

The graph has a total of three nodes, and therefore contains three parts as separated by #.

First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
Second node is labeled as 1. Connect node 1 to node 2.
Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
Visually, the graph looks like the following:

       1
      / \
     /   \
    0 --- 2
         / \
         \_/
 * @author wangqiang
 *
 */
public class LeetCode133 {
	
	 private Map<Integer,UndirectedGraphNode> map = new HashMap<Integer,UndirectedGraphNode>();
	    
	    //深度优先遍历并复制节点
	    public UndirectedGraphNode DFS_clone(UndirectedGraphNode node) {
	        if(node==null) return null;
	        if(map.containsKey(node.label)) return map.get(node.label);
	        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
	        map.put(newNode.label,newNode);
	        for(UndirectedGraphNode N:node.neighbors) {
	            newNode.neighbors.add(DFS_clone(N));
	        }
	        return newNode;
	    }
	    
	    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
	        return DFS_clone(node);
	    }

}
