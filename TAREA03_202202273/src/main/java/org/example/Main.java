package org.example;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        figuras[0] = new Triangulo(2, 4, 3);
        figuras[1] = new Cuadrado(10, 4);
        figuras[2] = new Circulo(5, 0);


        for (Figura figura : figuras) {
            String figuraName = figura instanceof Triangulo ? "Triángulo" :
                    figura instanceof Cuadrado ? "Cuadrado" :
                            figura instanceof Circulo ? "Círculo" : "";
            System.out.println("El " + figuraName + " tiene un área de: " + figura.calcularArea());
        }
    }
}