package com.bionicuniversity.stairway.sounds.logic.hash;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by root on 21.12.14.
 */
public class PasswordHash {
    private static byte [] mdBytes = new byte[1024];

        public static String sha256(String password) {

            try {
                MessageDigest md = MessageDigest.getInstance("SHA-256");
                md.update(password.getBytes("UTF-8"));
                mdBytes = md.digest();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            StringBuffer hexString = new StringBuffer();
            for (int i=0;i<mdBytes.length;i++) {
                hexString.append(Integer.toHexString(0xFF & mdBytes[i]));
            }

            return hexString.toString();
    }

    public static byte[] getMdBytes() {
        return mdBytes;
    }

    public static void setMdBytes(byte[] mdBytes) {
        PasswordHash.mdBytes = mdBytes;
    }
}
