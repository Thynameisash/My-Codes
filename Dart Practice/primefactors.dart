import 'factors.dart';

void main() {
  int num = 30;
  List primefactors = [];
  List factors = getFactors(num);
  for (int i in factors) {
    if (isPrime(i) == true) {
      primefactors.add(i);
    }
  }
  print(primefactors);
}

bool isPrime(int num) {
  for (int i = 2; i * i <= num; i++) {
    if (num % i == 0) {
      return false;
    }
  }
  return true;
}
