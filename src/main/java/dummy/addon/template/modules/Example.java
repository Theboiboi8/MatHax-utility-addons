package dummy.addon.template.modules;

import dummy.addon.template.TemplateAddon;
import mathax.client.systems.modules.Module;

public class Example extends Module {
    public Example() {
        super(TemplateAddon.CATEGORY, "example", "An example module in a custom category.");
    }
}
