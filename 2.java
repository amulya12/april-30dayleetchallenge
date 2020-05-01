class Solution {
   public boolean isHappy(int n) {
    long num = n;

		long temp = 0;

		Set<Long> set = new HashSet<>();
		while (num > 0) {

			temp = temp + ((num % 10) * (num % 10));
			num = num / 10;
			if (num == 0) {
				if (temp == 1) {
					return true;
				}
				if (set.contains(temp)) {
					return false;
				}
				set.add(temp);
				num = temp;
				temp = 0;
			}

		}

		return false;    
    }
}