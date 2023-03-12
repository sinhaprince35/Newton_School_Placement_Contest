import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        HashMap<Integer, Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        int freq[]=new int[n];
        for(int i=0;i<n-1;i++){
            freq[i]=-1;
            for(int j=i+1;j<n;j++){
                if(hm.get(arr[i])<= hm.get(arr[j])){
                    freq[i]=j+1;
                    break;
                }
            }
        }
        freq[n-1]=-1;
        for(int i=0;i<n;i++){
            System.out.print(freq[i]+" ");
        }
    }
}