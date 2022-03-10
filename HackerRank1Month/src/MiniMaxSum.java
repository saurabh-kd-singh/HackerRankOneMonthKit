import java.util.Scanner;
public class MiniMaxSum {

	public static void main(String[] args) {
		MiniMaxSum ms = new MiniMaxSum();
		
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		
		System.out.println("Enter 5 Elements one by 1 : ");
		for(int i=0; i<5; i++) {
			arr[i]=sc.nextInt();
		}
		
		ms.min_max(arr);
		
	}
	
//--------------------------------------------------------------------
	public void min_max(int[] arr) {
		long min=0 , max=0,  sum=0;
	       min=arr[0];
	       max=min;
	       sum=min;
	       
	       for(int i=1; i<arr.length; i++){
	           sum = sum + arr[i];
	           
	           if(arr.length < min){
	               min = arr[i];
	           }
	           
	            if(arr.length > max){
	               max = arr[i];
	           }
	       }
	       
	       System.out.println((sum-max)+ " " + (sum-min));
	}

}
