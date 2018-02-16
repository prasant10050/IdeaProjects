package classes;


import com.module2.packA.classes.classAB;
import com.module2.packB.classes.ClassBC;
import com.module2.packB.classes.ClassBC_2;

public class MainClass {
    public static void main(String[] args) {
        classAB clsAB=new classAB();
        System.out.println(clsAB.func1());

        ClassBC classBC=new ClassBC();
        classBC.setVal(14);
        System.out.println(classBC.getVal());

        ClassBC_2 classBC_2=new ClassBC_2();
        System.out.println(classBC_2.funcBC_2());

    }
}
