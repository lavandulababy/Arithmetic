package Study;

public class NestTry1 {
    static void nesttry(int a){
        try{
            if(a==1){
                a=a/(a-a);
            }
            if(a==2){
                int c[]={1};
                c[42]=99;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds"+e);
        }
    }

    public static void main(String[] args) {
        try{
            int a=args.length+1;
            int b=42/a;
            System.out.println("a="+a);
            nesttry(a);
        }catch(ArithmeticException e){
            System.out.println("Divide by 0"+e);
        }
    }
}
