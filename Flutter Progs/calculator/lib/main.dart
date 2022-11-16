import 'dart:developer';

import 'package:flutter/material.dart';
import 'package:math_expressions/math_expressions.dart';

void main() {
  runApp(const CalculatorPage());
}

class CalculatorPage extends StatefulWidget {
  const CalculatorPage({super.key});

  @override
  State<CalculatorPage> createState() => _CalculatorPageState();
}

class _CalculatorPageState extends State<CalculatorPage> {
  var calcCtrl = TextEditingController();

  List<String> row1 = ["1", "2", "3", "-"];
  List<String> row2 = ["4", "5", "6", "*"];
  List<String> row3 = ["7", "8", "9", "/"];
  List<String> row4 = ["0", "C", "=", "+"];

  String calcText = "0.0";

  void calculation(String value) {
    if (value == "=") {
      setState(() {
        calcCtrl.clear();
        calcCtrl.text = calcText;
      });
      return;
    }

    if (value == "-" || value == "*" || value == "/" || value == "+") {
      try {
        int num = int.parse(calcCtrl.text.split("").last);
        calcCtrl.text += value;
      } catch (e) {
        log("Cant calculate");
      }
    } else {
      calcCtrl.text += value;
    }

    if (value == "C") {
      calcCtrl.clear();
    }
    try {
      String userInput = calcCtrl.text;
      String finaluserinput = userInput;
      finaluserinput = userInput.replaceAll('x', '*');

      Parser p = Parser();
      Expression exp = p.parse(finaluserinput);
      ContextModel cm = ContextModel();
      double eval = exp.evaluate(EvaluationType.REAL, cm);
      setState(() {
        calcText = eval.toString();
      });
    } catch (e) {
      log("Pls enter a number");
    }
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: const Text("Calculator"),
          centerTitle: true,
        ),
        body: Padding(
          padding: const EdgeInsets.all(8.0),
          child: Padding(
            padding: const EdgeInsets.only(top: 80),
            child: Column(
              children: [
                TextField(
                  controller: calcCtrl,
                  decoration: InputDecoration(
                    border: const OutlineInputBorder(),
                    suffix: Text(calcText.toString()),
                  ),
                ),
                const SizedBox(
                  height: 10,
                ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                  children: [
                    for (int i = 0; i < row1.length; i++)
                      ElevatedButton(
                        onPressed: () {
                          calculation(row1[i]);
                        },
                        child: Text(
                          row1[i],
                        ),
                      ),
                  ],
                ),
                const SizedBox(
                  height: 10,
                ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                  children: [
                    for (int i = 0; i < row2.length; i++)
                      ElevatedButton(
                        onPressed: () {
                          calculation(row2[i]);
                        },
                        child: Text(
                          row2[i],
                        ),
                      ),
                  ],
                ),
                const SizedBox(
                  height: 10,
                ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                  children: [
                    for (int i = 0; i < row3.length; i++)
                      ElevatedButton(
                        onPressed: () {
                          calculation(row3[i]);
                        },
                        child: Text(
                          row3[i],
                        ),
                      ),
                  ],
                ),
                const SizedBox(
                  height: 10,
                ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                  children: [
                    for (int i = 0; i < row4.length; i++)
                      ElevatedButton(
                        onPressed: () {
                          calculation(row4[i]);
                        },
                        child: Text(
                          row4[i],
                        ),
                      ),
                  ],
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
