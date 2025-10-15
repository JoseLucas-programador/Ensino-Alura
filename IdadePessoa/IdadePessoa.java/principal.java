import br.com.alura.idadepessoa.idadePessoa;

public class principal {
    public static void main(String[] args) {
        idadePessoa pessoa1 = new idadePessoa();

        pessoa1.setNome("Miriam");
        pessoa1.setIdade(17);

        idadePessoa pessoa2 = new idadePessoa();

        pessoa2.setNome("Ednilsom");
        pessoa2.setIdade(23);

        System.out.println(pessoa1.getNome() + " Tem " + pessoa1.getIdade() + " Anos ");
        pessoa1.verificarIdade();
        System.out.println(pessoa2.getNome() + " Tem " + pessoa2.getIdade() + " Anos ");
        pessoa2.verificarIdade();
    }
}
