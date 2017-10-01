/**
1（10分）
编写一个应用程序，验证以下等式是成立的：
3^3 + 4^3 + 5^3 = 6^3
6^3 + 7^3 + ... + 69^3 = 180^3
提示：if分支语句、for循环语句与C、C++是一样的。
如果能完成上面的验证，则达到基本要求（可得到基本分数8分）。
较高要求，可根据实际情况选做(可得到附加的2分）：找到更多的这样的整数：一些相续正整数的立方和正好等于另一个整数的立方。
提交时，可将java程序或项目压缩后上传附件。如果有什么特殊之处（如算法比较复杂）可以在写一个说明性的文件一起放到压缩文件中。
*/
package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum1 = Math.pow(6, 3);
		double sum2 = 0;
		for(int i = 3; i <= 5; i++ ){
			sum2 += Math.pow(i, 3);
		}
		if(sum1 - sum2 <= 1e-3){
			System.out.println("sum1:" + sum1 + " = " + "sum2:" + sum2);
		}
		
		
		double sum3 = Math.pow(180, 3);
		double sum4 = 0;
		for(int i = 6; i <= 69; i++ ){
			sum4 += Math.pow(i, 3);
		}
		if(sum1 - sum2 <= 1e-3){
			System.out.println("sum3:" + sum3 + " = " + "sum4:" + sum4);
		}
	
	}

}

输出：
​sum1:216.0 = sum2:216.0
sum3:5832000.0 = sum4:5832000.0
