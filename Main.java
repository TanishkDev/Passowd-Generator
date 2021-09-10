

import java.util.Random;
import javax.swing.JOptionPane;

class UserInterface {
    public int length(){
        int len = Integer.parseInt(JOptionPane.showInputDialog("Enter the lenght of the password: "));
        return len;
    }
    public void your_pass(String pass){
        JOptionPane.showMessageDialog(null,"Password :"+pass);
    }
}

class RandomGen {
    int pass_len;

    public RandomGen(int len) {
        this.pass_len = len;

    }

    public String password() {
        String arr[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "w", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "-", "+", "=", "{", "}", "[", "]"};
        int len_of_char = arr.length;

        Random rand = new Random();


        String pass[] = new String[pass_len];
        for (int i = 0; i < pass_len; i++) {
            int temp = rand.nextInt(len_of_char);
            pass[i] = arr[temp];
        }
        String new_pass = String.join("",pass);
        System.out.println(new_pass);

        return new_pass;
    }
}

public class Main {
    public static void main(String args[]) {
        UserInterface gui = new UserInterface();
        int len = gui.length();
        RandomGen rand  =new RandomGen(len);
        gui.your_pass(rand.password());

    }


}
