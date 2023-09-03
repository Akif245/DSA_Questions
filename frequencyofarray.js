let arr = [1,2,1,2,3,4,3,4,5]
let count = {};
arr.forEach((val,index)=>{
          if (!count[val]) {
                    count[val] = 1;
          }
          else{
                    count[val] = count[val]+1;
          }
})
console.log(count); 