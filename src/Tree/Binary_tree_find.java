/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Binary_tree_find
 * Author:   李佳佳同学
 * Date:     2020/6/9 23:27
 * Description: 二叉搜索树的查找：非递归
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Tree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉搜索树的查找：非递归〉
 *
 * @author 李佳佳同学
 * @create 2020/6/9
 * @since 1.0.0
 */
public class Binary_tree_find {


    public Node find(Node node,int x){
        if(node==null){
            return null;
        }
        while(node!=null){
            if(x>node.val){
                node=node.right;
            }
            else if(x<node.val){
                node=node.left;
            }
            else{
                return node;
            }
        }
        return null;
    }
}
