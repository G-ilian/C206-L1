public class Escola {
    /*Modelagem da classe escola com base no UML fornecido*/

    // Atributos explícitos - Apresentado no UML
    String nome; // Nome da escola
    String email; // Email de contato da escola
    int numTelefone; // Número de telefone da escola
    String endereco; // Endereço da escola

    // Atributos Implicitos - Não está apresentado no UML, mas está presente no texto
    Estudante[] estudantes=new Estudante[300]; // Array com 300 estudantes - Agregação


    // Construtor da escola
    public Escola(String endereco,String nome,String email,int numTelefone) {
        this.endereco = endereco;
        this.nome=nome;
        this.email=email;
        this.numTelefone=numTelefone;
    }

    /* Metódos para implementação no menu - Todos os metódos para as opções
    do menu devem estar em escola e não na main
     */

    public void addEstudantes(Estudante e){
        /*Aqui percorremos o array de "estudantes" que foi criado por agregação na parte superior*/
        for(int i=0;i< this.estudantes.length;i++){

            /*Lembre-se que em uma array por objetos todas as posições(Caso não preenchidas com objetos anteriormente)
            * Terão valor null, o que estamos fazendo aqui é verificando se a posição i que queremos está vazia*/
            if(this.estudantes[i]==null){
                this.estudantes[i]=e; // Atribuimos o estudante adicionado através do menu na posição i

                /* O break é ESSENCIAL, ele para a execução na posição onde você quer o estudante,
                sem ele todos as posições do array poderão ter o mesmo estudante
                 */
                break;
            }
        }
    }

    public void mostraInfos(){
        // Aqui são mostradas todas as informações da escola
        System.out.println();
        System.out.println("--- INFORMAÇÕES DA ESCOLAS ---");
        System.out.println("Nome: "+this.nome);
        System.out.println("Email: "+this.email);
        System.out.println("Número de telefone: "+this.numTelefone);
        System.out.println("Endereço: "+this.endereco);

        // Aqui são mostradas todas as informações dos estudantes

        // Percorrendo o array de estudantes, como feito anteriormente
        for (int i=0;i<estudantes.length;i++){
            /*Neste momento a verificação não é se as posições estão vazias, mas sim se temos estudantes naquela posição,
            lembrando que em todas as posições temos null, nas posições onde temos valores diferentes
            de null temos estudantes*/

            if(estudantes[i]!=null){
                System.out.println();
                System.out.println("*********************************");
                System.out.println("Aluno na posiçaõ ["+i+"] do meu array");
                estudantes[i].mostraInfos();
            }
        }

    }

    public void qtdEstudantesPorAno(){
        // Variáveis locasi que serã utilizadas no meu metódo
        int contPrimeiro=0; // Armazena a quantidade de alunos no primeiro ano
        int contSegundo=0;// Armazena a quantidade de alunos no segundo ano
        int contTerceiro=0; // Armazena a quantidade de alunos no terceiro ano

        // Aqui são mostradas todas as informações dos estudantes

        // Percorrendo o array de estudantes, como feito anteriormente
        for (int i=0;i<estudantes.length;i++){
            /*Neste momento a verificação não é se as posições estão vazias, mas sim se temos estudantes naquela posição,
            lembrando que em todas as posições temos null, nas posições onde temos valores diferentes
            de null temos estudantes*/

            if(estudantes[i]!=null){
                if(estudantes[i].ano.toUpperCase().equals("PRIMEIRO"))
                    contPrimeiro++;
                if(estudantes[i].ano.toUpperCase().equals("SEGUNDO"))
                    contSegundo++;
                if(estudantes[i].ano.toUpperCase().equals("TERCEIRO"))
                    contTerceiro++;
            }
        }

        System.out.println();
        System.out.println("++++ QUANTIDADE DE ALUNOS POR ANO +++");
        System.out.println("1º ANO : "+contPrimeiro);
        System.out.println("2º ANO: "+contSegundo);
        System.out.println("3º ANO: "+contTerceiro);

    }

}
