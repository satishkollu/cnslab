import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[]args) throws Exception{

        KeyGenerator keygenerator= KeyGenerator.getInstance("Blowfish");


        SecretKey secretkey=keygenerator.generateKey();

        Cipher cipher=Cipher.getInstance("Blowfish");

        cipher.init(Cipher.ENCRYPT_MODE,secretkey);

        String inputText = "Hello world";

        byte[] encrypted=cipher.doFinal(inputText.getBytes());

        cipher.init(Cipher.DECRYPT_MODE,secretkey);

        byte[] decrypted=cipher.doFinal(encrypted);


        System.out.println("Original String: " + inputText);
        System.out.println("Encrypted: " + new String(encrypted));
        System.out.println("Decrypted: " + new String(decrypted));
 }
}