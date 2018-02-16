main(){
  /*print(2 + 3 == 5);
  print(2 - 3 == -1);
  print(2 * 3 == 6);
  print(5 / 2 == 2.5); // Result is a double
  print(5 ~/ 2 == 2); // Result is an int
  print(5 % 2 == 1); // Remainder

  print('5/2 = ${5~/2} r ${5%2}' == '5/2 = 2 r 1');*/

  /*var x;
  x=new Opt();
  var y=new Opt();
  print(y is Opt);
  print((y as Opt).age==29);*/

  //Assignment Operator
  var x1=5,y1=5;
  print(x1==y1);
  var z1=6;
  z1 ??=x1;// Assign value to z1 if z1 is null; otherwise, z1 stays the same
  print(z1==x1);

  var isPublic=false;
  var Visibl=isPublic?'public':'private';
  print(Visibl);

  /*If the boolean expression tests for null, consider using ??.
  String playerName(String name)=> name ?? 'Guest';
  */

  //The previous example could have been written at least two other ways, but not as succinctly:

  /*Slightly longer version uses ?: operator.
  String playerName(String name) => name != null ? name : 'Guest';*/

  //Very long version uses if-else statement.
  String playerName(String name) {
  if (name != null) {
  return name;
  } else {
  return 'Guest';
  }
  }

  print(playerName(null));
  try {
    misbehave();
  }on Exception catch (e,s) {
    print('Exception details:\n $e');
    print('Stack trace:\n $s');
  }
  finally{
    print("Error!!");
  }
}

final foo = '';

void misbehave() {
  try {
    foo = "You can't change a final variable's value.";
  } on Exception catch (e) {
    print('misbehave() partially handled ${e.runtimeType}.');
    rethrow; // Allow callers to see the exception.
  }
}
class Opt{
  var firstName="Sonu";
  var age=29;
}