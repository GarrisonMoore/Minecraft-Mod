package com.example.examplemod.client.model;
// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.monster.Zombie;


public class friend_Converted<T extends Zombie> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("examplemod", "friend_converted"), "main");
    private final ModelPart bone;

    public friend_Converted(ModelPart root) {
        this.bone = root.getChild("bone");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(8, 18).addBox(-8.0F, -1.0F, 7.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(18, 8).addBox(-8.0F, -5.0F, 8.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(18, 14).addBox(-8.0F, -11.0F, 8.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(18, 20).addBox(-10.0F, -5.0F, 8.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(8, 22).addBox(-10.0F, -1.0F, 7.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 26).addBox(-10.0F, -11.0F, 8.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 18).addBox(-6.0F, -12.0F, 8.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(18, 0).addBox(-12.0F, -12.0F, 8.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(20, 26).addBox(-8.0F, -13.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(26, 20).addBox(-9.0F, -13.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-8.0F, -15.0F, 3.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(0, 9).addBox(-10.0F, -15.0F, 3.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(26, 11).addBox(-7.0F, -17.0F, 8.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(26, 14).addBox(-10.0F, -17.0F, 8.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(26, 22).addBox(-7.0F, -18.0F, 7.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(24, 26).addBox(-11.0F, -18.0F, 7.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(26, 24).addBox(-8.0F, -17.0F, 7.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(26, 25).addBox(-9.0F, -17.0F, 7.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(16, 26).addBox(-5.0F, -17.0F, 7.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(26, 17).addBox(-11.0F, -17.0F, 7.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(26, 0).addBox(-8.0F, -7.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(26, 4).addBox(-10.0F, -7.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(8, 26).addBox(-8.0F, -12.0F, 8.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(26, 8).addBox(-10.0F, -12.0F, 8.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 24.0F, -8.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        // Apply the head yaw (left/right look) to the main bone
        // We convert degrees to radians by multiplying by (PI / 180), which is roughly 0.017453292F
        this.bone.yRot = netHeadYaw * ((float) Math.PI / 180F);

        // Apply the head pitch (up/down look)
        this.bone.xRot = headPitch * ((float) Math.PI / 180F);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int packedColor) {
        // In 1.21+, ModelPart#render uses packed color (ARGB) int.

        // Flip the model on the Y axis to fix "Upside Down" issue
        poseStack.scale(1.0F, -1.0F, 1.0F);

        // Move it down so it stands on the ground (1.5F = 24 pixels, which is where your model feet are)
        poseStack.translate(0.0F, -1.5F, 0.0F);
        bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, packedColor);
    }
}