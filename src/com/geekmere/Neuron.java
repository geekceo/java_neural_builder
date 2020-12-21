package com.geekmere;

public class Neuron
{
    public double value;
    public double weight;
    public final String name;

    Neuron(double value, double weight, String name)
    {
        this.value = value;
        this.weight = weight;
        this.name = name;
    }
}
