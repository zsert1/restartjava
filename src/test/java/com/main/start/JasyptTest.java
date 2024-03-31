package com.main.start;




import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;



@Slf4j
public class JasyptTest {
    @Test
    public  void jasyptTest(){
        log.debug("sdasdasdasdasdasdasd");
        String value="!";
        String result=jasyptEncoding(value);

        log.debug("----{}----",result);

    }
    public String jasyptEncoding(String value){
        String key="Mm+XOA3Tco2TtAlgK4rubu78d4BGnEiGeXfGUjtS4bO7I3aQicsoLJb2OhshQjuI";
        StandardPBEStringEncryptor pbeEnc= new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWITHMD5ANDDES");
        pbeEnc.setPassword(key);
        return  pbeEnc.encrypt(value);
    }
}
