const maxdif = () => {
  const a = [10, 1, 9, 6, 1];
  var dif = 0;
  for (var i = 0; i < a.length; i++) {
    if (a[i] - a[i + 1] > dif) {
      dif = a[i] - a[i + 1];
    }
  }
  console.log("Max diff is : ", dif);
};

maxdif();
