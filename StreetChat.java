import java.io.*;
public class StreetChat implements Serializable {
 protected static final long streetVersion = 10102100L;
    static final int WHOIDEYSTREET = 0, MESSAGE = 1, LOGOUT = 2;
    private int type;
    private double streetLat;
    private double streetLong;
    private String message;

     
    ChatMessage(int type, String message) {

        this.type = type;

        this.message = message;

    }
    // getters

    int getType() {

        return type;

    }

    String getMessage() {

        return message;

    }

}
