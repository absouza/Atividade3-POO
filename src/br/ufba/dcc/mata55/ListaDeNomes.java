/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufba.dcc.mata55;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author rum
 */
public class ListaDeNomes {

    private final ArrayList<String> listadenomes;

    public ListaDeNomes() {
        this.listadenomes = new ArrayList<String>();
    }

    private void insereNomeArray(String n) {
        listadenomes.add(n);
    }

    private String scannearNome() {
        Scanner var = new Scanner(System.in);
        return var.next();
    }

    private boolean listaDeNomesNaoContem(String nome) {
        return !listadenomes.contains(nome);
    }

    private void imprimeNaLinha(String texto) {
        System.out.print(texto);
    }

    private void imprimeEQuebraLinha(String texto) {
        System.out.println(texto);
    }
    
    private void imprimeListaDeNomes(ArrayList<String> listaaserimpressa){
        for(String nomes : listaaserimpressa){
            imprimeEQuebraLinha(nomes);
        }
    }

    public void inserirNome() {
        imprimeNaLinha("Digite um nome a ser inserido: ");
        String escaneado = scannearNome();
        if (listaDeNomesNaoContem(escaneado)) {
            insereNomeArray(escaneado);
            imprimeEQuebraLinha("Nome adicionado com sucesso!");
        } else {
            imprimeEQuebraLinha("Não foi possivel adicionar esse nome. O nome já existe!");
        }
    }

    public void consultarNome() {
        imprimeNaLinha("Digite um nome a ser consultado: ");
        if (listadenomes.contains(scannearNome())) {
            imprimeEQuebraLinha("O Nome Pertence a Lista!!!");
        } else {
            imprimeEQuebraLinha("O Nome NAO Pertence a Lista");
        }
    }

    public void exibirTodosOsNomes() {
        if (listadenomes.isEmpty()) {
            imprimeEQuebraLinha("A Lista Esta Vazia");
        }
        else{
            imprimeListaDeNomes(listadenomes);
        }
    }

    public void exibirTodosOsNomesOrdenados() {
        ArrayList<String> copiadalistadenomes = new ArrayList(listadenomes);
    
        Collections.sort(copiadalistadenomes);
        imprimeListaDeNomes(copiadalistadenomes);
    }
   
    public void excluirNome() {
        imprimeNaLinha("Digite o nome que deseja excluir: ");
        String escaneado = scannearNome();
        if(listaDeNomesNaoContem(escaneado)){
            imprimeEQuebraLinha("Nome NAO Encontrado na Lista!");
        }
        else{
            listadenomes.remove(escaneado);
            imprimeEQuebraLinha("Nome Excluido com Sucesso!!!");
        }
    }
    
}
