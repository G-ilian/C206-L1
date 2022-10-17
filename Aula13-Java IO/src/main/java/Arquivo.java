import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Métodos que podemos realizar com o arquivo
    public void escrever(Funcionario func){
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os=null;
        OutputStreamWriter osw=null;
        BufferedWriter bw=null;

        // Variável auxiliar
        String linha;

        try{
            // Abrindo a saída de dados
            os=new FileOutputStream("Funcionarios.txt",true); // Nome do arquivo onde será salvo
            osw=new OutputStreamWriter(os);
            bw= new BufferedWriter(osw);

            // Flag que indica onde começa as informações do Funcionário
            bw.write("++ Funcionarios ++\n");
            bw.write(func.getNomeFunc()+"\n");
            bw.write(func.getCpfFunc()+"\n");
            bw.write(func.getIdadeFunc()+"\n");



            // 1. Escrita de forma estática, ou seja, direta
            /*
            // Escrevendo no arquivo
            linha="Olá mundo 3";

            bw.write("Olá mundo\n");
            bw.write("Olá mundo 2");
            bw.newLine();
            bw.write(linha);
             */
        }catch(Exception e){
            System.out.println("ERRO: "+e);
        }finally{
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 2. Método ler

    public ArrayList<Funcionario> ler(){

        // ArrayList auxiliar para salvar funcionários encontrados no arquivo
        ArrayList <Funcionario> encontreiNoArquivo=new ArrayList<>();

        // Classes que permitem leitura de dados do arquivo
        InputStream is=null;
        InputStreamReader isr=null;
        BufferedReader br=null;

        // Variável auxiliar que servirá de flag para o while
        String linhaLer;

        try{
            // Instanciando os objetos
            is=new FileInputStream("Funcionarios.txt");
            isr=new InputStreamReader(is);
            br=new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer=br.readLine();

            while(linhaLer!=null){
                // Comparando se o que está em linhaLer é igual a minha flag
                if(linhaLer.contains("++ Funcionarios ++")){
                    // Variável auxiliar de funcionario
                    Funcionario f1=new Funcionario();
                    f1.setNomeFunc(br.readLine());
                    f1.setCpfFunc(br.readLine());
                    f1.setIdadeFunc(Integer.parseInt(br.readLine()));

                    // Adicionando o funcionario no array
                    encontreiNoArquivo.add(f1);
                }
                linhaLer=br.readLine();
            }


        }catch(Exception e){
            System.out.println("ERRO: "+e);
        }finally{
            try{
                br.close();
            }catch(Exception e){
                System.out.println("ERRO: "+e);
            }
        }




        return encontreiNoArquivo;
    }
}
