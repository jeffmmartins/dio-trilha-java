import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // pede para usuario inserir seu nome
        String name = JOptionPane.showInputDialog("Whhat's your naame ?");
        //cria mensagem
        String message = String.format("Welcome, %s, To Java Programming", name);
        // eexibe a mensagem
        JOptionPane.showMessageDialog(null, message);
    }
}