package com.kata;


public class TwoSum {

//	public static int[] twoSum(int[] numbers, int target)
//    {
//        // Store each number of the array in a List.
//        List<Integer> numbersList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
//
//        // Parse the list in order to check every number and look if there is the other number (difference between the first number and the target).
//        for(final Integer number : numbersList) {
//            if (numbersList.contains(target - number)) {
//                return new int[]{numbersList.indexOf(number), numbersList.indexOf(target - number)};
//            }
//        }
//        return null;
//    }
	
	public static int[] twoSum(int[] numbers, int target)
    {
		int index1 = 0,index2=0;
		for(int i = 0 ; i <numbers.length - 1 ; i++) {
			for(int j=i+1 ; j<numbers.length;j++) {
				int temp = numbers[i]+numbers[j];
				if(temp == target)
				{
					index1 = i;
					index2 = j;
					break;
				}
					
				
			}
		}
		int[] result = {index1,index2};
        return result; // Do your magic!
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] result = twoSum(new int[]{1,8,3,54,87,63,41},90);
		for(int i : result)
			System.out.println(i);
		
	}

}
