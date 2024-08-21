package br.com.bucker.builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private PizzaTamanho tamanho;
    private Boolean molho;
    private Boolean queijo;
    private Boolean borda;
    private List<PizzaRecheios> recheios;

    public PizzaTamanho getTamanho() {
        return tamanho;
    }

    public Boolean getMolho() {
        return molho;
    }

    public Boolean getQueijo() {
        return queijo;
    }

    public Boolean getBorda() {
        return borda;
    }

    public List<PizzaRecheios> getRecheios() {
        return recheios;
    }

    @Override
    public String toString() {
        return "Pizza %s, %s molho, %s queijo, %s borda e recheios: %s ".formatted(
                tamanho,
                molho ? "com" : "sem",
                queijo ? "com" : "sem",
                borda ? "com" : "sem",
                recheios.stream().map(PizzaRecheios::name).reduce((a, b) -> a + ", " + b).orElse(""));
    }

    private Pizza(PizzaBuilder builder) {

        // Validações de parâmetros obrigatórios
        if (builder.tamanho == null) {
            throw new IllegalArgumentException("Tamanho da pizza é obrigatório");
        }
        this.tamanho = builder.tamanho;

        if (builder.recheios == null || builder.recheios.isEmpty()) {
            throw new IllegalArgumentException("Recheios da pizza são obrigatórios");
        }
        this.recheios = builder.recheios;

        this.molho = builder.molho == null ? Boolean.TRUE : builder.molho;
        this.queijo = builder.queijo == null ? Boolean.TRUE : builder.queijo;
        this.borda = builder.borda == null ? Boolean.FALSE : builder.borda;
    }

    public static class PizzaBuilder {

        private PizzaTamanho tamanho;
        private Boolean molho;
        private Boolean queijo;
        private Boolean borda;
        private List<PizzaRecheios> recheios = new ArrayList<>();

        public PizzaBuilder setTamanho(PizzaTamanho tamanho) {
            this.tamanho = tamanho;
            return this;
        }

        public PizzaBuilder setMolho(Boolean molho) {
            this.molho = molho;
            return this;
        }

        public PizzaBuilder setQueijo(Boolean queijo) {
            this.queijo = queijo;
            return this;
        }

        public PizzaBuilder setBorda(Boolean borda) {
            this.borda = borda;
            return this;
        }

        public PizzaBuilder setRecheios(List<PizzaRecheios> recheios) {
            this.recheios = recheios;
            return this;
        }

        public PizzaBuilder addRecheio(PizzaRecheios recheio) {
            this.recheios.add(recheio);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }
}
