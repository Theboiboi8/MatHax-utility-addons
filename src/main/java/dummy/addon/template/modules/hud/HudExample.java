package dummy.addon.template.modules.hud;

import mathax.client.systems.modules.render.hud.HUD;
import mathax.client.systems.modules.render.hud.modules.DoubleTextHudElement;

public class HudExample extends DoubleTextHudElement {
    public HudExample(HUD hud) {
        super(hud, "hud-example", "Description", "Static left text: ", false);
    }

    @Override
    protected String getRight() {
        return "Dynamic right text";
    }
}
