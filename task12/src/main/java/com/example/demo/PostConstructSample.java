package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

@Component
public class PostConstructSample {
    @PostConstruct
    public void init() throws IOException {
        File file1 = new File("C:\\Users\\Peter\\Downloads\\myData\\hello.txt");
        FileReader fileReader = new FileReader(file1);
        BufferedReader br = new BufferedReader(fileReader);
        String str = "";
        try(FileWriter writer = new FileWriter("C:\\Users\\Peter\\Downloads\\myData\\hello3.txt", false))
        {
            while (br.ready()){
                str = br.readLine();
                byte[] salt = new byte[16];
                SecureRandom random = new SecureRandom();//pbkdf2
                random.nextBytes(salt);
                KeySpec spec = new PBEKeySpec(str.toCharArray(), salt, 65536, 128);
                SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
                byte[] hash = factory.generateSecret(spec).getEncoded();
                for(int i = 0; i<hash.length;i++){
                    writer.append((char) hash[i]);
                }
                writer.append("\n");
            }

            writer.flush();
            writer.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }

    }
}