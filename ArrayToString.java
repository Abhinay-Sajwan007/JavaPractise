import java.util.*;

class ArrayToString{
	//private static final String[] twodigits = {"", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};  
	   
	//private static final String[] onedigit = {"", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"}; 
	
		//String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};  
		
		//String[] twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		
		//String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		
		//String[] poweroftens = new String[] {"Hundred", "Thousand","Lakh"};
	public static void main(String s[]){ 
		
		//String ans;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		//String ans="";
		//int pt=0;
		//System.out.println(Arrays.toString(arr));
		//new ArrayToString().toWords(arr,n,ans,pt);
		System.out.println("Min step is "+minStep(arr));
		//patt1(n);
	}
	
	/*public void toWords(int []arr,int len,String sb,int pt){
		
		if(len>4){
			
		}else{
			sb+=onedigit[arr[pt++]]+" hundred";
			sb+=multipleoftens[arr[pt++]];
			sb+=onedigit[arr[pt]];
			
		}
		System.out.println( sb);
	}*/
	
	
	
	
	
	public static int minStep(int des[]){
		//int a[] =00000
		int step =0;
		int cop[] = new int[des.length]; 
		
		//copy des to cop array
		for(int i=0;i< cop.length;i++){
			cop[i]  =  des[i];
		}
		boolean check = true;
		int flag=1;
		//loop
		while(check){
			// check koi odd
			for (int i=0;i< cop.length;i++){
				if(cop[i]%2 != 0){
					step++;
					cop[i]--;
					System.out.println(step + " ----- " +cop[i]);
				}
			}
			 // 1 inc 
		
		
		
				// check
			for(int i=0;i<cop.length;i++){
				if(cop[i] != 0){
					break;
				} 
				else{
					if(i==cop.length-1){
						check = false;
					}
				}
				
			}
		
		// sare even hai toh 
			//1 inc 
			if(check == false){
				break;
			}else{
				for (int i=0;i< cop.length;i++){
					
						cop[i]/=2;
			
						if(i==cop.length-1){
							step++;
							System.out.println(step + " ----- (" + cop[i]+")");
						}
					
				}
			
			}
		
		}
		return step;
		
	}
	
	public static void patt(){
		for(int i=0;i<5;i++){
			for(int j=1;j<=5;j++){
				System.out.print(j+i+" ");
			}
			System.out.println("");
		}
	}
	
	public static void patt1(int n){
		for(int i =0;i<5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+i+" ");
			}
			System.out.println("");
		}
	}	
}