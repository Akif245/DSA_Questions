const prompt = require("prompt-sync")()
let arr = [2,2,2,2,2]
let temp =0;
for(  let j=0; j<arr.length ;j++){
 temp = temp + arr[j];
}

console.log(temp/arr.length);
