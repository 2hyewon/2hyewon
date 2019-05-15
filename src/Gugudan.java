public class Gugudan {
	
//	public static int[] calculate(int times) {
//		int[] result = new int[times*(times-2)+times];
//		int n = 0;
//		
//		for(int i = 2; i < times+1; i++) {
//			for(int j = 1; j < times+1; j++) {
//				result[n] = i*j;
//				//System.out.println(i+"*"+j+"="+result[n]);
//				n++;
//			}
//		}
//		
//		return result;
//	}	
//	
//	public static void print(int[] result, int times) {
//		//for(int i = 0; i < result.length; i++) {
//			//System.out.println(times + "*" + (i+1) + "=" + result[i]);
//			//System.out.println(result[i]);
//		//}
//		int n = 0;
//		for(int i = 2; i < times + 1; i++) {
//			for(int j = 1; j < times + 1; j++) {
//				System.out.println(i+"*"+j+"="+result[n]);
//				n++;
//			}
//			System.out.println("----------");
//		}
//	}
	
	public static int[] calculate(int first, int second) {
		int[] result = new int[(first-1)*second];
		int n = 0;
		
		for(int i = 2; i <= first; i++) {
			for(int j = 1; j <= second; j++) {
				result[n] = i*j;
				n++;
			}
		}
		return result;
	}
	
	public static void print(int[] result, int first, int second) {
		int arrayCount = 0;
		for(int i = 2; i <= first; i++) {
			for(int j = 1; j <= second; j++) {
				System.out.println(i+"*"+j+"="+result[arrayCount]);
				arrayCount++;
			}
			System.out.println("-----");
		}
	}

}

// 라인 복사 cmd + alt + 아래/위 화살표
// 디버깅 fn + cmd + f11
// 라인 이동 alt + 아래/위 화살
// 주석 cmd + /