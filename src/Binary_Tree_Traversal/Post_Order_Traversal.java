/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Post_Order_Traversal
 * Author:   李佳佳同学
 * Date:     2020/6/7 11:32
 * Description: 后序遍历的非递归
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Binary_Tree_Traversal;

import javax.swing.tree.TreeNode;
import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈后序遍历的非递归〉
 *
 * @author 李佳佳同学
 * @create 2020/6/7
 * @since 1.0.0
 */
public class Post_Order_Traversal {

    public static void main(String[] args) {


    }

}

class Node1{
    Node1 left;
    Node1 right;
    int val;
    Node1(){}
    Node1(int x){
        val=x;
    }

    public void Post_Order(Node root){
        Node T=root; //副本存储，防止改变原本的链表
        Node P=null; //存储上一次打印过的结点。
        Stack<Node> s=new Stack<Node>();
        while(!s.isEmpty()||T!=null){

            //一直往左并将沿途的结点入栈。
            while(T!=null){
                s.push(T);
                T=T.left;
            }

            //此时沿途左孩子的结点全部入栈。我们需要判断是否有右孩子，如果没有右孩子或者右孩子已经遍历过，就直接打印当前节点的值，并且让P=当前节点的值，
            //当下一次从栈弹出它的根节点node.right==P来判断，如果相等则说明遍历过，。
            if(!s.isEmpty()){
                T=s.pop();

                //这个判断是判断右孩子已经遍历或者不存在的情况。
                if(T.right==P||T.right==null){ //这里使用T.rignt的原因是，左边结点此时已经全部再栈中，我们只需要判断右节点的两种情况就好了：①不存在；②存在是否访问过
                    System.out.println(T.val);
                    P=T; //让
                    //打印过T的值。说明左右子树都已经遍历完毕。直接置为null。
                    T=null;
                }

                else{
                    s.push(T.right); //在上一个if语句中，发现它有由子树，重新入栈。
                    //把结点指向右子树，继续往下遍历。
                    T=T.right;
                }
            }

        }
    }
}