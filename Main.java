package sk.itsovy.jackanin.fragment;

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
    }
}