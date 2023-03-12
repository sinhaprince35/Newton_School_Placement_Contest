import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int k=sc.nextInt();
        int []arr=new int[k];
        int sum=0;
        int start=0;
        int count=0;
        for(int i=0; i<q;i++){
            String query=sc.next();
            if(query.equals("1")){
                int x=sc.nextInt();
                if(count<k){
                    arr[count++]=x;
                    sum+=x;
                }else{
                    sum=sum-arr[start%k]+x;
                    arr[start++ % k]=x;
                }
            }else if(query.equals("2")){
                System.out.println(sum);
            }
        }
    }
}