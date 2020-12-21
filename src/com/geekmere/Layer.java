package com.geekmere;

import java.util.ArrayList;

public class Layer
{
    private final int ActivFunc;
    private final ArrayList<Neuron> neurons = new ArrayList<Neuron>();

    Layer(int ActivFunc)
    {
        this.ActivFunc = ActivFunc;
    }

    public Neuron getByName(String name)
    {
        for(var n: neurons)
        {
            if (n.name.equals(name))
            {
                return n;
            }
        }
        throw new IllegalArgumentException("Neuron with this name are not found");
    }

    public void AddNeuron(Neuron neuron)
    {
        neurons.add(neuron);
    }
}
