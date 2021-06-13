package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerAbilities extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.ABILITIES;


    boolean isInvulnerable();

    void setInvulnerable(boolean value);

    /**
     * Misspelled.
     *
     * @see #isInvulnerable()
     */
    @Deprecated
    boolean isInvulnurable();

    /**
     * Misspelled.
     *
     * @see #setInvulnerable(boolean)
     */
    @Deprecated
    void setInvulnurable(boolean value);

    boolean isFlying();

    void setFlying(boolean value);

    boolean canFly();

    void setCanFly(boolean value);

    boolean canInstantlyBuild();

    void setCanInstantlyBuild(boolean value);

    float getFlyingSpeed();

    void setFlyingSpeed(float value);

    float getWalkingSpeed();

    void setWalkingSpeed(float value);
}
