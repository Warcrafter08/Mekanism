package mekanism.common.tier;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import mekanism.common.config.MekanismConfig;

public enum InductionCellTier implements ITier<InductionCellTier> {
    BASIC(1E9D),
    ADVANCED(8E9D),
    ELITE(64E9D),
    ULTIMATE(512E9D);

    private final double baseMaxEnergy;
    private final BaseTier baseTier;

    InductionCellTier(double max) {
        baseMaxEnergy = max;
        baseTier = BaseTier.get(ordinal());
    }

    public static InductionCellTier getDefault() {
        return BASIC;
    }

    public static InductionCellTier get(int index) {
        if (index < 0 || index >= values().length) {
            return getDefault();
        }
        return values()[index];
    }

    public static InductionCellTier get(@Nonnull BaseTier tier) {
        return get(tier.ordinal());
    }

    @Override
    public boolean hasNext() {
        return ordinal() + 1 < values().length;
    }

    @Nullable
    @Override
    public InductionCellTier next() {
        return hasNext() ? get(ordinal() + 1) : null;
    }

    @Override
    public BaseTier getBaseTier() {
        return baseTier;
    }

    public double getMaxEnergy() {
        return MekanismConfig.current().general.tiers.get(baseTier).InductionCellMaxEnergy.val();
    }

    public double getBaseMaxEnergy() {
        return baseMaxEnergy;
    }
}