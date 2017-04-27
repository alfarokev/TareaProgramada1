package Estructuras;

import Objects.LinkedExc;
import Objects.Nodo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author "Kevin Alfaro - B40166";
 */
public class LinkedStack {

    Nodo top;
    Nodo head;
    int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public String top() throws LinkedExc {
        if (top == null) {
            throw new LinkedExc("The stack is empty");
        }
        return top.getData();
    }

    public String push(String dato) throws LinkedExc {
        Nodo nuevo = new Nodo(dato);
        if (isEmpty()) {
            head = nuevo;
            head.setNext(top);
        }
        nuevo.setNext(top);
        top = nuevo;
        size++;
        return nuevo.getData();
    }

    public String pop() throws LinkedExc {
        if (top == null) {
            throw new LinkedExc("The stack is empty");
        }
        Nodo aux = top;
        top = top.getNext();
        size--;
        return aux.getData();
    }

    public String showStack() throws LinkedExc {
        if (isEmpty()) {
            throw new LinkedExc("The list is empty");
        }
        String text = "";
        for (Nodo aux = head; aux != null; aux = aux.getNext()) {
            text = text + aux.getData();
        }
        return text;
    }
}
