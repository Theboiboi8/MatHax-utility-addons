package dummy.addon.template;

import dummy.addon.template.commands.ExampleCommand;
import dummy.addon.template.modules.AnotherExample;
import dummy.addon.template.modules.Example;
import dummy.addon.template.modules.hud.HudExample;
import mathax.client.Client;
import mathax.client.addons.MatHaxAddon;
import mathax.client.systems.commands.Commands;
import mathax.client.systems.modules.Category;
import mathax.client.systems.modules.Modules;
import mathax.client.systems.modules.render.hud.HUD;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.invoke.MethodHandles;

public class TemplateAddon extends MeteorAddon {
	public static final Logger LOG = LogManager.getLogger();
	public static final Category CATEGORY = new Category("Example");

	@Override
	public void onInitialize() {
		LOG.info("Initializing MatHax Addon Template");

		// Required when using @EventHandler
		MeteorClient.EVENT_BUS.registerLambdaFactory("mathax.addons.template", (lookupInMethod, klass) -> (MethodHandles.Lookup) lookupInMethod.invoke(null, klass, MethodHandles.lookup()));

		// Modules
		Modules.get().add(new Example());
		Modules.get().add(new AnotherExample());

		// Commands
		Commands.get().add(new ExampleCommand());

		// HUD
		HUD hud = Modules.get().get(HUD.class);
		hud.elements.add(new HudExample(hud));
	}

	@Override
	public void onRegisterCategories() {
		Modules.registerCategory(CATEGORY);
	}
}
