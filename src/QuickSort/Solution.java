/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/5 13:51
 * Description: 快速排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package QuickSort;

import java.util.Arrays;
import java.util.jar.JarEntry;

/**
 * 〈一句话功能简述〉<br> 
 * 〈快速排序〉
 *
 * @author 李佳佳同学
 * @create 2020/6/5
 * @since 1.0.0
 */
public class Solution {

    public static void main(String[] args) {
        int [] a={1,3,2,6,4,8};
        qiucksort(a,0,5);
        System.out.println(Arrays.toString(a));
    }

    public static void qiucksort(int [] a ,int left,int right){

        if(left>right)
            return ;

        int i=left;
        int j=right;
        int tem=a[left];
        while(i<j){
            while(a[j]>=tem && i<j){
                j--;
            }
            while(a[i]<=tem && i<j ){
                i++ ;
            }
            //i、j位置交换
            int  aa=a[i];
            a[i]=a[j];
            a[j]=aa;
        }
        //i和基准数交换。
        a[left]=a[i];
        a[i]=tem;

        qiucksort(a,left,i-1);
        qiucksort(a,i+1,right);


    }

}
