package controladores;

import entidades.Bitacoras;

public class Memento {
    private Bitacoras bitacora;

    public Memento(Bitacoras bitacora) {
        this.bitacora = bitacora;
    }

    public Bitacoras getBitacora() {
        return bitacora;
    }

}
