function solution(rsp) {
            let answer = "";
        const arrayRsp = rsp.split("");

        for (let i = 0; i < arrayRsp.length; i++) {
            if (arrayRsp[i] === "2") {
                answer += "0";
            } else if (arrayRsp[i] === "0") {
                answer += "5";
            } else if (arrayRsp[i] === "5") {
                answer += "2";
            }
        }

        return answer;

}