import 'package:flutter/material.dart';

void main() {
  runApp(const UrlParser());
}

class UrlParser extends StatefulWidget {
  const UrlParser({super.key});

  @override
  State<UrlParser> createState() => _UrlParserState();
}

class _UrlParserState extends State<UrlParser> {
  TextEditingController urlctr = TextEditingController();
  String imageurl = "";
  parse() {
    setState(() {
      imageurl = urlctr.text;
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          centerTitle: true,
          title: const Text("Url Parser"),
        ),
        body: Center(
          child: Padding(
            padding: const EdgeInsets.only(top: 60),
            child: Column(
              children: [
                SizedBox(
                  height: 100,
                  width: 500,
                  child: TextField(
                    controller: urlctr,
                    decoration: const InputDecoration(
                      border: OutlineInputBorder(),
                      hintText: 'Enter URL',
                    ),
                  ),
                ),
                ElevatedButton(
                  onPressed: () {
                    parse();
                  },
                  child: const Text("Go"),
                ),
                Padding(
                  padding: const EdgeInsets.only(top: 30),
                  child: Image.network(imageurl),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
