public class Conta {
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito de R$" + valor + " realizado");
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado");

        } else {
            System.out.println("Saldo insuficiente");
        }

        }
    
    void saldoAtual() {
        System.out.println("Seu saldo atual é: R$" + saldo);
    }

    }

