void main() {
  print(convert(3251));
}

String convert(int num) {
  var map = {
    "0": "Zero",
    "1": "One",
    "2": "Two",
    "3": "Three",
    "4": "Four",
    "5": "Five",
    "6": "Six",
    "7": "Seven",
    "8": "Eight",
    "9": "Nine",
  };
  String s = num.toString();
  List words = [];
  for (int i = 0; i < s.length; i++) {
    words.add(map[s[i]]);
  }
  return words.join("");
}
