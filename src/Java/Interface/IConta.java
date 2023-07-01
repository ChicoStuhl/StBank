package Java.Interface;

public interface IConta
{

    int agencia = 00000;
    int numeroConta = 00000;
    double saldo = 0.0;

    void sacar();
    void depositar();
    void transferir();
}
