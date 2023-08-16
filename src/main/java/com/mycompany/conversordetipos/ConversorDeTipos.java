/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversordetipos;

import javax.swing.JOptionPane;

/**
 *
 * @author nando
 */
public class ConversorDeTipos {

    public static void main(String[] args) {
        String s;
        char valorChar;
        boolean valorLogico;
        byte valorByte;
        short valorShort;
        int valorInt;
        long valorLong;
        float valorFloat;
        double valorDouble;
        
        s = JOptionPane.showInputDialog("Escolha sua Opção (s - sim ou n - não)");
        valorChar = s.charAt(0);
        System.out.println("O valor do char eh..: "+valorChar);
           
        s = JOptionPane.showInputDialog("Digite true para verdadeiro ou false para falso");
        valorLogico = Boolean.parseBoolean(s);
        System.out.println("O valor do boolean eh..: "+valorLogico);
        
        s = JOptionPane.showInputDialog("Entre com um valor do tipo byte");
        valorByte = Byte.parseByte(s);
        System.out.println("O valor do byte eh..: "+valorByte);
        
        s = JOptionPane.showInputDialog(" Entre com um valor do tipo short");
        valorShort = Short.parseShort(s);
        System.out.println("O valor do short eh..: "+valorShort);
        
        s = JOptionPane.showInputDialog(" Entre com um valor do tipo int");
        valorInt = Integer.parseInt(s);
        System.out.println("O valor do int eh..: "+valorInt);
        
        s = JOptionPane.showInputDialog(" Entre com um valor do tipo long");
        valorLong = Long.parseLong(s);
        System.out.println("O valor do long eh..: "+valorLong);
        
        s = JOptionPane.showInputDialog(" Entre com um valor do tipo float");
        valorFloat = Float.parseFloat(s);
        System.out.println("O valor do float eh..: "+valorFloat);
        
        s = JOptionPane.showInputDialog(" Entre com um valor do tipo double");
        valorDouble = Double.parseDouble(s);
        System.out.println("O valor do double eh..: "+valorDouble);
                
    }
}
