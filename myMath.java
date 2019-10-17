package sk.itsovy.jackanin.fragment;

public class myMath {
    public Fragment add(Fragment a, Fragment b){
        Fragment result = null;

        result = new Fragment(a.getDenominator()*b.getNumerator() + a.getNumerator()*b.getDenominator(),a.getDenominator()*b.getDenominator());
        result.changeToBasicShape();
        return result;
    }

    public static Fragment sub(Fragment a, Fragment b){
        Fragment result  = null;

        result = new Fragment(a.getDenominator()*b.getNumerator() - a.getNumerator()*b.getDenominator(), a.getDenominator()*b.getDenominator());
        result.changeToBasicShape();
        return result;
    }

    public Fragment mul(Fragment a, Fragment b){
        Fragment result = null;

        result = new Fragment(a.getNumerator()*b.getNumerator(),a.getDenominator()*b.getDenominator());
        result.changeToBasicShape();
        return result;
    }

    public Fragment div(Fragment a, Fragment b){
        Fragment result = null;

        result = new Fragment(a.getNumerator()*b.getDenominator(), a.getDenominator()*b.getNumerator());
        result.changeToBasicShape();
        return result;
    }

    //polymorphism
    public Fragment mul(int value, Fragment fragment){
        Fragment result = null;

        result = new Fragment(fragment.getNumerator()*value, fragment.getDenominator());
        result.changeToBasicShape();
        return result;
    }

    public Fragment add(int value, Fragment fragment){
        Fragment result = null;
        Fragment temp=new Fragment(value, 1);

        return add(temp, fragment);
    }

    public Fragment add(mixedNumber a, mixedNumber b){
        Fragment result = null;
        Fragment temp1=new Fragment(a.convertToFragment().getNumerator(), a.convertToFragment().getDenominator());
        Fragment temp2=new Fragment(b.convertToFragment().getNumerator(), b.convertToFragment().getDenominator());

        result = add(temp1, temp2);
        result.changeToBasicShape();
        result.getMixedNumber();
        return result;
    }

    public Fragment sub(mixedNumber a, mixedNumber b){
        Fragment result = null;
        Fragment temp1=new Fragment(a.convertToFragment().getNumerator(), a.convertToFragment().getDenominator());
        Fragment temp2=new Fragment(b.convertToFragment().getNumerator(), b.convertToFragment().getDenominator());

        result = sub(temp1, temp2);
        result.changeToBasicShape();
        result.getMixedNumber();
        return result;
    }

    public Fragment mul(mixedNumber a, mixedNumber b){
        Fragment result = null;
        Fragment temp1=new Fragment(a.convertToFragment().getNumerator(), a.convertToFragment().getDenominator());
        Fragment temp2=new Fragment(b.convertToFragment().getNumerator(), b.convertToFragment().getDenominator());

        result = mul(temp1, temp2);
        result.changeToBasicShape();
        result.getMixedNumber();
        return result;
    }

    public Fragment div(mixedNumber  a, mixedNumber b){
        Fragment result = null;
        Fragment temp1=new Fragment(a.convertToFragment().getNumerator(), a.convertToFragment().getDenominator());
        Fragment temp2=new Fragment(b.convertToFragment().getNumerator(), b.convertToFragment().getDenominator());

        result = div(temp1, temp2);
        result.changeToBasicShape();
        result.getMixedNumber();
        return result;
    }
}
