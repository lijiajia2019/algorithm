/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: MyStack1
 * Author:   李佳佳同学
 * Date:     2020/6/2 9:52
 * Description: 定义一个定容栈，固定的容量，存储相同的数据类型
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package DeFineStack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈定义一个定容栈，固定的容量，存储相同的数据类型〉
 *
 * @author 李佳佳同学
 * @create 2020/6/2
 * @since 1.0.0
 */
public class MyStack1 {
    private   int N;//size
    private String [] str;

    public void capacity(int c){
        str=new String[c];
    }
    public boolean isEmpty(){return N==0;}
    public void push(String string) {
        str[N++]=string; //n++赋值后再加
    }

    public String pop()
    {
        return str[--N]; //--N 直接就先减法运算再取出对应的下标的值。
    }

}
