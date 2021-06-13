package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.wrappers.EnumWrappers.Hand;

public interface WrapperPlayClientBlockPlace extends WrapperPacket {
 PacketType TYPE = PacketType.Play.Client.BLOCK_PLACE;


 Hand getHand();

 void setHand(Hand value);

 long getTimestamp();

 void setTimestamp(long value);

}
