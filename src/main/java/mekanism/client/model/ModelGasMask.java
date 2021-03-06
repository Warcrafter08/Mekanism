package mekanism.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import javax.annotation.Nonnull;
import mekanism.client.render.MekanismRenderType;
import mekanism.client.render.MekanismRenderer;
import mekanism.common.util.MekanismUtils;
import mekanism.common.util.MekanismUtils.ResourceType;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

public class ModelGasMask extends Model {

    private static final ResourceLocation MASK_TEXTURE = MekanismUtils.getResource(ResourceType.RENDER, "scuba_set.png");
    private static final RenderType GLASS_RENDER_TYPE = MekanismRenderType.mekStandard(MASK_TEXTURE);
    private final RenderType RENDER_TYPE = func_228282_a_(MASK_TEXTURE);

    private final ModelRenderer helmetfeed;
    private final ModelRenderer tubeback;
    private final ModelRenderer tubeL;
    private final ModelRenderer tubeR;
    private final ModelRenderer tubefront;
    private final ModelRenderer mouthintake;
    private final ModelRenderer finupperR;
    private final ModelRenderer finupperL;
    private final ModelRenderer finmidR;
    private final ModelRenderer finmidL;
    private final ModelRenderer finback;
    private final ModelRenderer topplate;
    private final ModelRenderer filterL;
    private final ModelRenderer filterR;
    private final ModelRenderer filterpipelower;
    private final ModelRenderer filterpipeupper;
    private final ModelRenderer glasstop;
    private final ModelRenderer glassfront;
    private final ModelRenderer glassR;
    private final ModelRenderer glassL;
    private final ModelRenderer glassbackR;
    private final ModelRenderer glassbackL;
    private final ModelRenderer pipecornerFL;
    private final ModelRenderer pipecornerFR;
    private final ModelRenderer pipecornerBR;
    private final ModelRenderer pipecornerBL;
    private final ModelRenderer lightL;
    private final ModelRenderer lightR;

