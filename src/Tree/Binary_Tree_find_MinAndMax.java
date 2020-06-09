/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Binary_Tree_find_MinAndMax
 * Author:   李佳佳同学
 * Date:     2020/6/9 23:34
 * Description: 查找二叉树的最大结点和最小结点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Tree;

import com.sun.org.apache.xpath.internal.objects.XNull;

/**
 * 〈一句话功能简述〉<br> 
 * 〈查找二叉树的最大结点和最小结点〉
 *
 * @author 李佳佳同学
 * @create 2020/6/9
 * @since 1.0.0
 */
public class Binary_Tree_find_MinAndMax {

    public Node find_min(Node node) {
        if(node==null){
            return null;
        }

        while(node.left!=null){ //有左孩子才进去。
            node=node.left;
        }
        //当没有做孩子，返回node。
        return node;
    }

    //递归方式实现。
    public Node find_Max(Node node){
        if(node==null){
            return null;
        }
        else if(node.right==null){
            return node;
        }
        else{
            return find_Max(node.right);
        }

    }
}
