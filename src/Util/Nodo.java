/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

public class Nodo<T> {

    private T info;
    private Nodo<T> sig;

    Nodo() {
    }

    Nodo(T info, Nodo<T> sig) {
        this.info = info;
        this.sig = sig;
    }

    T getInfo() {
        return info;
    }

    Nodo<T> getSig() {
        return sig;
    }

    void setInfo(T info) {
        this.info = info;
    }

    void setSig(Nodo<T> sig) {
        this.sig = sig;
    }

}
