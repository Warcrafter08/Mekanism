package mekanism.api;

import javax.annotation.Nullable;
import net.minecraft.util.Direction;

public interface IHeatTransfer {

    /**
     * The value of the zero point of our temperature scale in kelvin
     */
    double AMBIENT_TEMP = 300;

    /**
     * The heat transfer coefficient for air
     */
    double AIR_INVERSE_COEFFICIENT = 10000;

    double getTemp();

    double getInverseConductionCoefficient();

    double getInsulationCoefficient(Direction side);

    void transferHeatTo(double heat);

    double[] simulateHeat();

    double applyTemperatureChange();

    @Nullable
    default IHeatTransfer getAdjacent(Direction side) {
        return null;
    }
}