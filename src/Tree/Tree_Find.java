/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Tree_Find
 * Author:   李佳佳同学
 * Date:     2020/6/9 23:21
 * Description: 二叉树的查找
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Tree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的查找:使用递归的方式〉
 *
 * @author 李佳佳同学
 * @create 2020/6/9
 * @since 1.0.0
 */
public class Tree_Find {


public Node findNode(Node node,int x){
    if(node ==null){
        return node;
    }
    else if(x>node.val){
        return findNode(node.right,x);
    }
    else if(x<node.val){
        return findNode(node.left,x);
    }
    else{
        return node;
    }

}

}
