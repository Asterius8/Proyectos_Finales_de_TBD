package controladores;

import entidades.Bitacoras;

public class Originator {

    private Bitacoras bitacora;

    public void setBitacora(Bitacoras bitacora) {
        this.bitacora = bitacora;
    }

    public Memento createMemento() {
        return new Memento(bitacora);
    }

    public void restoreFromMemento(Memento memento) {
        this.bitacora = memento.getBitacora();
    }

    public Bitacoras getBitacora() {
        return bitacora;
    }

}
