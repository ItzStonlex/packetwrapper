package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerCloseWindow;


public class WrapperPlayServerCloseWindow1_15 
        extends MinecraftPacket
        implements WrapperPlayServerCloseWindow {

	public WrapperPlayServerCloseWindow1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerCloseWindow1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Window ID.
	 * <p>
	 * Notes: this is the id of the window that was closed. 0 for inventory.
	 * 
	 * @return The current Window ID
	 */
	public int getWindowId() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Window ID.
	 * 
	 * @param value - new value.
	 */
	public void setWindowId(int value) {
		container.getIntegers().write(0, value);
	}

}
