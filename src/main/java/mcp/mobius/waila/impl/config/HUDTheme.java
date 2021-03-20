package mcp.mobius.waila.impl.config;

import net.minecraft.util.ResourceLocation;
import snownee.jade.Jade;

public class HUDTheme {

    public static final HUDTheme WAILA = new HUDTheme(new ResourceLocation(Jade.MODID, "waila"), 0x100010, 0x5000ff, 0x28007f, 0xA0A0A0);
    public static final HUDTheme DARK = new HUDTheme(new ResourceLocation(Jade.MODID, "dark"), 0x131313, 0x383838, 0x242424, 0xA0A0A0);
    public static final HUDTheme CREATE = new HUDTheme(new ResourceLocation(Jade.MODID, "create"), 0xdd000000, 0x40aa9999, 0x20aa9999, 0xA0A0A0);
    public static final HUDTheme TOP = new HUDTheme(new ResourceLocation(Jade.MODID, "top"), 0x55006699, 0xff999999, 0xff999999, 0xA0A0A0);

    private final ResourceLocation id;
    private final int backgroundColor;
    private final int gradientStart;
    private final int gradientEnd;
    private final int fontColor;

    public HUDTheme(ResourceLocation id, int backgroundColor, int gradientStart, int gradientEnd, int fontColor) {
        this.id = id;
        this.backgroundColor = backgroundColor;
        this.gradientStart = gradientStart;
        this.gradientEnd = gradientEnd;
        this.fontColor = fontColor;
    }

    public ResourceLocation getId() {
        return id;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public int getGradientStart() {
        return gradientStart;
    }

    public int getGradientEnd() {
        return gradientEnd;
    }

    public int getFontColor() {
        return fontColor;
    }
}
