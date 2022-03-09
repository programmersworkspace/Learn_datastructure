package array;

public class RotateArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int rotateBy = 2;
		RotateArray rotateArr = new RotateArray();
		rotateArr.rotateArray(arr,rotateBy);
		rotateArr.printArray(arr);
	}

	void rotateArray(int[] arr, int rotateBy) {
		for (int j = 0; j < arr.length; j++) {

		}
	}

	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array Element is" + arr[i]);
		}
	}

}
