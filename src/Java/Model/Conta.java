package Java.Model;

import Java.Interface.IConta;

public class Conta implements IConta
{
    protected static final int agenciaPadrao = 1;
    protected int agencia;
    protected int numeroConta;
    protected double saldo = 0.0;
    protected double saldoPoupanca = 0.0;


    private static int sequencial = 1;
    public Conta(){
        this.agencia = agenciaPadrao;
        this.numeroConta = sequencial++;
    }

    public void sacar(){};
    public void depositar(){};
    public void transferir(){};

    public int getAgencia()
    {
        return agencia;
    }

    public int getNumeroConta()
    {
        return numeroConta;
    }

    public double getSaldo()
    {
        return saldo;
    }
}
