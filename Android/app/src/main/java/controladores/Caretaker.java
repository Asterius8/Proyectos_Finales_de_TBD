package controladores;
import java.util.Stack;

public class Caretaker {
    private Stack<Memento> mementoStack = new Stack<>();

    public void addMemento(Memento memento) {
        mementoStack.push(memento);
    }

    public Memento getMemento() {
        if (!mementoStack.isEmpty()) {
            return mementoStack.pop();
        }
        return null; // No hay mementos disponibles
    }
}