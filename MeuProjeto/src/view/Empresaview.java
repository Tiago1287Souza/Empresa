/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Empresa;

/**
 *
 * @author aluno
 */
public class Empresaview {

    public List<Empresa> coletar() {
        Scanner sc = new Scanner(System.in);

        List<Empresa> listaDeEmpresa = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Empresa emp = new Empresa();
            System.out.println("DIGITE AS INFORMAÇOES");
            System.out.println("Razao");
            emp.setRazao_social(sc.next());
            System.out.println("CNPJ");
            emp.setCnpj(sc.next());
            System.out.println("NOME FANTASIA");
            emp.setNome_fantasia(sc.next());
            listaDeEmpresa.add(emp);

        }

//        System.out.println("INFORMAÇÕES DIGITADAS ");
//        System.out.println(" RAZAO -> " + emp.getRazao_social());
//        System.out.println("CNPJ ->" + emp.getCnpj());
//        System.out.println("NOME FANTASIA ->" + emp.getNome_fantasia());
//        
        return listaDeEmpresa;

    }
}
