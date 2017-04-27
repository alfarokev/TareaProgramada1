/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Objects.LinkedExc;
import Objects.Nodo;

/**
 *
 * @author "Kevin Alfaro - B40166";
 */
public class LinkedQueue {

    Nodo head;
    Nodo last;
    int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() throws LinkedExc {
        return size == 0;
    }

    public String front() throws LinkedExc {
        if (isEmpty()) {
            throw new LinkedExc("The list is empty");
        }
        return head.getData();
    }

    public String last() throws LinkedExc {
        if (isEmpty()) {
            throw new LinkedExc("The list is empty");
        }
        return last.getData();
    }

    public String enqueue(String dato) throws LinkedExc {
        Nodo nw = new Nodo(dato);
        if (isEmpty()) {
            head = nw;
            last = nw;
            size++;
            return dato;
        }
        last.setNext(nw);
        last = nw;
        size++;
        return dato;
    }

    public String dequeue() throws LinkedExc {
        if (isEmpty()) {
            throw new LinkedExc("The list is empty");
        }
        String r = head.getData();
        head = head.getNext();
        size--;
        return r;
    }

    public String showQueue() throws LinkedExc {
        if (isEmpty()) {
            throw new LinkedExc("The list is empty");
        }
        String text = "";
        for (Nodo aux = head; aux != null; aux = aux.getNext()) {
            text = text + aux.getData();
        }
        System.out.println(text);
        return text;
    }

}
