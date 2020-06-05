/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution2
 * Author:   李佳佳同学
 * Date:     2020/6/5 15:39
 * Description: 快排
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package QuickSort;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈快排〉
 *
 * @author 李佳佳同学
 * @create 2020/6/5
 * @since 1.0.0
 */
public class Solution2 {
    public static void main(String[] args) {
        int [] a={6,1,1,1,1,1};
        qiucksort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }


    public static void qiucksort(int []a ,int left,int right){
        if(left>right)
            return ;
        int i=left;
        int j=right;
        int tem=a[left];
        while(i<j)
        {
            while(a[j]>=tem && i<j){
                j--;
            }
            while(a[i]<=tem &&i<j){
                i++;
            }
            //这里还可以加个if(i<j)语句，不过当两个相遇的时候，其实判断无所谓的。
            int aa=a[i];
            a[i]=a[j];
            a[j]=aa;
        }
        a[left]=a[i];
        a[i]=tem;

        qiucksort(a,left,i-1);
        qiucksort(a,i+1,right);

    }
}
