package mekanism.common.tier;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import mekanism.common.config.MekanismConfig;

public enum BinTier implements ITier<BinTier> {
    BASIC(4096),
    ADVANCED(8192),
    ELITE(32768),
    ULTIMATE(262144),
    CREATIVE(Integer.MAX_VALUE);

    private final int baseStorage;
    private final BaseTier baseTier;

    BinTier(int s) {
        baseStorage = s;
        baseTier = BaseTier.get(ordinal());
    }

    public static BinTier getDefault() {
        return BASIC;
    }

    public static BinTier get(int index) {
        if (index < 0 || index >= values().length) {
            return getDefault();
        }
        return values()[index];
    }

    public static BinTier get(@Nonnull BaseTier tier) {
        return get(tier.ordinal());
    }

    @Override
    public boolean hasNext() {
        return ordinal() + 1 < values().length;
    }

    @Nullable
    @Override
    public BinTier next() {
        return hasNext() ? get(ordinal() + 1) : null;
    }

    @Override
    public BaseTier getBaseTier() {
        return baseTier;
    }

    public int getStorage() {
        return MekanismConfig.current().general.tiers.get(baseTier).BinStorage.val();
    }

    public int getBaseStorage() {
        return baseStorage;
    }
}