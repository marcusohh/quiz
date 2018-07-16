package sg.edu.rp.c346.quiz;

/**
 * Created by 16020089 on 16/7/2018.
 */

public class Mathitem {

    private String name;
    private String formuler;
    private String type;

    public Mathitem(String name, String formuler, String type) {
        this.name = name;
        this.formuler = formuler;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormuler() {
        return formuler;
    }

    public void setFormuler(String formuler) {
        this.formuler = formuler;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Mathitem{" +
                "name='" + name + '\'' +
                ", formuler='" + formuler + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
