package org.stonlexx.packetwrapper.v1_12.packet.server;

import org.bukkit.World;
import org.bukkit.entity.Entity;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerRelEntityMoveLook;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayServerRelEntityMoveLook1_12 
        extends MinecraftPacket
        implements WrapperPlayServerRelEntityMoveLook {

	public WrapperPlayServerRelEntityMoveLook1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerRelEntityMoveLook1_12(PacketContainer packet) {
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
	 * Retrieve DX.
	 * 
	 * @return The current DX
	 */
	public double getDx() {
		return container.getIntegers().read(1) / 4096D;
	}

	/**
	 * Set DX.
	 *
	 * @param value - new value.
	 */
	public void setDx(double value) {
		container.getIntegers().write(1, (int) (value * 4096));
	}

	/**
	 * Retrieve DY.
	 *
	 * @return The current DY
	 */
	public double getDy() {
		return container.getIntegers().read(2) / 4096D;
	}

	/**
	 * Set DY.
	 *
	 * @param value - new value.
	 */
	public void setDy(double value) {
		container.getIntegers().write(2, (int) (value * 4096));
	}

	/**
	 * Retrieve DZ.
	 *
	 * @return The current DZ
	 */
	public double getDz() {
		return container.getIntegers().read(3) / 4096D;
	}

	/**
	 * Set DZ.
	 *
	 * @param value - new value.
	 */
	public void setDz(double value) {
		container.getIntegers().write(3, (int) (value * 4096));
	}

	/**
	 * Retrieve the yaw of the current entity.
	 * 
	 * @return The current Yaw
	 */
	public float getYaw() {
		return (container.getBytes().read(0) * 360.F) / 256.0F;
	}

	/**
	 * Set the yaw of the current entity.
	 * 
	 * @param value - new yaw.
	 */
	public void setYaw(float value) {
		container.getBytes().write(0, (byte) (value * 256.0F / 360.0F));
	}

	/**
	 * Retrieve the pitch of the current entity.
	 * 
	 * @return The current pitch
	 */
	public float getPitch() {
		return (container.getBytes().read(1) * 360.F) / 256.0F;
	}

	/**
	 * Set the pitch of the current entity.
	 * 
	 * @param value - new pitch.
	 */
	public void setPitch(float value) {
		container.getBytes().write(1, (byte) (value * 256.0F / 360.0F));
	}

	/**
	 * Retrieve On Ground.
	 * 
	 * @return The current On Ground
	 */
	public boolean getOnGround() {
		return container.getBooleans().read(0);
	}

	/**
	 * Set On Ground.
	 * 
	 * @param value - new value.
	 */
	public void setOnGround(boolean value) {
		container.getBooleans().write(0, value);
	}
}