import java.util.*;
class StringPattern{

	static void triangle(String s){
		for(int i = 0;i<s.length();i++){
			for(int j=0;j<=i;j++){
				System.out.print(s.charAt(j));
			}
			System.out.println("");
		}

		for(int i = s.length()-1;i >=0;i--){
			for(int j=0;j<=i;j++){
				System.out.print(s.charAt(j));
			}
			System.out.println("");
		}
	}

	static void pyramid(){
		int space,k=0;
		int r=5;
		
		for(int i=1;i<=r;i++){
			k=0;
			for(space = 1 ;space<=r-i;space++)

				System.out.print("   ");
			while(k != 2*i-1){
				System.out.print("* ");
				k++;
			}
			System.out.println("");
		}
	}

	static void hollowSquare(){
		int r=9;

		for(int i=0;i<r;i++){
			for(int j=0;j<r;j++){
				if(i==0 || i==r-1||j==0||j==r-1|| i==j||i+j==r-1){
					System.out.print("*");
				}
				else
				System.out.print(" ");

			}
			System.out.println("");
		}

	}

	static void rombusPattern(){
		int r=11;
		for(int i=0;i<r;i++){
			for(int s=0;s<r-1-i;s++){
				System.out.print(" ");
			}
			for(int j=0;j<r;j++){
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	static void rombusPattern1(){
		int r=11;
		for(int i=0;i<r;i++){
			for(int s=0;s<r-1-i;s++){
				System.out.print(" ");
			}
			for(int j=0;j<r;j++){
				if(i==0 || i==r-1||j==0||j==r-1|| i==j||i+j==r-1){
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

	static void rombusPattern2(){
		int r=11;
		for(int i=0;i<r;i++){
			for(int s=0;s<i;s++){
				System.out.print(" ");
			}

			for(int j=0;j<r;j++){
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	static void hollowTriangle(){
		int r=8;
		for(int i=0;i<r;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	static void hollowTriangle1(){
		int r=8;
		for(int i=0;i<r;i++){
			for(int j=0;j<=i;j++){
				if(i==0||i==r-1||j==0||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

	static void hollowRightTriangle(){
		int r=8;
		for(int i=0;i<r;i++){
			for(int s=0;s<r-1-i;s++){
				System.out.print(" ");
			}

			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	static void hollowRightTriangle1(){
		int r=8;
		for(int i=0;i<r;i++){
			for(int s=0;s<r-1-i;s++){
				System.out.print(" ");
			}

			for(int j=0;j<=i;j++){
				if(i==0||i==r-1||j==0||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

	static void cross(){
		int r=9;

		for(int i=0;i<r;i++){
			for(int j=0;j<r;j++){
				if( i==j||i+j==r-1){
					System.out.print("*");
				}
				else
				System.out.print(" ");

			}
			System.out.println("");
		}
	}

	static void diamond(){
		int stars =5;
		int r = 3;
		int s;
		for(int i=0;i<r;i++){
			for(s=0;s<r-1-i;s++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}

		for(int i=r-2;i>=0;i--){
			for(s=0;s<=r-2-i;s++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	// important
	static void diamond1(){
		int n=5;
		int spaces=n-1;
		int stars=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
			  System.out.print(" ");
			}
			for(int k=1;k<=stars;k++)
			{
			  System.out.print("*");
			}
			if(spaces>i)
			{
			  spaces=spaces-1;
			  stars=stars+2;
			}
			if(spaces<i)
			{
			  spaces=spaces+1;
			  stars=stars-2;
			}
			System.out.println("");
		}
	}

	static void stringDiamond2(){
		String str ="abhinay";

		int r = str.length();
		int s;
		for(int i=0;i<r;i++){
			for(s=0;s<r-1-i;s++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print(str.charAt(j));
			}
			for(int j=0;j<i;j++){
				int k = (i+j+1)%str.length();
				System.out.print(str.charAt(k));
			}
			System.out.println("");
		}

		for(int i=r-2;i>=0;i--){
			for(s=0;s<=r-2-i;s++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print(str.charAt(j));
			}
			for(int j=0;j<i;j++){
				int k = (i+j+1)%str.length();
				System.out.print(str.charAt(k));
			}
			System.out.println("");
		}
	}

	//important
	static void stringDiamond(){
		String str = "abhinay";
		int n=str.length();

		int spaces=n-1;
		int stars=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<spaces;j++)
			{
			  System.out.print(" ");
			}
			for(int k=0;k<stars;k++)
			{
			  System.out.print(str.charAt(k));
			}
			if(spaces>i)
			{
			  spaces=spaces-1;
			  stars=stars+2;
			}
			if(spaces<i)
			{
			  spaces=spaces+1;
			  stars=stars-2;
			}
			System.out.println("");
		}
	}

	//important
	static void stringPyramid(){
		String str ="abhinay";
		int r = str.length()/2+1;

		for(int i=1;i<=r;i++){
			for(int k=0;k<r-i;k++ ){
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++){
				System.out.print(str.charAt((j)));
			}
			System.out.println("");
		}
	}

	static void myStringDiamond3(){
		String str = "appsquadz";
		int r = (str.length());
		int sp = (r/2);
		int st = 1;
		for(int i=0;i<r;i++){
			// space
			for(int k=0;k<sp;k++){
				System.out.print(" ");
			}
			// pattern
			for(int j=0;j<st;j++){
				System.out.print(str.charAt(j));
			}

			if(i<r/2){
				st = st+2;
				sp-=1;
			}else{
				st = st-2;
				sp+=1;
			}

			System.out.println("");
		}
	}


	//pascal triangle - Important
	static void pascalTriangle(){
		int r=5;
		int sp=r-1;
		int coef=1;	
			for(int i=0;i<r;i++){
				for(int k=0;k<sp-i;k++){
					System.out.print(" ");
				}
				int l=1;
				for(int j=0;j<=i;j++){
					if(i==0||j==0){
						coef=1;
					}else{
						coef=coef * (i - j + 1)/j;
						
					}
					System.out.print(coef+" ");
				}
				System.out.println("");
			}
		
		
	}
	
	// flyod's triangle
	static void flyodTriangle(){
		int r=4;
		int k=1;
		for(int i=0;i<r;i++){
			for(int j=0;j<=i;j++){
				System.out.print(k++ +" ");
			}
			System.out.println("");
		}
		
	}

	static void invertedPyramid(){
		int r=4;
		int i=r;
		int sp=r-1;
		
		while(i>=1){
			for(int k=1;k<=r-i;k++){
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println("");
			i--;
		}
	}

	static void rocket(){
		//int st = r;
		System.out.print("No of stars " );
		Scanner sc = new Scanner(System.in);
		int stars = sc.nextInt();
		while(true){
			if((stars &1)==1){
				break;
			}
			System.out.println("Enter Odd Value Only : ");
			stars = sc.nextInt();
		}
		int r=3;
		int c=1;
		while(r<=stars){
			if(r==stars){
				r = r-c;
				break;
			}
			if(r%2!=0){
				c++;
			}
			r++;
		}
		System.out.println("r "+r);
		System.out.println("c "+c);
		
		
		int k;
		int n=3;
		int sp;
		int i=1;
			
		while(i <= n ){
			
			if(i == 1 ){
				
				for(int j=1;j<=r;j++){
					k=1;
					for(sp=1;sp<=r-j;sp++){
						System.out.print("  ");
					}	
				
					while(k != 2*j){
						System.out.print("* ");
						k++;
					}
					System.out.println();
				
				}
			}
			
			else if(i == 2){
				
				for(int m=1;m<=stars-c;m++){
					for(int l=1;l<=stars;l++){
						if(l==1||l==stars){
							System.out.print("@ ");
						}else{
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				
			}
			
			else if(i == 3){
				for(int j=1;j<=r;j++){
					k=1;
					for(sp=1;sp<=r-j;sp++){
						if(sp==1){
							System.out.print("@ ");
						}
						else
						System.out.print("  ");
					}	
					
					
					while(k != 2*j){
						System.out.print("* ");
						k++;
					}
					
					for(sp=c-j+1;sp>=1;sp--){
						if(sp==1){
							System.out.print("@");
						}
						else
						System.out.print("  ");
					
						
					}
					System.out.println();
				
				}
			}
			
			i++;
		}	
		
			
	}

	
	static void lPattern(){
		int n=3;
		System.out.println("Enter n : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		// r*3;
		//
		int row =n*3;
		int col = 3+(n*(n-1));
		System.out.println("ROW : "+row);
		System.out.println("COL : "+col);
		int i =1;
		int n1=n+1;
		
		while(i<=3){
			
			if(i==1){
				for(int j=1;j<=n;j++){
					for(int k=1;k<=j;k++){
						if(k==1){
							System.out.print("@");
						}
					}
					System.out.println();
				}
			}
			
			else if(i==2){
				for(int j=1;j<=n;j++){
					
					for(int sp=1;sp<=(n-1)*(j-1)+1;sp++){
							if(j==1){
								break;
							}
							System.out.print(" ");
					}
					
					
					if(j==1||j==n){
						for(int k=1;k<=n1;k++){
							if(j==1 && k==1){
								System.out.print("@");
							}
							else if(j==n && k==n1){
								System.out.print("@");
							}
							else
							System.out.print("*");
						}
						System.out.println();
					}
					
					
					else {
						for(int k=1;k<=n;k++){
							System.out.print("*");
						}
					
						System.out.println();
					}
				}
			}
			
			else if(i==3){
				for(int j=1;j<=n;j++){
					for(int k=1;k<=col;k++){
						if(k==col){
							System.out.print("@");
						}else{
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}
			
			i++;
		}
		
		
	}

	
	static void rocketFly(){
		System.out.print("No of stars " );
		Scanner sc = new Scanner(System.in);
		int stars = sc.nextInt();
		while(true){
			if((stars &1)==1){
				break;
			}
			System.out.println("Enter Odd Value Only : ");
			stars = sc.nextInt();
		}
		int r=3;
		int c=1;
		while(r<=stars){
			if(r==stars){
				r = r-c;
				break;
			}
			if(r%2!=0){
				c++;
			}
			r++;
		}
		System.out.println("r "+r);
		System.out.println("c "+c);
		
		int k;
		int n=3;
		int sp;
		int i=1;
		
		while(i <= n ){
			
			if(i == 1 ){
				
				for(int j=1;j<=r;j++){
					k=1;
					for(sp=1;sp<=r-j+stars;sp++){
						System.out.print("  ");
					}	
				
					while(k != 2*j){
						System.out.print(" *");
						k++;
					}
					System.out.println();
				}
			}
			
			else if(i == 2){
				
				for(int m=1;m<=stars-c;m++){
					for(int l=1;l<=2*stars;l++){
						if(l==stars+1||l==2*stars){
							System.out.print(" @");
						}else{
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				
			}
			
			else if(i == 3){
				for(int m=r;m>=1;m--){
					
					for(k=1;k<=r-m;k++){
						System.out.print("  ");
					}
					
					for(int j=1;j<=2*m-1;j++){
						if(m==r && j==2*m-1){
							System.out.print(" * @");
						}else
						System.out.print(" *");
					}
					
					for(k=1;k<=r-m;k++){
						System.out.print("  ");
					}
					
					
					for(k=1;k<=stars;k++){
						if(m==r ){ 
							if(k==1||k==stars){
								
							}else{
								System.out.print(" *");
							}
						}
						else 
							System.out.print("  ");
						//ssp++;
					}
					for(k=1;k<=r-m;k++){
						
						System.out.print("  ");
					}
					for(int j=1;j<=2*m-1;j++){
						if(m==r && j==1){
							System.out.print(" @ *");
						}else
						System.out.print(" *");
					}
					
					System.out.println("");
					
				}

			}
			
			i++;
			
		}
		
		static void lpattern2(){
		int n=3;
		System.out.println("Enter n : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int row = 2*n;
		int col = 3+(n*(n-1));
		
		System.out.println("ROW : "+row);
		System.out.println("COL : "+col);
		
		int i=1;
		int len;
		while(i<=2){
			if(i==1){
				for(int j=1;j<=n;j++){
					if(j==n){
						len=n+2;
					}else{
						len=n+1;
					}
					for(int k=1;k<=len+1;k++){
						if(k==1 || (j==n&&k==n+3)){
							System.out.print("@");
						}
						else if(k==2){
							for(int l=1;l<=((n-1)*(j-1));l++){
								//System.out.print(len);
								System.out.print(" ");
							}
						}
						else{
							System.out.print("*");
						}
					}
					System.out.println();				
				}
			}
			
			else{
				for(int j=1;j<=n;j++){
					for(int k=1;k<=col;k++){
						if(k==1||k==col){
							System.out.print("@");
						}else{
							System.out.print(" ");
						}
					}System.out.println("");
				}
			}
			i++;
		  }
	      }

		
	}


	public static void main(String args[]){
		//triangle("abhinay");
		//pyramid();
		//hollowSquare();
		//rombusPattern2();
		//hollowTriangle1();
		//hollowRightTriangle1();
		//cross();
		//diamond();
		//diamond1();
		//stringTriangle();
		//stringPyramid();
		
		//myStringDiamond3();
		//flyodTriangle();
		//pascalTriangle();
		//rocket();
		//invertedPyramid();
		//lPattern();
		rocketFly();
		lpattern2();
		
		
	}
}
