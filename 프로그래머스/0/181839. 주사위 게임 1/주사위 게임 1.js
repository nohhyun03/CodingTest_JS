function solution(a, b) {
    var answer = 0;
    if (a%2 == 0 && b%2 == 0) { //모두 짝수
        answer = Math.abs(a-b);
    }
    else if (a%2 != 0 && b%2 != 0){ //모두 홀수
        answer = a*a + b*b;
    }
    else { //하나만 홀수
        answer = 2*(a+b);
    }
    return answer;
}