void main() {
  print(getnumFactors(6));
}

int getnumFactors(int num) {
  List factors = [];
  for (int i = 1; i <= num / 2; i++) {
    if (num % i == 0) {
      factors.add(i);
    }
  }
  factors.add(num);
  return factors.length;
}
