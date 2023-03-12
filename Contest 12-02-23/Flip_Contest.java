import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
                sum++;
            }
            else if(c>='0' && c<='9'){
                int num=c-'0';
                if(num%2==1){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}