const prompt = require("prompt-sync")()
let arr = [2,3,4,5,6,7,8,9];
let temp =0;
for(  let j=0; j<arr.length ;j++){

 temp += arr[j];
 
}


console.log("The sum Of Array", temp);
console.log(" The Average of the Array", temp/arr.length);
