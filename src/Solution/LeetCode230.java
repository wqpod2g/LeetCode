package Solution;

public class LeetCode230 {
	private int n = 0;
	private TreeNode re_node;

	// 中序遍历二叉排序树
	public void InOrderTravel(TreeNode root, int k) {
		if (root != null) {
			InOrderTravel(root.left, k);
			n++;
			if (n == k) {
				this.re_node = root;
				return;
			}
			InOrderTravel(root.right, k);
		}
	}

	public int kthSmallest(TreeNode root, int k) {
		InOrderTravel(root, k);
		return this.re_node.val;
	}

}
