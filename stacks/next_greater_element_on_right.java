import java.util.*;

public class Main {
  
public static int[] solve(int[] arr){
  int[] ng=new int[arr.length];
  
  Stack<Integer> st=new Stack<>();
  
  st.push(arr[arr.length-1]);
  ng[arr.length-1]=-1;
  
  for(int i=arr.length-2;i>=0;i--){
    while(st.size()>0 && arr[i]>=st.peek()){
      st.pop();
    }
    
    if(st.size()==0){
      ng[i]=-1;
    }else{
      ng[i]=st.peek();
    }
    
    st.push(arr[i]);
  }
  
  return ng;
  
  
}

    public static void main(String[] args) {
      int [] arr={2,5,9,3,1,12,6,8,7};
      
      int[] result=solve(arr);
      
      System.out.println("Next greater elements");
      
      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i] + "->"+result[i]);
      }
  }
}
