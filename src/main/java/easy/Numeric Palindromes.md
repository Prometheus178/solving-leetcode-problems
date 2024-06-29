# Numeric Palindromes

Last edited time: August 13, 2022 12:16 PM
Tags: Lists

`CONSTRAINTS`

1. 0 < n <= 10,000,000,000

`IDEAS`

| IDEA                                              | T-cmx | M-cmx |
|---------------------------------------------------|-------|-------|
| convert num to array of numbers                   |       |       |
| take 2 pointers at index 0 and N.length - 1       |       |       |
| if values are equals. It is palindrome            |       |       |
| if 2 pointers index on the equal index then break | O(N)  | O(N)  |


`TESTS`

1. 1
2. 42
3. 10001

`CODE`
```java
public void solution(long number){
 	String temp = Long.toString(number);
	int[] nums = new int[temp.length()];
	for(int i= 0; i < temp.length(); i++){
		nums[i] = temp.charAt(i) - '0';
	} 
	int k = nums.length - 1;
	for(int i = 0; i <= k; i++){
			if(nums[i] != nums[k]){
				return false;
			}
			k--;
	}
	return true; 
}
```