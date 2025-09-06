import java.util.*;
 public class threesum {
    public static List<List<Integer>>sum(int arr[]){
        List<List<Integer>>re=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            if(i>0 && arr[i]==arr[i-1])continue;
            int l=i+1;
            int r=arr.length-1;
            while(l<r){
                int s=arr[i]+arr[l]+arr[r];
                if(s==0){
                    re.add(Arrays.asList(arr[i],arr[l],arr[r]));
                    while(l<r && arr[l]==arr[l+1])l++;
                    while(l<r && arr[r]==arr[r-1])r--;
                    l++;
                    r--;
                }
                else if(s<0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
          return re;
    }
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>>an=sum(arr);
        if(an.isEmpty()){
            System.out.println("No unique triplet is found");
        }
        else{
        for(List<Integer>v:an){
            System.out.println(v);
        }
        }
    }
 }