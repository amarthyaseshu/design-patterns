package strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EncryptionFactory {

    Map<EncryptingEnum, EncryptingAlgo> map;

    public EncryptionFactory(Set<EncryptingAlgo> encryptingAlgos){
        map=new HashMap<>();
        encryptingAlgos.stream().forEach(encodingAlgo->{
            map.put(encodingAlgo.encodingEnum(),encodingAlgo);
        });
    }

    public EncryptingAlgo findEncodingType(EncryptingEnum encryptingEnum){
        return  map.get(encryptingEnum);
    }
}
