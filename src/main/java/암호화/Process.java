package 암호화;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Process {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        User user = new User(1L, "bbaaccdd");
        System.out.println(getEncSHA256(user.getPassword()));
    }


    public static String getEncSHA256(String password) throws NoSuchAlgorithmException {
        StringBuffer sb = new StringBuffer();

        final MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(password.getBytes());

        final byte[] msgSt = messageDigest.digest();

        for (byte tempStrByte : msgSt) {
            final String tmpEncTxt  = Integer.toString((tempStrByte & 0xff) + 0x100, 16).substring(1);

            sb.append(tmpEncTxt);
        }

        return sb.toString();
    }
}
