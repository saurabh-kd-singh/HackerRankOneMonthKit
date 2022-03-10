public class Plus_Minus {

	public static void main(String[] args) {
		Plus_Minus pm = new Plus_Minus();
		
		int[] arr = {1, 1 , 0 , -1 ,-1};

		pm.Plus_Minus_Code(arr);
	}

//--------------------------------------------------------------------------------------------------
	
	public void Plus_Minus_Code(int[] arr) {
		int size = arr.length;
        int neg_count=0 , pos_count=0 , zero_count=0;
        
        for(int i=0; i<size; i++){
            
            if(arr[i] > 0)
                pos_count++;
            
            if(arr[i] < 0)
                neg_count++;    
             
            if(arr[i] == 0)
                zero_count++;   
        }
        
    float pos = (float) pos_count/size;
    float neg = (float) neg_count/size;
    float zero =  (float) zero_count/size;

    System.out.println(String.format("%.6f", pos));
    System.out.println(String.format("%.6f", neg));
    System.out.println(String.format("%.6f", zero));
        
	}
	
//--------------------------------------------------------------------------------------------------	
	
	

}
