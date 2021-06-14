package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerAttachEntity;

public class WrapperPlayServerAttachEntity1_15
		extends MinecraftPacket
		implements WrapperPlayServerAttachEntity {

	public WrapperPlayServerAttachEntity1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerAttachEntity1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Entity ID.
	 * <p>
	 * Notes: entity's ID
	 * 
	 * @return The current Entity ID
	 */
	public int getEntityID() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Entity ID.
	 * 
	 * @param value - new value.
	 */
	public void setEntityID(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param world - the current world of the entity.
	 * @return The spawned entity.
	 */
	public Entity getEntity(World world) {
		return container.getEntityModifier(world).read(0);
	}

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param event - the packet event.
	 * @return The spawned entity.
	 */
	public Entity getEntity(PacketEvent event) {
		return getEntity(event.getPlayer().getWorld());
	}

	/**
	 * Retrieve Vehicle ID.
	 * <p>
	 * Notes: vehicle's Entity ID
	 * 
	 * @return The current Vehicle ID
	 */
	public int getVehicleId() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Vehicle ID.
	 * 
	 * @param value - new value.
	 */
	public void setVehicleId(int value) {
		container.getIntegers().write(1, value);
	}
}
