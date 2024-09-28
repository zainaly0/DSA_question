/***
 * let name = "zaid"
console.log(name)
name[2] = "m"
console.log(name[2])
 */



// good first 
// question means that value will be same but index is different

let arr = [2, 1, 3, 1, 2, 1, 3];

for (a = 0; a < arr.length; a++) {
  for (b = 0; b < arr.length; b++) {
    // if (arr[a] == arr[b] && a < b) {
    if (arr[a] == arr[b] && a != b) {
      console.log(a + " and " + b);
    }
  }
}
