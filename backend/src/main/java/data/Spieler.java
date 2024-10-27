package data;

import java.util.UUID;

public class Spieler {
    private final UUID id;
    private String name;
    private String bild;

    public Spieler(String name, String bild) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.bild = bild;
    }


}
