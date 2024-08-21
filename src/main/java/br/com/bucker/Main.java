package br.com.bucker;

import br.com.bucker.builder.Pizza;
import br.com.bucker.builder.PizzaRecheios;
import br.com.bucker.builder.PizzaTamanho;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos comer pizza!");

        Pizza calabrebresa = new Pizza.PizzaBuilder()
                .setTamanho(PizzaTamanho.GRANDE)
                .addRecheio(PizzaRecheios.CALABRESA)
                .addRecheio(PizzaRecheios.CEBOLA)
                .addRecheio(PizzaRecheios.TOMATE)
                .build();
        System.out.println("Pizza de calabresa: " + calabrebresa);

        Pizza bacon = new Pizza.PizzaBuilder()
                .setTamanho(PizzaTamanho.MEDIA)
                .setMolho(false)
                .addRecheio(PizzaRecheios.BACON)
                .addRecheio(PizzaRecheios.CEBOLA)
                .addRecheio(PizzaRecheios.TOMATE)
                .build();

        System.out.println("Pizza de bacon: " + bacon);

        new Pizza.PizzaBuilder()
                .setMolho(false)
                .setQueijo(false)
                .addRecheio(PizzaRecheios.FRANGO)
                .addRecheio(PizzaRecheios.CATUPIRY)
                .build();

    }
}