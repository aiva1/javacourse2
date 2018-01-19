package lv.activestudio.java2.businesslogic.api.remove;

public class RemoveRoomRequest {

    private String name;

    public RemoveRoomRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
