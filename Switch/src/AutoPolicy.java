public class AutoPolicy {
    //Atributos
    private int accountNumber; // numero da conta da apolice
    private String makeANdModel; // carro a qual a apolice é aplicada
    private String satate; // abreviatura do estadocom duas letras

    // Construtor

    public AutoPolicy(int accountNumber, String makeANdModel, String satate) {
        this.accountNumber = accountNumber;
        this.makeANdModel = makeANdModel;
        this.satate = satate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeANdModel() {
        return makeANdModel;
    }

    public void setMakeANdModel(String makeANdModel) {
        this.makeANdModel = makeANdModel;
    }

    public String getSatate() {
        return satate;
    }

    public void setSatate(String satate) {
        this.satate = satate;
    }

    public boolean isNoFaultState(){
        boolean noFaultState;

        switch (getSatate()){
            case "MA": case "NJ" : case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }


}
