package data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Spiel {
    private final List<Spieler> spielerList;
    private final LocalDateTime datum;
    private final UUID uuid;
    private int startScore;

    public Spiel(List<Spieler> spielerList, int startScore, boolean dobbleOut){
        this.spielerList = spielerList;
        this.datum = LocalDateTime.now();
        this.uuid = UUID.randomUUID();
        this.startScore = startScore;
        this.doubleOut = dobbleOut;
    }

    public List<Spieler> getSpielerList() {
        return spielerList;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public UUID getUuid() {
        return uuid;
    }
// ICH WERDE EINEN MERGECONFLICT VERURSACHEN
    public int getStartScore() {
        return startScore;
    }

    public void setStartScore(int startScore) {
        this.startScore = startScore;
    }

    public boolean isDoubleOut() {
        return doubleOut;
    }

    public void setDoubleOut(boolean doubleOut) {
        this.doubleOut = doubleOut;
    }
    private boolean doubleOut;
}
