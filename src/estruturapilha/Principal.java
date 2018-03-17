/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturapilha;

/**
 *
 * @author jefferson Guedes
 */
public class Principal {
    public static void main(String[] args) {
        EstruturaPilha pilha = new EstruturaPilha();
        pilha.push(100);
        
        System.out.println(pilha.size());
    }
}
