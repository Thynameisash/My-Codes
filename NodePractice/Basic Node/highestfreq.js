function highestFreq(a) {
  var hmap = new Object();
  for (var i = 0; i < a.length; i++) {
    var ch = a[i];
    if (!(`${ch}` in hmap)) {
      hmap[ch] = 1;
    } else {
      hmap[ch]++;
    }
  }
  max = 0;
  val = "";
  Object.keys(hmap).forEach((key) => {
    if (hmap[key] > max) {
      max = hmap[key];
      val = key;
    }
  });

  return `${val} is having highest frequency which is ${max}`;
}

console.log(highestFreq([1, 5, 4, 2, 3, 9, 4, 2, 7, 4]));
