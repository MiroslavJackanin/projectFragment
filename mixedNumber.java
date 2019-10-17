package sk.itsovy.jackanin.fragment;

import sk.itsovy.jackanin.fragment.Fragment;

public class mixedNumber {
    private int number;
    private Fragment fragment;

    //GETTERS & SETTERS
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public Fragment getFragment() {
        return fragment;
    }
    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    //CONSTRUCTORS
    public mixedNumber(int number, Fragment fragment) {
        this.number = number;
        this.fragment = fragment;
        this.fragment.changeToBasicShape();
    }

    public mixedNumber(int number, int numerator, int denominator){
        this.number = number;
        this.fragment=new Fragment(numerator, denominator);
        this.fragment.changeToBasicShape();
    }

    //METHODS
    @Override
    public String toString(){
        return number+" "+fragment.toString();
    }

    public Fragment convertToFragment(){
        Fragment newFragment=new Fragment(number*fragment.getDenominator()+fragment.getNumerator(),fragment.getDenominator());
        return newFragment;
    }

    public double getRealValue(){
        return  number+fragment.getRealValue();
    }
}
