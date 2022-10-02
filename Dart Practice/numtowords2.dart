var multiple10 = [
  '',
  'one -- complicated!',
  'twenty',
  'thirty',
  'forty',
  'fifty',
  'sixty',
  'seventy',
  'eighty',
  'ninety',
];

var multiple1 = [
  '',
  'one',
  'two',
  'three',
  'four',
  'five',
  'six',
  'seven',
  'eight',
  'nine',
];

var multiple100 = [
  '',
  'one hundred',
  'two hundred',
  'three hundred',
  'four hundred',
  'five hundred',
  'six hundred',
  'seven hundred',
  'eight hundred',
  'nine hundred',
];

var listOfNames = [multiple1, multiple10, multiple100];

String numberToString(int num) {
  var s = num.toString();
  List a = s.split("");
  List b = a.reversed.toList();
  s = b.join("");
  var res = '';

  for (int i = s.length - 1; i >= 0; i--) {
    var c = int.parse(s[i]);
    res = res + listOfNames[i][c] + " ";
  }
  return res;
}

void main() {
  print(numberToString(978));
}
