
public class GugudanArray {

	public static void main(String[] args) {
		
		
		//���� for���� Ȱ���� 2~9�� ���		
		int [] result = new int [9];					
		for(int j=2; j<8; j++) {
			for(int i=0; i<result.length; i++) {

			result[i] = j * (i+1);
			System.out.println(result[i]);
			}
		}		
		
//		// 3�� �����
//		int[] result3 = new int[9];				//  �迭 result �� int[]�� ���ָ� result �迭�� ���� �����(�����)
//		for(int i=0; i<result.length; i++) {	
//			result[i] = 3 * (i+1);				 
//		}
//		
//		// 3�� ���θ� ȭ�鿡 ���
//		for(int i=0; i<result3.length; i++) {
//		System.out.println(result3[i]);
//				}
//		
//		
//		// 3�� �����
//		int[] result4 = new int[9];				
//		for(int i=0; i<result.length; i++) {	
//			result[i] = 4 * (i+1);				 
//		}
//		
//		// 3�� ���θ� ȭ�鿡 ���
//		for(int i=0; i<result4.length; i++) {
//		System.out.println(result4[i]);
//				}
//		
		
	}

}
