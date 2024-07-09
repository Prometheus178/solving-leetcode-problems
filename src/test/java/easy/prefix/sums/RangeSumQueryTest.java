package easy.prefix.sums;

class RangeSumQueryTest {


	public static void main(String[] args) {
		NumArray2 numArray2 = new NumArray2(new int[]{-2, 0, 3, -5, 2, -1});
		System.out.println(numArray2.sumRange(0,2));; // 1
		System.out.println(numArray2.sumRange(2,5));; // -1
		System.out.println(numArray2.sumRange(0,5));; // -3
	}

}