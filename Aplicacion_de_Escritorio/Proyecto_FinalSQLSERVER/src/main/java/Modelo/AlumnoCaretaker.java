/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Stack;

/**
 *
 * @author Oscar
 */
public class AlumnoCaretaker {
    
    private final Stack<AlumnoMemento> history = new Stack<>();

    public void saveMemento(AlumnoMemento memento) {
        history.push(memento);
    }

    public AlumnoMemento restoreMemento() {
        return history.isEmpty() ? null : history.pop();
    }
    
}
