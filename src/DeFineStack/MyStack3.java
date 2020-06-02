/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: MyStack3
 * Author:   李佳佳同学
 * Date:     2020/6/2 10:18
 * Description: 用数组实现一个可动态调整栈的大小的栈
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package DeFineStack;

import java.util.Iterator;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用数组实现一个可动态调整栈的大小的泛型栈〉
 *
 * @author 李佳佳同学
 * @create 2020/6/2
 * @since 1.0.0
 */
public class MyStack3<Item> {

private int N=0;
private  Item[] a=(Item[])new Object[1];

public int size()
{
    return N;
}

//扩容或者缩小。
public void resive(int n){
    Item[] a2=(Item []) new Object[n];
    for(int i=0;i<a.length;i++)
    {
        a2[i]=a[i];
    }
    //扩容或者缩小操作。
    a=a2;

}

//如果数组已满，那就扩容为原来的两倍。
public void push(Item item){
    if(N==a.length)
    {
        resive(a.length*2);
    }
    a[N++]=item;
}

public Item pop(){
    Item item=a[--N];

    //弹出之后让对象游离，置为null，让垃圾回收机制回收。，注意此时N已经被减过了，不需要a[--N]来让它游离。
    a[N]=null;
   /* if(N<(a.length/4)){
        resive(a.length/2);
    }*/
   if(N>0&&N==a.length/4){
       resive(a.length/2);
   }
    return item;


}

    //---------------------实现迭代----------------------------------------
    //所谓实现迭代，就是这个栈可以使用foreach来迭代。
public Iterator<Item> iterator(){
    return new implementItem();
    }
    private class implementItem implements Iterator<Item>{

    //这里最好有一个成员变量i来赋值成N。不要让N改变值。
        private int  i=N;
        @Override
        public boolean hasNext() {
            return i==0;
        }

        @Override
        public Item next() {
            return a[--i];
        }
    }
}
