main(List<String> args){
  //Functional programming
  hi(name){
    print("Hello $name");
  }
  var welcome=hi;

  hi("Sonu");
  welcome("Monu");

  //Positional Optional Parameters
  void greeting(String name,[age,country]){
    var greet=new StringBuffer("Welcome to dart ");
    if(name!=null){
      greet.write("$name ,you are $age years old from $country");
    }
    else{
      greet.write("$name");
    }
    print(greet.toString());
  }
  /*greeting("Sonu");
  greeting("Sonu",28);
  greeting("Sonu",28,"India");*/

  //Named Optional Parameters
  void greeting1(String name,{age,country}){
    var greet=new StringBuffer("Welcome to dart ");
    if(name!=null){
      greet.write("$name ,you are $age years old from $country");
    }
    else{
      greet.write("$name");
    }
    print(greet.toString());
  }

  /*greeting1("Monu");
  greeting1("Monu",age:26);
  greeting1("Monu",age:26,country:'India');
  greeting1("Monu",country:'India');
  greeting1("Monu",country:'India',age:25);*/

  //Default Value
  /*void greeting2([name="ANONYMOUS"]){
    var greet=new StringBuffer("Welcome to dart ");
    if(name!=null){
      greet.write("$name");
    }
    print(greet.toString());
  }
  greeting2();
  greeting2("Ashutosh");

  void greeting3({name:"ANONYMOUS"}){
    var greet=new StringBuffer("Welcome to dart ");
    if(name!=null){
      greet.write("$name");
    }
    print(greet.toString());
  }
  greeting3();
  greeting3(name:"Prasant");*/

  //Functions can be used as arguments to other functions
  void welcome1(element)=>print("welcome to dart $element");
  var list=[1,2,3,4,5];
  list.forEach(welcome1);

  int welcome3(element)=>element*2;
  var list3=[1,2,3,4,5];
  list3.forEach((i)=>print(welcome3(i)));

  //assign a function to a variable
  var hello3=(element)=>print("Welcome to dart $element");
  hello3(300);

  /*dynamic func4(a){
    return (b)=>a+b;
  }

  var sumThree=func4(10);
  print(sumThree);
  print(sumThree(3));

  print(func4(3));
  print(func4(3)(5));*/
  //print(func4(6)(4));

  addNumber(originalNumber){
    addValue(newNUmber){
      return newNUmber+originalNumber;
    }
    return addValue;
  }
  var addNumber2 = addNumber(45);
  print(addNumber2);
  print(addNumber2(5));

  print(addNumber(45));
  print(addNumber(45)(5));

  Function makeAdder(int n1){
    return (n2)=>n1*n2;
  }
  print(makeAdder(10)(5));

  var x;
  x=foo;
  print(x==foo);

  x=A.baz();
  print(x==A.baz());

  var w=new A();
  var z=new A();
  var y=z;
  x=z.bar;
  print(y.bar==x);
  print(w.bar!=z.bar);
}
void foo(){}

class A{
  void bar(){}
  static void baz(){}
}