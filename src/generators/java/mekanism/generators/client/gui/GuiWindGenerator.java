package mekanism.generators.client.gui;

import java.text.DecimalFormat;
import java.util.Arrays;
import mekanism.api.text.EnumColor;
import mekanism.client.gui.GuiMekanismTile;
import mekanism.client.gui.element.GuiEnergyInfo;
import mekanism.client.gui.element.GuiRedstoneControl;
import mekanism.client.gui.element.GuiSlot;
import mekanism.client.gui.element.GuiSlot.SlotOverlay;
import mekanism.client.gui.element.GuiSlot.SlotType;
import mekanism.client.gui.element.bar.GuiVerticalPowerBar;
import mekanism.client.gui.element.tab.GuiSecurityTab;
import mekanism.common.MekanismLang;
import mekanism.common.base.ILangEntry;
import mekanism.common.util.MekanismUtils;
import mekanism.common.util.text.EnergyDisplay;
import mekanism.generators.common.GeneratorsLang;
import mekanism.generators.common.MekanismGenerators;
import mekanism.generators.common.config.MekanismGeneratorsConfig;
import mekanism.generators.common.inventory.container.WindGeneratorContainer;
import mekanism.generators.common.tile.TileEntityWindGenerator;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class GuiWindGenerator extends GuiMekanismTile<TileEntityWindGenerator, WindGeneratorContainer> {

    private final DecimalFormat powerFormat = new DecimalFormat("0.##");

    public GuiWindGenerator(WindGeneratorContainer container, PlayerInventory inv, ITextComponent title) {
        super(container, inv, title);
    }

    @Override
    public void init() {
        super.init();
        ResourceLocation resource = getGuiLocation();
        addButton(new GuiRedstoneControl(this, tile, resource));
        addButton(new GuiSecurityTab<>(this, tile, resource));
        addButton(new GuiEnergyInfo(() -> Arrays.asList(
              GeneratorsLang.PRODUCING_AMOUNT.translate(EnergyDisplay.of(tile.getActive() ? MekanismGeneratorsConfig.generators.windGenerationMin.get() * tile.getCurrentMultiplier() : 0)),
              MekanismLang.MAX_OUTPUT.translate(EnergyDisplay.of(tile.getMaxOutput()))), this, resource));
        addButton(new GuiVerticalPowerBar(this, tile, resource, 164, 15));
        addButton(new GuiSlot(SlotType.NORMAL, this, resource, 142, 34).with(SlotOverlay.POWER));
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        drawString(tile.getName(), 45, 6, 0x404040);
        drawString(MekanismLang.INVENTORY.translate(), 8, (getYSize() - 96) + 2, 0x404040);
        drawString(EnergyDisplay.of(tile.getEnergy(), tile.getMaxEnergy()).getTextComponent(), 51, 26, 0x00CD00);
        //TODO: Why is this different from how all the other ones do it
        drawString(GeneratorsLang.POWER.translate(powerFormat.format(MekanismUtils.convertToDisplay(
              MekanismGeneratorsConfig.generators.windGenerationMin.get() * tile.getCurrentMultiplier()))), 51, 35, 0x00CD00);
        drawString(GeneratorsLang.OUTPUT_RATE_SHORT.translate(EnergyDisplay.of(tile.getMaxOutput())), 51, 44, 0x00CD00);
        int size = 44;
        if (!tile.getActive()) {
            size += 9;
            ILangEntry reason = GeneratorsLang.SKY_BLOCKED;
            if (tile.isBlacklistDimension()) {
                reason = GeneratorsLang.NO_WIND;
            }
            drawString(reason.translateColored(EnumColor.DARK_RED), 51, size, 0x00CD00);
        }
        super.drawGuiContainerForegroundLayer(mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(int xAxis, int yAxis) {
        super.drawGuiContainerBackgroundLayer(xAxis, yAxis);
        drawTexturedRect(getGuiLeft() + 20, getGuiTop() + 37, 176, tile.getActive() ? 52 : 64, 12, 12);
    }

    @Override
    protected ResourceLocation getGuiLocation() {
        return MekanismGenerators.rl("gui/wind_generator.png");
    }
}