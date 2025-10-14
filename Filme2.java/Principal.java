import br.com.alura.meuprojeto.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.setNome(" Interestelar ");
        meuFilme.setAnoDeLancamento(2014);
        meuFilme.setDuracaoEmMinutos(169);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8.8);
        meuFilme.avalia(9.9);
        meuFilme.avalia(8.5);
        meuFilme.avalia(7.9);
        meuFilme.avalia(9.5);
        System.out.println("A média de avaliações do filme: " + meuFilme.pegaMedia());
        System.out.println(meuFilme.pegaMedia());
    }
}
