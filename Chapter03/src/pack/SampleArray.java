package pack;

//コメント追加
public class SampleArray {
	public static void main(String[] args) {
		int[] data1 = new int[2];
		double[] data2 = new double[3];

		data1[0] = 12;
		data1[1] = 34;

		data2[0] = 1.2;
		data2[1] = 3.4;
		data2[2] = 5.6;

		for(int i = 0; i < data1.length; i++){
			System.out.println(data1[i]);
		}

		for(double d : data2){
			System.out.println(d);
		}
	}
}
