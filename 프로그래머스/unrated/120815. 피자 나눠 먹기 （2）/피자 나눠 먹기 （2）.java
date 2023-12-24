class Solution {
	public int solution(int n) {
		int answer = 0;

		//휫자 조각 => 6개
		// 휫자 박스 => i개
		// 휫자 먹는사람 => n
		// 공식 6 * i(필요한박스) % n = 0 이 되어야함
		// 증감문 공식 휫자 조각 (6) * n (먹는사람) 이 되어야함
		// 조각 * 필요한 피자박스 % 피자 먹는사람 하면 됨
		for (int i = 1; i <= 6 * n; i++) {
			if (6 * i % n == 0) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}
