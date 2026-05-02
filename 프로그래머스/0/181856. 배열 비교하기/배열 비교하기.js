function solution(arr1, arr2) {
    let op = arr1.length - arr2.length;
    if (op == 0){
        let sum1 = arr1.reduce((a,b)=>a+b);
        let sum2 = arr2.reduce((a,b)=>a+b);
        if (sum1 == sum2) return 0;
        else if (sum1 > sum2) return 1;
        else return -1;
    }
    else if (op > 0) return 1;
    else return -1;
}