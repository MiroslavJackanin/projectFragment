package sk.itsovy.jackanin.fragment;

import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args) {

        Fragment fragment1=new Fragment(32,48);

        System.out.println(fragment1.toString());
        fragment1.changeToBasicShape();
        System.out.println(fragment1.toString());
        System.out.println(fragment1.getRealValue());
        fragment1.reverse();
        System.out.println(fragment1.toString());
        fragment1.extendFragment(3);
        System.out.println(fragment1.toString());
        fragment1.opposite();
        System.out.println(fragment1.toString());
        fragment1.copy();
        fragment1.isFragmentBasic();

        Fragment fragment2=new Fragment(7,29);
        fragment2.changeToBasicShape();
        System.out.println(fragment2.toString());
        if (fragment2.isFragmentBasic())
            System.out.println("Is basic");

        Fragment fragment3=new Fragment(7,0);

        Fragment fragment4=fragment2.copy();

        Fragment fragment5=new Fragment(fragment2);
        System.out.println(fragment5.toString());

        System.out.println("-------------------------");

        mixedNumber mixNum1=new mixedNumber(1,2,3);
        System.out.println(mixNum1.toString());

        mixedNumber mixNum2=new mixedNumber(5, fragment1);
        System.out.println(mixNum2.toString());

        System.out.println(mixNum1.getRealValue());

        System.out.println("--------------------------");
        Fragment fragment6=new Fragment(9,3);
        Fragment fragment7=new Fragment(3,5);
        myMath math=new myMath();
        System.out.println(math.add(fragment6, fragment7));
        System.out.println(math.sub(fragment6, fragment7));
        System.out.println(math.mul(fragment6, fragment7));
        System.out.println(math.div(fragment6, fragment7));

        System.out.println(myMath.sub(fragment6, fragment7));
    }
}