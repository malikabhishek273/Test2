import java.util.HashMap;
import java.util.Scanner;

public class Test {
    //This is a test for git
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int arr[]=new int[n];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x%60;
            map.putIfAbsent(arr[i],0);
            map.put(x%60,map.get(arr[i])+1);
        }
        for(int x:arr) {
            if (x != 30&&x != 0&&map.containsKey(60-x))
                ans += map.get(60 - x);
        }
        ans/=3;
        int zero=0;
        if(map.containsKey(0)) {
            zero = map.get(0);
        }
        ans+=((zero)*(zero-1))/2;

        int thirty=0;
        if(map.containsKey(30)) {
            thirty = map.get(30);
        }
        ans+=((thirty)*(thirty-1))/2;
        System.out.println(ans);

    }
}
