package arrayexamples;

public class TestArrayExample {

	public static void main(String[] args) {
		int arrayTest[] = { 1, 3, 5, 6 };
		int target = 7;

		int index = searchInsert(arrayTest, target);
		System.out.println(index);

	}

	private static int searchInsert(int[] nums, int target) {

		if (nums == null || nums.length == 0) {
			return 0;
		}

		int n = nums.length;
		int start = 0, end = n - 1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				start = mid;
			} else
				end = mid;

		}

		if (nums[start] == target) {
			return start;
		} else if (nums[end] == target) {
			return end;
		} else {
			if (nums[end] > target && nums[start] < target) {
				return end;
			} else if (nums[end] < target) {
				return n;
			} else
				return 0;

		}

	}

}
