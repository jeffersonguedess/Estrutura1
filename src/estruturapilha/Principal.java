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
        pilha.push(0);
         pilha.isFull(0);
         
        System.out.println(pilha.size());
        System.out.println(pilha.isFull());
       
    }
}
