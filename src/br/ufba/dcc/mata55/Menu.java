/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufba.dcc.mata55;

import java.util.Scanner;

/**
 *
 * @author rum
 */
public class Menu {
    
    public static final int OPCAO_INSERIR_NOME                      = 1;
    public static final int OPCAO_CONSULTAR_NOME                    = 2;
    public static final int OPCAO_EXIBIR_TODOS_OS_NOMES             = 3;
    public static final int OPCAO_EXIBIR_TODOS_OS_NOMES_ORDENADOS   = 4;
    public static final int OPCAO_EXCLUIR_NOME                      = 5;
    public static final int OPCAO_SAIR                              = 6;
    
    public static int scannearInteiro() {
        return new Scanner(System.in).nextInt();
    }
    
    public static void imprimeMenu(){
        System.out.println("-----------DIGITE-----------");
        System.out.println("1: Inserir nome na lista");
        System.out.println("2: Consultar um nome");
        System.out.println("3: Exibir todos os nomes");
        System.out.println("4: Exibir nomes ordenados");
        System.out.println("5: Excluir nome");
        System.out.println("6: Encerrar programa");
    }
    
    public static int escolheOpcao(){
        int posicaoescolhida = scannearInteiro();
        return posicaoescolhida;
    }
    
}
