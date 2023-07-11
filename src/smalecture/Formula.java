package smalecture;

public abstract class Formula {

    public static Formula buildTrue(){
        return new True();
    }

    public static Formula buildFalse(){
        return new False();
    }

    public Formula not(){
        return new Not(this);
    }

    public Formula and(Formula formula){
        return new And(this, formula);
    }

    public Formula or(Formula formula){
        return new Or(this, formula);
    }

    public static Formula testFormula(){
        return Formula.buildTrue().and(Formula.buildFalse()).not();
    }

    public static Formula testFormula2(){
        return new Not(new And(new True(), new False()));
    }

}
