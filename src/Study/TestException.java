package Study;

public class TestException {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        try{//监控区域
            if(b==0)throw new ArithmeticException();
            System.out.println("a/b的值是："+a/b);
            System.out.println("this will not be printed");

        }catch(ArithmeticException e){//匹配区域
            System.out.println("程序出现异常，变量b不能为0！"+e);
        }
        System.out.println("程序正常结束");
    }
}
//throws 举例
class TestThrows{
    //不想处理异常时，应该进行声明throws
    static void throw1() throws IllegalAccessException{
        System.out.println("Inside throw1 . ");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args){
        try{
            throw1();
        }catch(IllegalAccessException e){
            System.out.println("Cauht "+e);
        }

    }
}
