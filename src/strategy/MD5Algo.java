package strategy;

public class MD5Algo implements EncryptingAlgo {
    @Override
    public String encrypt() {
        return "MD5 Implementation";
    }

    @Override
    public EncryptingEnum encodingEnum() {
        return EncryptingEnum.MD5;
    }
}
