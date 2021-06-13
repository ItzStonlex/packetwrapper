package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerHeldItemSlot extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.HELD_ITEM_SLOT;


    /**
     * Retrieve Slot.
     * <p>
     * Notes: the slot which the player has selected (0-8)
     *
     * @return The current Slot
     */
    int getSlot();

    /**
     * Set Slot.
     *
     * @param value - new value.
     */
    void setSlot(int value);

}
