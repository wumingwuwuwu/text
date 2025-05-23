package AAAAA.ObjectTest.sample04;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2020/12/3 - 12 - 03 - 22:40
 */
public class Test {
    public static void main(String[] args) {
        //创建一个人类的具体的对象/实例：
        //创建一个对象，对象的名字叫：Wuzeyu
        //Person 属于 引用数据类型
        //第一次加载类的时候，会进行类的加载，初始化创建对象的时候，对象的属性没有给赋值，有默认的初始化的值。
        Person Wuzeyu = new Person();
        Wuzeyu.name = "吴泽羽";
        Wuzeyu.age = 18;
        Wuzeyu.height = 1.79;
        Wuzeyu.weight = 75.1;

        //再创建一个对象：
        //再次创建类的时候，就不会进行类的加载了，类的加载只在第一次需要的时候加载一次
        Person ls = new Person();
        ls.name = "李四";
        ls.age = 18;
        ls.height = 170.6;
        ls.weight = 160.5;

        //对属性值进行读取：
        System.out.println(Wuzeyu.name);
        System.out.println(ls.age);
        
        //对方法进行操作：
        //不同的对象，属性有自己的特有的值，但是方法都是调用类中通用的方法。
        //属性：各个对象的属性是独立的，
        //方法：各个对象的方法是共享的。
        Wuzeyu.eat();
        ls.eat();
        Wuzeyu.sleep("教室");
        /*String str = zs.introduce();
        System.out.println(str);*/
        System.out.println(Wuzeyu.introduce());
    }
}
