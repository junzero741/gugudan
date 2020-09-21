
public class GugudanArray {

	public static void main(String[] args) {
		
		
		//이중 for문을 활용한 2~9단 출력		
		int [] result = new int [9];					
		for(int j=2; j<8; j++) {
			for(int i=0; i<result.length; i++) {

			result[i] = j * (i+1);
			System.out.println(result[i]);
			}
		}		
		
//		// 3단 만들기
//		int[] result3 = new int[9];				//  배열 result 앞 int[]를 없애면 result 배열을 새로 만든다(덮어쓰기)
//		for(int i=0; i<result.length; i++) {	
//			result[i] = 3 * (i+1);				 
//		}
//		
//		// 3단 전부를 화면에 출력
//		for(int i=0; i<result3.length; i++) {
//		System.out.println(result3[i]);
//				}
//		
//		
//		// 3단 만들기
//		int[] result4 = new int[9];				
//		for(int i=0; i<result.length; i++) {	
//			result[i] = 4 * (i+1);				 
//		}
//		
//		// 3단 전부를 화면에 출력
//		for(int i=0; i<result4.length; i++) {
//		System.out.println(result4[i]);
//				}
//		
		
	}

}
