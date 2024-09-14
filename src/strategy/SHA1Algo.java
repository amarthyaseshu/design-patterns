package strategy;

public class SHA1Algo implements EncryptingAlgo {
    @Override
    public String encrypt() {
        return "SHA1 Algo";
    }

    @Override
    public EncryptingEnum encodingEnum() {
        return EncryptingEnum.SHA1;
    }
}
