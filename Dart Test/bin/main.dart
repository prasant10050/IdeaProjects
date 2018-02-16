

main(List<String> arguments) {
  num n1=2;
  print(n1);
  var n2=34;
  print(n2);
  double n3=14.67;
  print(n3);

  var one=int.parse("1");
  assert(one==1);

  var two=double.parse("12.50");

  String str1=1.toString();
  assert(str1=='1');

  String str2=31567.56790.toStringAsFixed(2);
  assert(str2=='31567.57');

  print((3 << 1) == 6); // 0011 << 1 == 0110
  assert((3 >> 1) == 1); // 0011 >> 1 == 0001
  assert((3 | 4) == 7); // 0011 | 0100 == 0111

  const msPerSecond = 1000;
  const secondsUntilRetry = 5;
  const msUntilRetry = secondsUntilRetry * msPerSecond;
  print(msUntilRetry);

  var s = 'string interpolation';
  print("$s");
  print(s.toUpperCase());
  print("it is uppercase ${s.toUpperCase()} for dart");

  var s1 = '''
You can create
multi-line strings like this one.
''';

  var s2 = """This is also a
multi-line string.""";

  print(s1);
  print(s2);

  var s3="""Hello my world, 
  It is earth 
  """;

  print(s3);

  var s4 = r"In a raw string, even \n isn't special.";
  print(s4);

  const aConstNum = 0;
  const aConstBool = true;
  const aConstString = 'a constant string';


  const aConstList = const [1, 2, 3];
  print(aConstList);

  const validConstString = '$aConstNum $aConstBool $aConstString';
// const invalidConstString = '$aNum $aBool $aString $aConstList'
print(validConstString);

  var gifts = {
    // Key:    Value
    'first': 'partridge',
    'second': 'turtledoves',
    'fifth': 'golden rings'
  };

  var gifts1 = {'first': 'partridge'};
  gifts1['fourth'] = 'calling birds'; // Add a key-value pair
  gifts['fourth']='birds';
  print(gifts);
  print(gifts1);

  var nobleGases = new Map();
  nobleGases[2] = 'helium';
  nobleGases[10] = 'neon';
  nobleGases[18] = 'argon';
  nobleGases[2]='gold';
  print(nobleGases);

  //To create a map that’s a compile-time constant, add const before the map literal:
  final constantMap = const {
    2: 'helium',
    10: 'neon',
    18: 'argon',
  };

  //constantMap[2] = 'Helium'; // Uncommenting this causes an error.
  print(constantMap);

  void printOut(String name,String title){
    print(name+","+title);
  }
  printOut("Sonu", "Kumar");

  //Optional named parameter,named parameters using paramName: value.
  String func1({bold:true,house:121}){
    return house.toString()+","+bold.toString();
  }

  String f1=func1(bold: false);
  print(f1);

  //Optional positional parameter,Wrapping a set of function parameters in [] marks them
  String say(String from, String msg, [String device]) {
    var result = '$from says $msg';
    if (device != null) {
      result = '$result with a $device';
    }
    return result;
  }
  print(say('Bob','Tom'));

  //Default parameter values
  // Sets the [bold] and [hidden] flags ...
  String enableFlags({bool bold = false, bool hidden = false}) {
    String var1=bold.toString()+","+hidden.toString();
    return var1;
  }

  // bold will be true; hidden will be false.
  print(enableFlags(hidden: true));

  void saying(String from,String to,[String sender="",String name="SONU"]){
    print(from+".."+to+".."+name+".."+sender);
  }
  saying("asansol","howrah","ASHUTOSH");

  //Anonymous function
  var list=[1,2,3,4,5];
  //list.forEach((item)=>print('${list.indexOf(item)}:$item'));
  list.forEach((item){
    print("${list.indexOf(item)}:$item");
  });

  //lexical scope
  bool topLevel=true;
  void func2(name,msg,[sender="Monu",country]){
    bool insideFunc=true;
    print("$name->$msg->$sender->$country");
    void func3({sender="Monu",msg}){
      bool insideNestedFunc=true;

      print(topLevel);
      print(insideFunc);
      print(insideNestedFunc);
      print("$name->$msg->$sender->$country");
    }
    //func3();
    return func3(msg:msg);
  }

  func2("Prashant","hello prashant",'',"India");





}
