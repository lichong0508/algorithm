package com.nowcoder;

public class ReConstructBinaryTree {
	/**
	 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
	 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
	 * 则重建二叉树并输出它的后序遍历序列。
	 * (测试用例中，"树"的输出形式类似于树的层次遍历，没有节点的用#来代替)
	 * @param pre
	 * @param in
	 * @return
	 */
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	return buildTree(pre, 0, pre.length - 1, 
                in, 0, in.length - 1);
    }
    public TreeNode buildTree(int[] preorder, int pStart, int pEnd,
            int[] inorder, int iStart, int iEnd) {
        if (pEnd - pStart != iEnd - iStart || pStart > pEnd || iStart > iEnd)
            return null;
        TreeNode root = new TreeNode(preorder[pStart]);
        int i = iStart;
        while (i <= iEnd && inorder[i] != preorder[pStart]) {
            i++;
        }
        root.left = buildTree(preorder, pStart + 1, pStart - iStart + i, 
                inorder, iStart, i - 1);
        root.right = buildTree(preorder, pStart - iStart + i + 1, pEnd, 
                inorder, i + 1, iEnd);
        return root;
    } 
}
