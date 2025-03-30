import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // pede para usuario inserir seeu nome
        String name = JOptionPane.showInputDialog("Whhat's your naame ?");
        //cri a mensagem
        String message = String.format("Welcome, %s, To Java Programming", name);
        // eexibee a meensaagem
        JOptionPane.showMessageDialog(null, message);
    }
}