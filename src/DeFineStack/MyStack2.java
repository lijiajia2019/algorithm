/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: MyStack2
 * Author:   李佳佳同学
 * Date:     2020/6/2 10:01
 * Description: 实现一个定容的，泛型的栈
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package DeFineStack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈实现一个定容的，泛型的栈〉
 *
 * @author 李佳佳同学
 * @create 2020/6/2
 * @since 1.0.0
 */
public class MyStack2<Item> {

    private int N; //size
    private Item[]  a;

    //定义一个泛型数组。
    public void capacity(int c)
    {
       a=(Item[])new Object[c];
    }

    public int size(){
        return N;
    }
    public boolean isEmpty()
    {
        return N==0;
    }

    public void push(Item item){
        a[N++]=item;
    }


    public Item pop(){
        return a[--N];
    }

}
