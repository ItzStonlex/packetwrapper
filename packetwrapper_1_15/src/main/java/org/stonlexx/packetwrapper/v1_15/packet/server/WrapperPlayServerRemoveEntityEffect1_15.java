package org.stonlexx.packetwrapper.v1_15.packet.server;

import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.potion.PotionEffectType;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerRemoveEntityEffect;

import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayServerRemoveEntityEffect1_15 
        extends MinecraftPacket
        implements WrapperPlayServerRemoveEntityEffect {

	public WrapperPlayServerRemoveEntityEffect1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerRemoveEntityEffect1_15(PacketContainer packet) {
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

	public PotionEffectType getEffect() {
		return container.getEffectTypes().read(0);
	}

	public void setEffect(PotionEffectType value) {
		container.getEffectTypes().write(0, value);
	}
}