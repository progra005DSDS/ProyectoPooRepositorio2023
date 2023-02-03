import com.java.clase.Persona;

import javax.swing.*;

public class Main {public static void main(String[] args) {

    calcularImc();
}
    public static void
     calcularImc() {

        Persona primera = new Persona();

     primera.setNombre( JOptionPane.showInputDialog("Ingrese s nombre: "));
     primera.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura: ")));
     primera.setPeso (Float.parseFloat(JOptionPane.showInputDialog("Ingrese su peso: ")));


     JOptionPane.showMessageDialog(null,primera.toString());
    }
}
