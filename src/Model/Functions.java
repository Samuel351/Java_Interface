/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.Tela_2;
import static View.Tela_2.resultado;

public class Functions {
    
    public static void som(){
    
        Tela_2.v1 = Integer.parseInt(Tela_2.val1.getText());
        Tela_2.v2 = Integer.parseInt(Tela_2.val2.getText());
        Tela_2.resultado = Tela_2.v1 + Tela_2.v2;
        
        Tela_2.Result.setText(String.valueOf(resultado));
    }
    public static void sub(){
    
        Tela_2.v1 = Integer.parseInt(Tela_2.val1.getText());
        Tela_2.v2 = Integer.parseInt(Tela_2.val2.getText());
        Tela_2.resultado = Tela_2.v1 - Tela_2.v2;
        
        Tela_2.Result.setText(String.valueOf(resultado));
    }
    public static void mult(){
    
        Tela_2.v1 = Integer.parseInt(Tela_2.val1.getText());
        Tela_2.v2 = Integer.parseInt(Tela_2.val2.getText());
        Tela_2.resultado = Tela_2.v1 * Tela_2.v2;
        
        Tela_2.Result.setText(String.valueOf(resultado));
    }
    public static void div(){
    
        Tela_2.v1 = Integer.parseInt(Tela_2.val1.getText());
        Tela_2.v2 = Integer.parseInt(Tela_2.val2.getText());
        Tela_2.resultado = Tela_2.v1 / Tela_2.v2;
        
         Tela_2.Result.setText(String.valueOf(resultado));
    }
}
    

