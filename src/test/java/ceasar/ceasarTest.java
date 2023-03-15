package ceasar;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.ciphers.cipher.ceasar.Ceasar.*;

public class ceasarTest {

    @Test
    public void testSucessEncryptedCeasar(){

        int key = 13;
        String text = "icaro";
        assertEquals("vpneb",cipherCeasar(key,text));
    }
}
