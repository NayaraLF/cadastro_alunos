// app de cadastro de alunos

class Aluno {
    String nome;
    String endereco;
    int anoDeNascimento;
    int turma;


    public Aluno (String nome, String endereco, int anoDeNascimento, int turma){
        this.nome = nome;
        this.endereco = endereco;
        this.anoDeNascimento = anoDeNascimento;
        this.turma = turma;
    }

     public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Ano de nascimento: " + anoDeNascimento);
        System.out.println("Turma: " + turma);
    }
 public void exibir(){
    System.out.println("Cadastro" + nome + endereco + anoDeNascimento + turma);

}

}

public class ExibirAluno{
    public static void main(String[] args) {

        Aluno primeiroAluno = new Aluno("Andre Silva",
                "Avenida Brasil", 2006, 7);

        primeiroAluno.exibirInformacoes();
        primeiroAluno.exibir();

    }
}

