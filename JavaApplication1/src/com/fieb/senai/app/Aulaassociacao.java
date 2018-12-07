/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieb.senai.app;

import com.fieb.senai.entidades.Aluno;
import com.fieb.senai.entidades.Endereco;
import com.fieb.senai.entidades.Pessoa;
import com.fieb.senai.entidades.Professor;
import com.fieb.senai.entidades.Telefone;

/**
 *
 * @author Aluno
 */
public class Aulaassociacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
     Pessoa p1 = new Aluno ("Maria", 5464879, 41);
     Endereco end1 = new Endereco ("Rua A", "41", "Pituba");
     Telefone tel1 = new Telefone ("9999-8888");
     
     //declarando associacao
     p1.setEndereco(end1);
     p1.setTelefone(tel1);
     
     Pessoa p2 = new Professor ("João", 789456, 45);
     Endereco end2 = new Endereco ("Rua B", "41", "Pituba");
     Telefone tel2 = new Telefone ("1234-5678");
     //declarando associacao
     p2.setEndereco(end2);
     p2.setTelefone(tel2);
     
     //declarando associacao
     
    }
    
}
