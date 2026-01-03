/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alban
 */
public class Case {
    private final int ligne;
    private final int colonne;
    
    public Case(int ligne, int colonne) {
        this.ligne = ligne;
        this.colonne = colonne;
    }   
    
    public int getLigne() {
        return ligne;
    }

    public int getColonne() {
        return colonne;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Case aCase = (Case) o;
        return ligne == aCase.ligne && colonne == aCase.colonne;
    }
}
