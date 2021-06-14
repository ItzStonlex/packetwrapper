package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerSpawnPosition;
import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayServerSpawnPosition1_12 
        extends MinecraftPacket
        implements WrapperPlayServerSpawnPosition {

	public WrapperPlayServerSpawnPosition1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerSpawnPosition1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Location.
	 * <p>
	 * Notes: spawn location
	 * 
	 * @return The current Location
	 */
	public BlockPosition getLocation() {
		return container.getBlockPositionModifier().read(0);
	}

	/**
	 * Set Location.
	 * 
	 * @param value - new value.
	 */
	public void setLocation(BlockPosition value) {
		container.getBlockPositionModifier().write(0, value);
	}

}
