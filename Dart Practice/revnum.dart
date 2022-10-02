void main() {
  print(reverse(1234));
}

int reverse(int num) {
  int sum = 0, rem = 0;
  while (num > 0) {
    rem = num % 10;
    sum = (sum * 10) + rem;
    num = num ~/ 10;
  }
  return sum;
}
