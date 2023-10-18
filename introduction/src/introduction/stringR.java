package introduction;

public class stringR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String a="Daniyar", nstr="";
//		char ch;
//		for(int i =0; i<a.length();i++) {
//			ch = a.charAt(i);
//			nstr = ch + nstr;
//		}
//		System.out.println(nstr);	
//		
//		int k=1;
//		for(int x=0; x<4;x++) {
//			for(int y =1 ; y<=4-x; y++) {
//				System.out.println(k);
//				System.out.println("\t");
//				k++;
//			}
//			System.out.println("");
//		}
//		
		int arry[]= {5,3,2,4,1};
		int target =5;
		int temp;
		for(int i =0; i<arry.length;i++) {
			for(int j=1; j<arry.length;j++) {
				if( arry[i] != arry[j] ) {
					temp = arry[i] + arry[j] ;
					if(temp == target && i != j)
						System.out.println("Sum of "+target+" is "+ arry[i]+" and "+arry[j]+ ". ");
				}
			}
		}
	

	}
	
	

}
