package ExercicioProposto;

public class Escola {
    // Atributos explicitos da classe escola
    String nome; // Nome da escola
    String email; // Email da escola
    int numTelefone; // Número de telefone da escola
    String endereco; // Endereço da escola

    // Array de Estudantes - Atributos implicitos
    Estudante []estudantes=new Estudante[300]; // Array contendo 300 referências para estudantes

    // Construtor da escola
    public Escola(String nomeEscola,String email,int numTelefone,String endereco){
        this.nome=nomeEscola;
        this.email=email;
        this.numTelefone=numTelefone;
        this.endereco=endereco;
    }

    // Metódos
    // 1 - Cadastrar estudantes no sistema da escola
    public void addEstudante(Estudante e){
        // Percorrendo o array de estudantes
        for(int i=0;i< estudantes.length;i++){
            // Comparando as posições para verificar se não existe nenhum estudante
            if(estudantes[i]==null){
                estudantes[i]=e; // Adicionando um estudante na posição i do meu array de estudantes
                break;
            }
        }
    }

    public void mostraInfos(){
        System.out.println();
        System.out.println("--- Informações da escola ---");
        System.out.println("Nome da escola: "+this.nome);
        System.out.println("Email da escola: "+this.email);
        System.out.println("Número da escola: "+this.numTelefone);
        System.out.println("Endereço da escola: "+this.endereco);

        for(int i=0;i< estudantes.length;i++){
            // Comparando as posições para verificar se existe um estudante
            if(estudantes[i]!=null){
                estudantes[i].mostraInfo(); // Mostrando as informações dos estudantes
            }
        }

    }

    public void qtdEstudantesPorAno(){
        int qtdTerceiro=0; // Conta a quantidade de estudantes do Terceiro ano
        int qtdSegundo=0; // Conta a quantidade de estudantes do segundo ano
        int qtdPrimeiro=0; // Conta a quantidade de estudantes do primeiro ano
        for(int i=0;i< estudantes.length;i++){
            // Comparando as posições para verificar se existe um estudante
            if(estudantes[i]!=null){
                if(estudantes[i].anoLetivo.toUpperCase().equals("PRIMEIRO")){
                    qtdPrimeiro++;// Incrementa contador de primeiro ano
                }
                if(estudantes[i].anoLetivo.toUpperCase().equals("SEGUNDO")){
                    qtdSegundo++;// Incrementa contador de segundo ano
                }
                if(estudantes[i].anoLetivo.toUpperCase().equals("TERCEIRO")){
                    qtdTerceiro++;// Incrementa contador de terceiro ano
                }
            }
        }
        System.out.println("Quantidade de alunos por ano");
        System.out.println("1º ANO: "+qtdPrimeiro);
        System.out.println("2º ANO: "+qtdSegundo);
        System.out.println("3º ANO: "+qtdTerceiro);
    }


}
