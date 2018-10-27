import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    public static void main(String[] args) throws Exception {
        byte[] plain = "abcdefghijklmnopabcdefghijklmnop".getBytes();
        byte[] key = "klucz--128-bitowklucz--128-bitow".getBytes();
        String plainString= new String(plain,"UTF-8");
        String encryptedString;
        String decryptedStrng;
        SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
        System.out.println(plainString);

        // szyfrowanie
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte encrypted[] = cipher.doFinal(plain);
        encryptedString=new String (encrypted,"UTF-8");
        System.out.println(encryptedString);

        // deszyfrowanie
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte decrypted[] = cipher.doFinal(encrypted);
        decryptedStrng=new String (decrypted,"UTF-8");
        System.out.println(decryptedStrng);

    }
}