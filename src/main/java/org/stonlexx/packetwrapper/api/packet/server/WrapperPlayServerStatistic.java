package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerStatistic extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.STATISTIC;

}

