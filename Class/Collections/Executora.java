

package br.unip.brasilia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Collections;

public class Executora {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        //CRUD

        // Adicionando elementos ao al
        al.add("Diego");
        al.add("Jennifer");
        al.add("Ieda");

        System.out.println("Apresentação dos elementos do al:");
        System.out.println(al);

        al.set(0, "Novo Diego");
        System.out.println("Alteração do primerio elemento:");
        System.out.println(al);

        al.remove(0);
        System.out.println("Remover primeiro elemento:");
        System.out.println(al);

        System.out.println("Primeiro elemento: " + al.get(0));

        Collections.sort(al);
        System.out.println("ArrayList ordem crescente [A-Z]: ")
        System.out.println(al);

        Collections.reverse(al);
        System.out.println("ArrayList ordem decrescente [A-Z]: ")
        System.out.println(al);

        System.out.println("Imprimindo utilizando for:");
        for(int i = 0;i < al.size();i++) {
            System.out.println(al.get(i)+"\n- - -");
        }
        
        Collections.sort(al);
        al.forEach((n) -> System.out.println(n));

        if(al.isEmpety()) {
            System.out.println("VAZIA");
        }else {
            System.out.println("Primeiro elemento do ArrayList: " + al.get(0));
        }

        
        if(al.isEmpety()) {
            System.out.println("VAZIA");
        }else {
            System.out.println("Primeiro elemento do ArrayList: " + al.get(al.size()-1));
        }

    }
}