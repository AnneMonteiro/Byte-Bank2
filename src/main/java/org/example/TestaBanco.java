package org.example;

public class TestaBanco {

    public static void main(String[] args) {
        Cliente anne = new Cliente();
        anne.nome = "Anne Monteiro";
        anne.cpf = "444.555.666.77";
        anne.profissao = "Programadora";

        Conta contaDaAnne = new Conta();
        contaDaAnne.deposita(100);

        /*associa o cliente anne a conta contaDaAnne*/
        contaDaAnne.titular = anne;

        System.out.println(contaDaAnne.titular.nome);

    }
}
