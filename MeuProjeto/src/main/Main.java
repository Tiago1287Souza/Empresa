/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.EmpresaController;
import java.util.List;
import model.Empresa;
import view.Empresaview;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String [] args) {
        
       Empresaview empView = new Empresaview();
       List<Empresa> listaEmpresa = empView.coletar();
       
      
       EmpresaController empresaController = new EmpresaController();
       empresaController.VerificarInformacoes(listaEmpresa);
       
       
     
    }
    
    
    
    
}
