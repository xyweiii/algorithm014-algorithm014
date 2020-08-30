package com.sioo.discover.api.week_03;

/**
 * Project:sioo-discover-api
 * File: com.sioo.discover.api.week_03
 *
 *
 * 二叉树的最近公共祖先
 *
 *
 * @author : xywei
 * @date : 2020-08-30
 */
public class LowestCommonAncestor {

    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    private TreeNode ans;

    public LowestCommonAncestor() {
        this.ans = null;
    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        boolean lson = dfs(root.left, p, q);
        boolean rson = dfs(root.right, p, q);
        if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
            ans = root;
        }
        return lson || rson || (root.val == p.val || root.val == q.val);
    }
}
