package easy.sorting;

import java.util.*;

/**
 * given to 2 array and we need to return uniq intersection numbers
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 */
public class Intersection {


	public int[] execute(int[] nums1, int[] nums2) {
		// nums1 and nums2 put inside of set
		Set<Integer> nums1Set = new HashSet<>();
		for (int v : nums1) {
			nums1Set.add(v);
		}
		Set<Integer> nums2Set = new HashSet<>();
		for (int v : nums2) {
			nums2Set.add(v);
		}

		List<Integer> list = new ArrayList<>();
		// iterate nums1Set and check nums2 contains or not
		if (nums1Set.size() > nums2Set.size()) {
			addIntersection(nums1Set, nums2Set, list);
		} else {
			addIntersection(nums2Set, nums1Set, list);
		}

		// sort array and return ;
		list.sort(Collections.reverseOrder());

		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	private void addIntersection(Set<Integer> nums1Set, Set<Integer> nums2Set, List<Integer> list) {
		for (Integer val : nums1Set) {
			// if contains put into array

			if (nums2Set.contains(val)) {
				list.add(val);
			}
		}
	}
}
