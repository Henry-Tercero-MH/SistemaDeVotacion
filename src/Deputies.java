public class Deputies {
    private int correlative;
    private String name;
    private String block;
    private String district;
    private String vote=" ";
    private int conAFavor =0;

    private int contEnContra=0;
    //contructor por defecto

    //contructor con parametros

    public Deputies(String name, String block, String district,String vote) {
        if (vote=="1"){
            String votoFavor="A FAVOR";
            this.vote = votoFavor;
            conAFavor++;
            this.conAFavor = conAFavor;
        }else if (vote=="2"){
            String votoContra="En CONTRA";
            this.vote = votoContra;
            contEnContra++;
            this.contEnContra = contEnContra;
        }
        correlative++;//aumentara el contador cada vez que se ingrese un nuevo voto
        this.correlative = correlative;
        this.name = name;
        this.block = block;
        this.district = district;

    }

    public Deputies() {

    }




    //metodos de acceso getters y setters

    public int getCorrelatie() {
        return correlative;
    }

    public void setCorrelativo(int correlative) {
        this.correlative = correlative;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public int getConAFavor() {
        return conAFavor;
    }

    public void setConAFavor(int conAFavor) {
        this.conAFavor = conAFavor;
    }

    public int getContEnContra() {
        return contEnContra;
    }

    public void setContEnContra(int contEnContra) {
        this.contEnContra = contEnContra;
    }

    public void Aprobacion(){
if (this.conAFavor==81){
    System.out.println("LA LEY FUE APROBADA CON "+conAFavor+"VOTOS A FAVOR");
}else if (this.contEnContra==81){
    System.out.println("LA LEY FUE RECHAZADA CON "+contEnContra+"VOTOS A FAVOR");
}else if (this.conAFavor==80 && this.contEnContra==80){
    System.out.println("TABLAS");
}
    }

}


