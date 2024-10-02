/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.util.List;
import model.Empresa;

/**
 *
 * @author aluno
 */
public class EmpresaController {
    
    public void VerificarInformacoes(List<Empresa> listaEmpresa) {
        
        for (Empresa empresa : listaEmpresa) {
            
            
            
        }
        
        
        
        
        
        
       empresa.setNome_fantasia("");
        if(empresa.getNome_fantasia().equals("")) {
            
            System.out.println("Razao social nao digitada");
        } else {
            System.out.println("Razao social digitalizada");
        }
        
        if(empresa.getCnpj().equals("")) {
            System.out.println("CNPJ social nao digitada");
        } else {
            System.out.println("CNPJ digitalizada");
        }
        
        if (empresa.getNome_fantasia().equals("")) {
            System.out.println("NOME FANTASIA DIGITALIZADA");
        }else {
            System.out.println("NOME FANTASIA DIGITALIZADA");
        }
    
    }
}
