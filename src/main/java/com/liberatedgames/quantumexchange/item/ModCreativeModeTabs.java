package com.liberatedgames.quantumexchange.item;

import com.liberatedgames.quantumexchange.QuantumExchange;
import com.liberatedgames.quantumexchange.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, QuantumExchange.MODID);

    public static final Supplier<CreativeModeTab> QUANTUMEXCHANGE_ITEMS_TAB = CREATIVE_MODE_TAB.register("quantumexchange_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.UNREFINED_STRANGE_MATTER.get()))
                    .title(Component.translatable("creativetab.quantumexchange.quantumexchange_items"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.UNREFINED_STRANGE_MATTER);
                        output.accept(ModItems.UNREFINED_NUCLEAR_MATTER);
                        output.accept(ModItems.UNREFINED_QUARK_MATTER);
                        output.accept(ModItems.REFINED_STRANGE_MATTER);
                        output.accept(ModItems.REFINED_NUCLEAR_MATTER);
                        output.accept(ModItems.REFINED_QUARK_MATTER);
                        output.accept(ModItems.STRANGE_MATTER_CIRCUIT);
                        output.accept(ModItems.NUCLEAR_MATTER_CIRCUIT);
                        output.accept(ModItems.QUARK_MATTER_CIRCUIT);
                    })).build());

    public static final Supplier<CreativeModeTab> QUANTUMEXCHANGE_BLOCKS_TAB = CREATIVE_MODE_TAB.register("quantumexchange_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BASIC_QUANTUM_EXCHANGER.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(QuantumExchange.MODID, "quantumexchange_items_tab"))
                    .title(Component.translatable("creativetab.quantumexchange.quantumexchange_blocks"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        // Matter Blocks
                        output.accept(ModBlocks.STRANGE_MATTER_BLOCK);
                        output.accept(ModBlocks.NUCLEAR_MATTER_BLOCK);
                        output.accept(ModBlocks.QUARK_MATTER_BLOCK);

                        // Quantum Exchangers
                        output.accept(ModBlocks.BASIC_QUANTUM_EXCHANGER);
                        output.accept(ModBlocks.STRANGE_QUANTUM_EXCHANGER);
                        output.accept(ModBlocks.NUCLEAR_QUANTUM_EXCHANGER);
                        output.accept(ModBlocks.QUARK_QUANTUM_EXCHANGER);

                        // Condensers

                        // Strange Matter Condenser
                        // Nuclear Matter Condenser
                        // Quark Matter Condenser
                    })).build());

}
