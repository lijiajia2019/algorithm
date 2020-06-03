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


import java.util.LinkedList;
import java.util.Stack;

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


    //非递归中序遍历

    public void inOrderTraverse2(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        Node pNode = root;
        while (pNode != null || !stack.isEmpty()) {
            if (pNode != null) {
                stack.push(pNode);
                pNode = pNode.left;
            } else { //pNode == null && !stack.isEmpty()
                Node node = stack.pop();
                System.out.print(node.val+"  ");
                pNode = node.right;
            }
        }
    }


   //改进中序遍历代码
    public void  inOrderTraverse3(Node node){
        Stack<Node> stack=new Stack<Node>();
        Node myNode=node;
        while(myNode!=null||!stack.isEmpty()){
            while(node!=null){
                stack.push(myNode);
                myNode=myNode.left;
            }
            if(myNode==null&&!stack.isEmpty()){
                Node p=stack.pop();
                System.out.println(p.val);
                myNode=p.right;
            }
        }
    }






}

