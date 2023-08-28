const prompt = require("prompt-sync")()

console.log("Enter the Size of Array");
let index = prompt();
let array = [index];
console.log("Enter the Array Elements");
for(let i =0; i<index; i++)
{
array[i] = prompt();

}
var temp;
for(let i =0; i<index; i++){
if (array[i]<array[i+1]) {
          array[i] = array[i+1];
          temp = array[i+1];

          }

}
console.log(" The LargestNumber in the Array is ",   temp);

