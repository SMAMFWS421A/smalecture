package smalecture;

public class And extends Formula{
    final Formula leftformula;
    final Formula rightformula;


    And(Formula leftformula, Formula rightformula){
        this.leftformula = leftformula;
        this.rightformula = rightformula;
    }
}
