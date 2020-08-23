package com.sioo.discover.api.test;

import java.util.LinkedList;
import java.util.List;

/**
 * Project:sioo-discover-api
 * File: com.sioo.discover.api.test
 *
 * 二叉树的前序遍历
 *
 * @author : xywei
 * @date : 2020-08-23
 */
public class PreorderTraversal {

    class TreeNode {
        public int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /**
     * 前序遍历
     *
     * @param root
     * @return
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            output.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return output;
    }
}
