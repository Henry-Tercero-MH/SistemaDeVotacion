public class BlockBoss extends Deputies {

    private String range = "JEFE DE BLOQUE";

    public BlockBoss() {
    }

    public BlockBoss(String name, String block, String distrities, String vote ) {
       super(name,block,distrities,vote);
        this.range = range;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
}
