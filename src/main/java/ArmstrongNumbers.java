class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int sum = 0;
		String str_num = Integer.toString(numberToCheck);
		int l = str_num.length();
		for (int i = 0; i < l; i++){
			int base = Character.getNumericValue(str_num.charAt(i));
			sum += Math.pow(base, l);
		}
		return sum == numberToCheck;
	}

}
