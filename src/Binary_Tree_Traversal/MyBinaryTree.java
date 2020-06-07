/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: MyBinaryTree
 * Author:   李佳佳同学
 * Date:     2020/6/5 17:07
 * Description: 前序遍历和中序遍历的非递归版本
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Binary_Tree_Traversal;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈前序遍历和中序遍历的非递归版本〉
 *
 * @author 李佳佳同学
 * @create 2020/6/5
 * @since 1.0.0
 */
public class MyBinaryTree {



    public void printleft(Node node){
        Stack<Node> stack=new Stack();

        while(node!=null|| !stack.isEmpty())
        {
            while(node!=null){
                System.out.println(node.val);
                stack.push(node);
                node=node.left;
            }
            //node==null则没有左子树。将节点置为右子树。(将stack的父节点弹出来置为右节点。)
            if(node==null && !stack.isEmpty())
            {
                Node rnode=stack.pop();
                node=rnode.right;
            }
        }




    }
}
