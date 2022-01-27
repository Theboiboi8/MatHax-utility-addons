package dummy.addon.template.modules;

import mathax.client.systems.modules.Categories;
import mathax.client.systems.modules.Module;

public class AnotherExample extends Module {
    public AnotherExample() {
        super(Categories.Player, "example-2", "An example module in an existing category.");
    }
}
