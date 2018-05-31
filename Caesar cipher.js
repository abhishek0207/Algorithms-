function rot13(str) { // LBH QVQ VG!
  var index1 = [];
  var index2 = [];
  var str2;
  var val1;
  var arr1 = [];
 //return arr1;
  let count = 0;
  var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  for(let character of str) {
    if(alphabet.indexOf(character) == -1) {
      arr1.push(character);
      continue;
    }
    let val1 = alphabet.indexOf(character);
    //console.log("val 1 is" + val1);
  //return val1;
    if(val1 + 13 >= alphabet.length){
      index1  = val1+13 - alphabet.length;
    } else {
      index1 = val1 + 13;
    }
    //console.log("index 1 is" + index1);
        arr1.push(alphabet.charAt(index1));
  }
  console.log(arr1)
  str2 = arr1.join('');
  return str2;
}

// Change the inputs below to test
console.log(rot13("SERR PBQR PNZC"));
