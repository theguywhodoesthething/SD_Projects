package project;

public class Key {
    public int[] key (int encryptedKey) {
        int[] i = new int[encryptedKey];
        
        for (int j =0; j < encryptedKey; j++) {
            i[j] = (int)(Math.random()*26);     
        }
        return i;
    }
 }
