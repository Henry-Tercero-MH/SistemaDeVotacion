public class deputyChief2 extends Deputies {
    private String range = "SUB-JEFE DE BLOKE 2";

    public deputyChief2(String name, String block, String distrities,String vote ) {
        super(name,block,distrities,vote);
        this.range = range;
    }

    public deputyChief2() {
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
}