    public ModelGasMask() {
        super(RenderType::func_228634_a_);
        textureWidth = 128;
        textureHeight = 64;

        helmetfeed = new ModelRenderer(this, 88, 43);
        helmetfeed.func_228304_a_(-2F, -2F, 2F, 4, 3, 4, false);
        helmetfeed.setRotationPoint(0F, 0F, 0F);
        helmetfeed.setTextureSize(128, 64);
        helmetfeed.mirror = true;
        setRotation(helmetfeed, 0F, 0F, 0F);
        tubeback = new ModelRenderer(this, 106, 50);
        tubeback.func_228304_a_(-4.5F, -1F, 4.5F, 9, 1, 1, false);
        tubeback.setRotationPoint(0F, 0F, 0F);
        tubeback.setTextureSize(128, 64);
        tubeback.mirror = true;
        setRotation(tubeback, 0F, 0F, 0F);
        tubeL = new ModelRenderer(this, 106, 54);
        tubeL.func_228304_a_(4.5F, -1F, -4.5F, 1, 1, 9, false);
        tubeL.setRotationPoint(0F, 0F, 0F);
        tubeL.setTextureSize(128, 64);
        tubeL.mirror = true;
        setRotation(tubeL, 0F, 0F, 0F);
        tubeR = new ModelRenderer(this, 106, 54);
        tubeR.func_228304_a_(-5.5F, -1F, -4.5F, 1, 1, 9, false);
        tubeR.setRotationPoint(0F, 0F, 0F);
        tubeR.setTextureSize(128, 64);
        tubeR.mirror = true;
        setRotation(tubeR, 0F, 0F, 0F);
        tubefront = new ModelRenderer(this, 106, 50);
        tubefront.func_228304_a_(-4.5F, -1F, -5.5F, 9, 1, 1, false);
        tubefront.setRotationPoint(0F, 0F, 0F);
        tubefront.setTextureSize(128, 64);
        tubefront.mirror = true;
        setRotation(tubefront, 0F, 0F, 0F);
        mouthintake = new ModelRenderer(this, 118, 42);
        mouthintake.func_228304_a_(-1.5F, -0.7F, -6F, 3, 2, 3, false);
        mouthintake.setRotationPoint(0F, -2F, 0F);
        mouthintake.setTextureSize(128, 64);
        mouthintake.mirror = true;
        setRotation(mouthintake, 0.2094395F, 0F, 0F);
        finupperR = new ModelRenderer(this, 78, 50);
        finupperR.func_228304_a_(-6F, -7.5F, -3.3F, 1, 2, 12, false);
        finupperR.setRotationPoint(0F, 0F, 0F);
        finupperR.setTextureSize(128, 64);
        finupperR.mirror = true;
        setRotation(finupperR, 0.0698132F, 0F, 0F);
        finupperL = new ModelRenderer(this, 78, 50);
        finupperL.func_228304_a_(5F, -7.5F, -3.3F, 1, 2, 12, false);
        finupperL.setRotationPoint(0F, 0F, 0F);
        finupperL.setTextureSize(128, 64);
        finupperL.mirror = true;
        setRotation(finupperL, 0.0698132F, 0F, 0F);
        finupperL.mirror = false;
        finmidR = new ModelRenderer(this, 72, 34);
        finmidR.func_228304_a_(-7.5F, -6F, -1F, 2, 2, 5, false);
        finmidR.setRotationPoint(0F, 0F, 0F);
        finmidR.setTextureSize(128, 64);
        finmidR.mirror = true;
        setRotation(finmidR, 0F, 0F, 0F);
        finmidL = new ModelRenderer(this, 72, 34);
        finmidL.func_228304_a_(5.5F, -6F, -1F, 2, 2, 5, false);
        finmidL.setRotationPoint(0F, 0F, 0F);
        finmidL.setTextureSize(128, 64);
        finmidL.mirror = true;
        setRotation(finmidL, 0F, 0F, 0F);
        finmidL.mirror = false;
        finback = new ModelRenderer(this, 80, 0);
        finback.func_228304_a_(-1F, -9.6F, 2.5F, 2, 10, 3, false);
        finback.setRotationPoint(0F, 0F, 0F);
        finback.setTextureSize(128, 64);
        finback.mirror = true;
        setRotation(finback, 0F, 0F, 0F);
        topplate = new ModelRenderer(this, 104, 34);
        topplate.func_228304_a_(-3F, -10F, -2F, 6, 2, 6, false);
        topplate.setRotationPoint(0F, 0F, 0F);
        topplate.setTextureSize(128, 64);
        topplate.mirror = true;
        setRotation(topplate, 0.1396263F, 0F, 0F);
        filterL = new ModelRenderer(this, 108, 42);
        filterL.func_228304_a_(3.4F, -1.8F, -5F, 2, 3, 3, false);
        filterL.setRotationPoint(0F, 0F, 0F);
        filterL.setTextureSize(128, 64);
        filterL.mirror = true;
        setRotation(filterL, 0F, 0.3839724F, 0.5061455F);
        filterL.mirror = false;
        filterR = new ModelRenderer(this, 108, 42);
        filterR.func_228304_a_(-5.4F, -1.8F, -5F, 2, 3, 3, false);
        filterR.setRotationPoint(0F, 0F, 0F);
        filterR.setTextureSize(128, 64);
        filterR.mirror = true;
        setRotation(filterR, 0F, -0.3839724F, -0.5061455F);
        filterpipelower = new ModelRenderer(this, 92, 41);
        filterpipelower.func_228304_a_(-3F, 1F, -5F, 5, 1, 1, false);
        filterpipelower.setRotationPoint(0F, 0F, 0F);
        filterpipelower.setTextureSize(128, 64);
        filterpipelower.mirror = true;
        setRotation(filterpipelower, 0F, 0F, 0F);
        filterpipeupper = new ModelRenderer(this, 104, 42);
        filterpipeupper.func_228304_a_(-0.5F, 0F, -5F, 1, 1, 1, false);
        filterpipeupper.setRotationPoint(0F, 0F, 0F);
        filterpipeupper.setTextureSize(128, 64);
        filterpipeupper.mirror = true;
        setRotation(filterpipeupper, 0F, 0F, 0F);
        glasstop = new ModelRenderer(this, 0, 0);
        glasstop.func_228304_a_(-4F, -9F, -4F, 8, 1, 8, false);
        glasstop.setRotationPoint(0F, 0F, 0F);
        glasstop.setTextureSize(128, 64);
        glasstop.mirror = true;
        setRotation(glasstop, 0F, 0F, 0F);
        glassfront = new ModelRenderer(this, 0, 0);
        glassfront.func_228304_a_(-4F, -8F, -5F, 8, 7, 1, false);
        glassfront.setRotationPoint(0F, 0F, 0F);
        glassfront.setTextureSize(128, 64);
        glassfront.mirror = true;
        setRotation(glassfront, 0F, 0F, 0F);
        glassR = new ModelRenderer(this, 0, 0);
        glassR.func_228304_a_(-5F, -8F, -4F, 1, 7, 8, false);
        glassR.setRotationPoint(0F, 0F, 0F);
        glassR.setTextureSize(128, 64);
        glassR.mirror = true;
        setRotation(glassR, 0F, 0F, 0F);
        glassL = new ModelRenderer(this, 0, 0);
        glassL.func_228304_a_(4F, -8F, -4F, 1, 7, 8, false);
        glassL.setRotationPoint(0F, 0F, 0F);
        glassL.setTextureSize(128, 64);
        glassL.mirror = true;
        setRotation(glassL, 0F, 0F, 0F);
        glassbackR = new ModelRenderer(this, 0, 0);
        glassbackR.func_228304_a_(-4F, -8F, 4F, 3, 7, 1, false);
        glassbackR.setRotationPoint(0F, 0F, 0F);
        glassbackR.setTextureSize(128, 64);
        glassbackR.mirror = true;
        setRotation(glassbackR, 0F, 0F, 0F);
        glassbackL = new ModelRenderer(this, 0, 0);
        glassbackL.func_228304_a_(1F, -8F, 4F, 3, 7, 1, false);
        glassbackL.setRotationPoint(0F, 0F, 0F);
        glassbackL.setTextureSize(128, 64);
        glassbackL.mirror = true;
        setRotation(glassbackL, 0F, 0F, 0F);
        pipecornerFL = new ModelRenderer(this, 109, 50);
        pipecornerFL.func_228304_a_(3.5F, -1F, -4.5F, 1, 1, 1, false);
        pipecornerFL.setRotationPoint(0F, 0F, 0F);
        pipecornerFL.setTextureSize(128, 64);
        pipecornerFL.mirror = true;
        setRotation(pipecornerFL, 0F, 0F, 0F);
        pipecornerFR = new ModelRenderer(this, 109, 50);
        pipecornerFR.func_228304_a_(-4.5F, -1F, -4.5F, 1, 1, 1, false);
        pipecornerFR.setRotationPoint(0F, 0F, 0F);
        pipecornerFR.setTextureSize(128, 64);
        pipecornerFR.mirror = true;
        setRotation(pipecornerFR, 0F, 0F, 0F);
        pipecornerBR = new ModelRenderer(this, 109, 50);
        pipecornerBR.func_228304_a_(-4.5F, -1F, 3.5F, 1, 1, 1, false);
        pipecornerBR.setRotationPoint(0F, 0F, 0F);
        pipecornerBR.setTextureSize(128, 64);
        pipecornerBR.mirror = true;
        setRotation(pipecornerBR, 0F, 0F, 0F);
        pipecornerBL = new ModelRenderer(this, 109, 50);
        pipecornerBL.func_228304_a_(3.5F, -1F, 4.5F, 1, 1, 1, false);
        pipecornerBL.setRotationPoint(0F, 0F, -1F);
        pipecornerBL.setTextureSize(128, 64);
        pipecornerBL.mirror = true;
        setRotation(pipecornerBL, 0F, 0F, 0F);
        lightL = new ModelRenderer(this, 89, 37);
        lightL.func_228304_a_(5.5F, -6F, -2F, 2, 2, 1, false);
        lightL.setRotationPoint(0F, 0F, 0F);
        lightL.setTextureSize(128, 64);
        lightL.mirror = true;
        setRotation(lightL, 0F, 0F, 0F);
        lightR = new ModelRenderer(this, 89, 37);
        lightR.func_228304_a_(-7.5F, -6F, -2F, 2, 2, 1, false);
        lightR.setRotationPoint(0F, 0F, 0F);
        lightR.setTextureSize(128, 64);
        lightR.mirror = true;
        setRotation(lightR, 0F, 0F, 0F);
    }

