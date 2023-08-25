public class Member extends Deputies {
    private String range = "INTEGRANTE";

    public Member(String name, String block, String distrities,String vote ) {
        super(name,block,distrities,vote);
        this.range = range;
    }

    public Member() {
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
}
