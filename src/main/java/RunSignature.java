import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public class RunSignature {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String msg = "appId=BwnpwZoo&nonce-str=ibuaiVcKdpRxkhJA&timestamp=1631865900&appKey=4b5dc3397f4b883249b9d076fe1dbe387a980271";

        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] digest = messageDigest.digest(msg.getBytes());
        BigInteger no = new BigInteger(1, digest);
        String hashtext = no.toString(16);
        while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
        }
        System.out.println(hashtext.toUpperCase());
    }

}
