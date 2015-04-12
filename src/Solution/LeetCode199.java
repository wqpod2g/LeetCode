package Solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

For example:
Given the following binary tree,
   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
You should return [1, 3, 4].
 * 
 * @author wangqiang
 *
 */
public class LeetCode199 {
	
	  public List<Integer> rightSideView(TreeNode root) {
	        List<Integer> re_list = new ArrayList<Integer>();
	        List<TreeNode> level_list = new ArrayList<TreeNode>();//层序遍历时存储当前层节点的list
	        if(root==null) return re_list;
	        level_list.add(root);
	        re_list.add(root.val);
	        int flag = 1;
	        while(flag==1) {
	            flag = 0;
	            List<TreeNode> tmp_list = new ArrayList<TreeNode>();//用来存储下一层节点的list
	            for(TreeNode node:level_list) {
	                if(node.left!=null) {
	                    flag = 1;//说明下层还存在节点
	                    tmp_list.add(node.left);
	                }
	                if(node.right!=null) {
	                    flag = 1;//说明下层还存在节点
	                    tmp_list.add(node.right);
	                }
	            }
	            int size = tmp_list.size();
	            if(tmp_list.size()!=0) {
	                re_list.add(tmp_list.get(size-1).val);//记录当前层最右边节点
	                level_list.clear();
	                level_list.addAll(tmp_list);//迭代
	            }
	        }
	        return re_list;
	    }

}
