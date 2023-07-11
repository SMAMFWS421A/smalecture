package smalecture;

public class Or extends Formula{
    final Formula leftformula;
    final Formula rightformula;


    Or(Formula leftformula, Formula rightformula){
        this.leftformula = leftformula;
        this.rightformula = rightformula;
    }
}
