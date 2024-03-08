package org.example;
import java.lang.Math;
public abstract class Figura {
    protected int numLados;

    public Figura(int numLados) {

        this.numLados = numLados;
    }

    public abstract double calcularArea();
}

class Triangulo extends Figura {
    private double base;
    private double altura;
public Triangulo(double base, double altura, int numLados) {
    super(numLados);
    this.base = base;
    this.altura = altura;
}

@Override
public double calcularArea() {
    return 0.5 * base * altura;
}
}

class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado, int numLados) {
        super(numLados);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {

        return lado * lado;
    }
}
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, int numLados) {
        super(numLados);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
    return Math.PI * Math.pow(radio, 2);
    }
}