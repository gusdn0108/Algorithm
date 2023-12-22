function solution(hp) {
    let answer = 0;
    const antDmg = [5, 3, 1];

    for (let i = 0; i < antDmg.length; i++) {
        answer += Math.floor(hp / antDmg[i]);
        hp %= antDmg[i];
    }
    return answer;
}