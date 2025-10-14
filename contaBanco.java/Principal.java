public class Principal {
    public static void main(String[] args) {
        
        Conta conta1 = new Conta();
        conta1.titular = "José Lucas";
        conta1.saldo = 14500;

        conta1.saldoAtual();
        conta1.depositar(410);
        conta1.sacar(270);
        conta1.saldoAtual();

        System.out.println("------------------------");

        Conta conta2 = new Conta();
        conta2.titular = "Yasmin Freitas";
        conta2.saldo = 300;

        conta2.saldoAtual();
        conta2.depositar(100);
        conta2.sacar(600);
        conta2.saldoAtual();
    }
}