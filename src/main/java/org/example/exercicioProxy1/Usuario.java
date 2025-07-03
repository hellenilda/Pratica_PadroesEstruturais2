package org.example.exercicioProxy1;

class Usuario {
    private boolean premium;

    public Usuario(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }
}