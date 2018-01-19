package lv.activestudio.java2.businesslogic;

import lv.activestudio.java2.businesslogic.api.add.AddRoomRequest;
import lv.activestudio.java2.businesslogic.api.add.AddRoomResponse;

public interface AddRoomService {

    AddRoomResponse addRoom(AddRoomRequest request);
}
