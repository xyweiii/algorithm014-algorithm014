package com.sioo.discover.api.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Project:sioo-discover-api
 * File: com.sioo.discover.api.test
 *
 * @author : xywei
 * @date : 2020-08-23
 */
public class InorderTraversal {


    class TreeNode {
        public int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static ArrayList<Integer> list = new ArrayList<>();


    /**
     * 中序遍历
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root,List<Integer> list) {
         list = list==null? new ArrayList<>():list;
        if (root == null)
            return list;
        if (root.left != null) //左
            inorderTraversal(root.left,list);
        list.add(root.val); //中
        if (root.right != null)    //右
            inorderTraversal(root.right,list);
        return list;
    }
}
