package strategy;

public class SHA2Algo implements EncryptingAlgo {
    @Override
    public String encrypt() {
        return "SHA2 Algo";
    }

    @Override
    public EncryptingEnum encodingEnum() {
        return EncryptingEnum.SHA2;
    }
}
