public enum EstadoBrasileiro {
    // os estados brasilieros são os objeetos


    SAO_PAULO ("SP", "Sao Paulo"),
    Ceara ("CE","Ceara");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNomemaisculo(){
        return nome.toUpperCase();
    }
}
