package com.abner.yan.lambda.demo.methodPreference;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 16:40
 * @Description:
 */
public class ObjectMethodPreference {
    public static void printLog(PrintTable printTable){
        printTable.print("hello");
    }

    public static void main(String[] args) {
       /* printLog(s ->{
            MethodObject methodObject = new MethodObject();
            methodObject.printLog(s);
        });*/
       //通过对象引用方法
        MethodObject methodObject = new MethodObject();
        printLog(methodObject::printLog);
        //通过类名引用静态方法
        printLog(MethodObject::printLog1);
    }
}
