# [level unrated] 최댓값 만들기 (2) - 120862 

Math.max 를 이용하여 최대값을 만든 문제

numbers를 Arrays.sort로 정렬해준다 
number => [1, 2, -3, 4, -5] 이런식으로 있다면 [-5, -3, 1, 2, 4] 이렇게 정렬하게 될것이다
그렇다면 이때 Math.max 를 사용하여 최대값을 구하면 될것이다 
수학공식은 - * - => + 가 될태니 어차피 음수여도 상관없을것이다 
비교 대상은 numbers의 0번째 인덱스 -5와 1번째 인덱스 -3 이 두개와 numbers의 인덱스값 numbers의 길이 -1(마지막값) 과 -2(마지막 이전값) { 인덱스값은 0 부터시작이기때문 } 이다
오름차순으로 정렬하였기때문에 제일 작은수(음수일수도 있고 양수일수도있음) 2개와 제일 큰 수 2개를 곱하여 비교해보는 문제인것 같다 


[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120862) 

### 성능 요약

메모리: 75 MB, 시간: 0.36 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2023년 12월 5일 17:40:18

### 문제 설명

<p>정수 배열 <code>numbers</code>가 매개변수로 주어집니다. <code>numbers</code>의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>-10,000 ≤ <code>numbers</code>의 원소 ≤ 10,000</li>
<li>2 ≤ <code>numbers</code> 의 길이 ≤ 100</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>numbers</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>[1, 2, -3, 4, -5]</td>
<td>15</td>
</tr>
<tr>
<td>[0, -31, 24, 10, 1, 9]</td>
<td>240</td>
</tr>
<tr>
<td>[10, 20, 30, 5, 5, 20, 5]</td>
<td>600</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>두 수의 곱중 최댓값은 -3 * -5 = 15 입니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>두 수의 곱중 최댓값은 10 * 24 = 240 입니다.</li>
</ul>

<p>입출력 예 #3</p>

<ul>
<li>두 수의 곱중 최댓값은 20 * 30 = 600 입니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
