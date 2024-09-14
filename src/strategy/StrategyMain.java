package strategy;

import java.util.Set;

public class StrategyMain {

    public static void main(String[] args) {
        Set<EncryptingAlgo> encryptingAlgos =Set.of(new MD5Algo(),new SHA1Algo(),new SHA2Algo());
        EncryptionFactory encryptionFactory=new EncryptionFactory(encryptingAlgos);
        encryptionFactory.findEncodingType(EncryptingEnum.MD5).encrypt();


    }
}
