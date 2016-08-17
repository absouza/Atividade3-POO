/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufba.dcc.mata55;

/**
 *
 * @author rum
 */
public class Atividade3{

    public static void main(String[] args) {
        int opcaoescolhida;
        ListaDeNomes listadenomes = new ListaDeNomes();
        
        do{
            Menu.imprimeMenu();
            opcaoescolhida = Menu.escolheOpcao();
            
            switch(opcaoescolhida){
                case Menu.OPCAO_CONSULTAR_NOME:
                    listadenomes.consultarNome();
                    break;
                case Menu.OPCAO_EXCLUIR_NOME:
                    listadenomes.excluirNome();
                    break;
                case Menu.OPCAO_EXIBIR_TODOS_OS_NOMES:
                    listadenomes.exibirTodosOsNomes();
                    break;
                case Menu.OPCAO_EXIBIR_TODOS_OS_NOMES_ORDENADOS:
                    listadenomes.exibirTodosOsNomesOrdenados();
                    break;
                case Menu.OPCAO_INSERIR_NOME:
                    listadenomes.inserirNome();
                    break;
                case Menu.OPCAO_SAIR:
                    System.out.println("Você escolheu a opção sair! Tchau!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }while(opcaoescolhida != Menu.OPCAO_SAIR);
    }
    
}
