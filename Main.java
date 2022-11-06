public class Main {

   /* static int fibonacci(int x){
     int i,total2,j=1,total=0;
     for(i=2 ; i<=x ;i++){
         total2 = total +j;
         System.out.println(total+ " + "+j+" = "+total2);
                 total = j;
                 j=total2;
                 System.out.println();
     }
     return i;
    }

    public static void main(String[] args) {
    int a=fibonacci(6);


    }*/

    static int fibonacci(int x){

        if(x==1 || x==2){
            return 1;
        }

        return fibonacci(x-1)+fibonacci(x-2);
    }
    public static void main(String[] args){
        System.out.println(fibonacci(6));
    }
}
