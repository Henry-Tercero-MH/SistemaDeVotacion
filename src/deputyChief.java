public class deputyChief extends Deputies{
    private String range = "SUB-JEFE DE BLOKE";

    public deputyChief(String name, String block, String distrities,String vote ) {
        super(name,block,distrities,vote);
        this.range = range;
    }

    public deputyChief() {

    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
}
