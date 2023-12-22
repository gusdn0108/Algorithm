function solution(cipher, code) {
   let answer = "";
    let split = cipher.split("");
    
    for (let i = 0; i < split.length; i++) {
        if ((i+ 1) % code === 0) {
            answer += split[i]
        }
    }

    return answer;
}