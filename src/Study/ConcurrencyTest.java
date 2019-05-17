package Study;

public class ConcurrencyTest {
    private static final long count=10001;

    public static void main(String[] args) throws InterruptedException{
        concurrency();
        serial();
    }
    //并发
    private static void concurrency() throws InterruptedException{
        long start=System.currentTimeMillis();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                int a=0;
                for(long i=0;i<count;i++){
                    a+=5;
                }
            }
        });
        thread.start();
        int b=0;
        for(long i=0;i<count;i++){
            b--;
        }
        long time=System.currentTimeMillis()-start;
        thread.join();
        System.out.println("Concurrency:"+time+"ms,b="+b);
    }
    //串行
    private static void serial(){
        long start =System.currentTimeMillis();
        int a=0;
        for(long i=0;i<count;i++){
            a+=5;
        }
        int b=0;
        for(long i=0;i<count;i++){
            b--;
        }
        long time=System.currentTimeMillis()-start;
        System.out.println("Concurrency:"+time+"ms,b="+b+",a="+a);
    }
}
