/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: LevelTraversal
 * Author:   李佳佳同学
 * Date:     2020/6/5 17:52
 * Description: 层次遍历
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Binary_Tree_Traversal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 〈一句话功能简述〉<br> 
 * 〈层次遍历〉
 *
 * @author 李佳佳同学
 * @create 2020/6/5
 * @since 1.0.0
 */
public class LevelTraversal {

    public void Level_traversal(LTNode node ){

            Queue<LTNode> q=new LinkedList();
            q.add(node) ;
            while(!q.isEmpty()){
                LTNode t=q.poll();
                System.out.println(t.val);
                if(t.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null)
                {
                    q.offer(node.right);
                }
            }
    }


}

class LTNode{
    LTNode left;
    LTNode right;
    int val;
}