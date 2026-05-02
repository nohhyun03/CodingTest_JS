function solution(arr, n) {
    let start = 1 - arr.length % 2;
    for (let i = start; i < arr.length; i = i + 2){
        arr[i] += n;
    }
    return arr;
}