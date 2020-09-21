public class GugudanMethod {
	
	// 구구단을 실행하는 메소드 생성
	public static int[] calculate(int times) {
		int[] result = new int[9];				
		for(int i=0; i<result.length; i++) {	
		result[i] = times * (i + 1);			
				}
		return result;							
		}
	
	public static void print(int[] result) {
		for(int i=0; i<result.length; i++) {	
			System.out.println(result[i]);			
				}
		}
	
}
					// 여기는 프로그램을 시작할 수 있는 메인 메소드가 없음. 메인 메소드는 GugudanMain (클래스)로 옮겨놨음

