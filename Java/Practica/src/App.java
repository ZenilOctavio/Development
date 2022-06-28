import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Hi", "Enter something");
        JOptionPane.showMessageDialog(null,("Hello "+name));
        System.out.println(name);

    }
}
