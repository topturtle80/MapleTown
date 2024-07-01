package net.narurock.mapletown.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.narurock.mapletown.MapleTown;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MapleTown.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAPLE_TAB = CREATIVE_MODE_TABS.register("maple_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.mapplite_ingot.get()))
                    .title(Component.translatable("creativetab.maple_tab"))
                    .displayItems((pParameter, pOutput) -> {
                        pOutput.accept(ModItems.raw_mapplite.get());
                        pOutput.accept(ModItems.mapplite_ingot.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
