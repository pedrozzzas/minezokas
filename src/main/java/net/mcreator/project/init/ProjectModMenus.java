
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.project.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.project.world.inventory.MapaMenu;
import net.mcreator.project.ProjectMod;

public class ProjectModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, ProjectMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<MapaMenu>> MAPA = REGISTRY.register("mapa", () -> IMenuTypeExtension.create(MapaMenu::new));
}
