

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Main {


    private static void imprimirRecursoEducacional(String caminhoDoArquivo) {
        File arquivo = new File(caminhoDoArquivo);

        try {
            FileReader fileReader = new FileReader(arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Erro ao configurar a codifica��o UTF-8: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        InicializadorDados.inicializadorBaseDados();

        List<Abrigo> abrigos = InicializadorDados.getAbrigos();
        Forum forum = InicializadorDados.getForum();

        while(true){

            System.out.println();
            System.out.println("Escolha um abrigo");
            System.out.println("0 - Sair do programa");
            
            int i = 1;

            for (Abrigo abrigo : abrigos) {
                System.out.println(i + " - " + abrigo.getNomeAbrigo());
                i++;
            }
    
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            Abrigo abrigoEscolhido = null;

            if (input == 0) {
                break;
            }

            switch (input) {

                case 1: 
                case 2:
                case 3:
                    abrigoEscolhido = abrigos.get(input - 1);
                    break;

                default:
                    System.out.println("\nOpc�o Inv�lida.");
                    continue;
            }
            
            System.out.printf("\n");
            System.out.println("O que deseja fazer?");
            System.out.println(" 1 - Gereciamento de Perfis de Animais");
            System.out.println(" 2 - Processamento de Pedidos de Ado��o");
            System.out.println(" 3 - Op��es de Pesquisa e Filtro");
            System.out.println(" 4 - Perfil de Organiza��es de Abrigo e Resgaste");
            System.out.println(" 5 - Recursos Educacionais");
            System.out.println(" 6 - Listagem e Gerenciamento de Eventos");
            System.out.println(" 7 - Gerenciamento de Contas de Usu�rio");
            System.out.println(" 8 - Fazer uma Doa��o");
            System.out.println(" 9 - Hist�rias de Sucesso e Depoimentos");
            System.out.println("10 - F�rum");
            System.out.printf("\n");

            input = scan.nextInt();

            switch (input) {

                case 1:
                    new Funcionalidade1().executar(abrigoEscolhido);
                    break;

                case 2:
                    new Funcionalidade2().executar(abrigoEscolhido);
                    break;

                case 3:
                    new Funcionalidade3().executar(abrigoEscolhido);
                    break;
                
                case 4:
                    new Funcionalidade4().executar(abrigos);
                    break;
                
                case 5:
                    String caminho = new Funcionalidade5().executar();
                    imprimirRecursoEducacional(caminho);
                    break;

                case 6:
                    new Funcionalidade6().executar(abrigoEscolhido);
                    break;

                case 7:
                    new Funcionalidade7().executar(abrigoEscolhido);
                    break;

                case 8:
                    new Funcionalidade8().executar(abrigoEscolhido);
                    break;

                case 9:
                    new Funcionalidade9().executar(abrigoEscolhido);
                    break;

                case 10:
                    new Funcionalidade10().executar(forum);
                    break;

                default:
                    break;
            } 
        }
    }
}