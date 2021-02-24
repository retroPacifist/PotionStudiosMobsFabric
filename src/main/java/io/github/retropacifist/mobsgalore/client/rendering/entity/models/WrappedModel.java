package io.github.retropacifist.mobsgalore.client.rendering.entity.models;

import net.minecraft.client.model.Model;
import net.minecraft.client.model.ModelPart;

public interface WrappedModel {

    default ModelPart createPart(Model model, int u, int v, float x, float y, float z) {
        ModelPart part = new ModelPart(model, u, v);
        part.setPivot(x, y, z);

        return part;
    }

    default void rotate(ModelPart part, float x, float y, float z) {
        part.pitch = x;
        part.yaw = y;
        part.roll = z;
    }
}
