/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: BinaryTree_left
 * Author:   李佳佳同学
 * Date:     2020/5/31 21:47
 * Description: 二叉树的前序遍历
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Binary_Tree_Traversal;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的前序遍历〉
 *
 * @author 李佳佳同学
 * @create 2020/5/31
 * @since 1.0.0
 */


class Node{
    int val;
    Node left;
    Node right;


}
public  class BinaryTree {
//递归实现先序遍历
    public static void BinaryLeft(Node node)
    {
        while (node!=null)
        {
            System.out.println(node.val);
            BinaryLeft(node.left);
            BinaryLeft(node.right);
        }
    }

    //递归实现中序遍历
    public static void BinaryTreeMid(Node node)
    {
        while(node!=null)
        {
            BinaryTreeMid(node.left);
            System.out.println(node.val);
            BinaryTreeMid(node.right);
        }
    }

    //递归实现二叉树的后序遍历。
    public static void BinaryTreeEnd(Node node)
    {
        while(node!=null)
        {
            BinaryTreeEnd(node.left);
            BinaryTreeEnd(node.right);
            System.out.println(node.val);
        }
    }

    //--------------------------------------二叉树的非递归实现-------------------------------------------------





}

