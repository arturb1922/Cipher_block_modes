
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Main {

    private static SecretKeySpec skey;
    private static byte[] key;

    public static void setSkey(String tempKey) {
        MessageDigest hash = null;

        try{
            key=tempKey.getBytes("UTF-8");
            hash=MessageDigest.getInstance("SHA-256");
            key=hash.digest(key);
            key= Arrays.copyOf(key,16);
            skey= new SecretKeySpec(key,"AES");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static String encode(String plainText, SecretKeySpec skey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE,skey);
        return null;
    }

//comment

    public static void main(String[] args) {

    }
}
