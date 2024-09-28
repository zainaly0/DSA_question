/***
 * let name = "zaid"
console.log(name)
name[2] = "m"
console.log(name[2])


 */
let arr = [1, 2, 3, 1, 1, 3];

for (a = 0; a < arr.length; a++) {
  for (b = 0; b < arr.length; b++) {
    if (arr[a] == arr[b] && a != b) {
      console.log(a + " and " + b);
    }
  }
}
