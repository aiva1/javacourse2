package lv.activestudio.java2.businesslogic;

import lv.activestudio.java2.businesslogic.api.remove.RemoveRoomRequest;
import lv.activestudio.java2.businesslogic.api.remove.RemoveRoomResponse;

public interface RemoveRoomService {

    RemoveRoomResponse removeByName(RemoveRoomRequest request);
}
