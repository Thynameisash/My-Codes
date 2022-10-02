void main() {
  print(toBinary(11));
}

toBinary(int num) {
  int rem = 0;
  List l = [];
  while (num > 0) {
    rem = num % 2;
    l.add(rem);
    num >>= 1;
  }

  return l.reversed.join("");
}
