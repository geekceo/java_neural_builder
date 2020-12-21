package com.geekmere;

public class Main {

    public static void main(String[] args) {
        Layer layer = new Layer(ActivationFunction.Sigmoid);
        layer.AddNeuron(new Neuron(0.2, 0.56, "Pistol"));
    }
}
