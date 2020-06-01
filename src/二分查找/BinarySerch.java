/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: 二分查找
 * Author:   李佳佳同学
 * Date:     2020/6/1 21:11
 * Description: 二分查找
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 二分查找;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二分查找〉
 *
 * @author 李佳佳同学
 * @create 2020/6/1
 * @since 1.0.0
 */
public class BinarySerch {
    public static void main(String[] args) {
        int [] array={1,3,4,6,2,5};
        System.out.println(BinarySerch(array,1));
    }

    //用二分查找找出数组中包含Key的下标，没有返回-1.
    public static int BinarySerch(int [] a,int key)
    {
        int mid;
    int low=0;
    int height=a.length-1;
    while(low<=height)
    {
        mid=(low+height)/2;
        if(key>a[mid]){
            low=mid+1;
        }
        else if(key<a[mid]){
            height=mid-1;
        }
        else{
            return mid;
        }
    }

        return -1;
    }
}
