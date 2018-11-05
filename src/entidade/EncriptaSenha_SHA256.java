package entidade;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 *
 * @author Cassiano Rogério
 * 
 */

//algoritmo para encriptar com o SHA-256
public class EncriptaSenha_SHA256 {
    /** Creates a new instance of EncriptaSenha
     * @param senha
     * @return  */
   
    public static String encripta (String senha) {
        try {
            //MessageDigest mensagem = MessageDigest.getInstance("MD5");
            MessageDigest mensagem = MessageDigest.getInstance("SHA-256");
            mensagem.update(senha.getBytes());
            String encoder = Base64.getEncoder().encodeToString(mensagem.digest());
            return encoder;
        }catch (NoSuchAlgorithmException ns) {
            ns.printStackTrace();
            return senha;
        }
    }    
}