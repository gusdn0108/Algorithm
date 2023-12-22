function solution(n) {
     const tempList = [];
        for (let i = 1; i <= n; i++) {
            if (i % 2 === 1) {
                tempList.push(i);
            }
        }

        const answer = new Array(tempList.length);
        for (let i = 0; i < tempList.length; i++) {
            answer[i] = tempList[i];
        }

        return answer;
}