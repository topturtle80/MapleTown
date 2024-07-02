package net.narurock.mapletown.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.narurock.mapletown.MapleTown;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, MapleTown.MOD_ID);

    public static final RegistryObject<Item> mapplite_ingot = Items.register("mapplite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> mapplite_nugget = Items.register("mapplite_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> raw_mapplite = Items.register("raw_mapplite",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventbus) {
        Items.register(eventbus);
    }
}