    public void render(@Nonnull MatrixStack matrix, @Nonnull IRenderTypeBuffer renderer, int light, int overlayLight, boolean hasEffect) {
        func_225598_a_(matrix, getVertexBuilder(renderer, RENDER_TYPE, hasEffect), light, overlayLight, 1, 1, 1, 1);
        renderGlass(matrix, getVertexBuilder(renderer, GLASS_RENDER_TYPE, hasEffect), MekanismRenderer.FULL_LIGHT, overlayLight, 1, 1, 1, 0.3F);
    }

    private IVertexBuilder getVertexBuilder(@Nonnull IRenderTypeBuffer renderer, RenderType renderType, boolean hasEffect) {
        return ItemRenderer.func_229113_a_(renderer, renderType, false, hasEffect);
    }

    @Override
    public void func_225598_a_(@Nonnull MatrixStack matrix, @Nonnull IVertexBuilder vertexBuilder, int light, int overlayLight, float red, float green, float blue, float alpha) {
        helmetfeed.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        tubeback.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        tubeL.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        tubeR.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        tubefront.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        mouthintake.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        finupperR.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        finupperL.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        finmidR.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        finmidL.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        finback.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        topplate.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        filterL.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        filterR.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        filterpipelower.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        filterpipeupper.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);

        pipecornerFL.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        pipecornerFR.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        pipecornerBR.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        pipecornerBL.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);

        //These should be full bright
        lightL.func_228309_a_(matrix, vertexBuilder, MekanismRenderer.FULL_LIGHT, overlayLight, red, green, blue, alpha);
        lightR.func_228309_a_(matrix, vertexBuilder, MekanismRenderer.FULL_LIGHT, overlayLight, red, green, blue, alpha);
    }

    public void renderGlass(@Nonnull MatrixStack matrix, @Nonnull IVertexBuilder vertexBuilder, int light, int overlayLight, float red, float green, float blue, float alpha) {
        glasstop.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        glassfront.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        glassR.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        glassL.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        glassbackR.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        glassbackL.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}