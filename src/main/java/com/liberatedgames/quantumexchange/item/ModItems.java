package com.liberatedgames.quantumexchange.item;

import com.liberatedgames.quantumexchange.QuantumExchange;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(QuantumExchange.MODID);

    // Circuits
    public static final DeferredItem<Item> STRANGE_MATTER_CIRCUIT = ITEMS.register("strange_matter_circuit",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NUCLEAR_MATTER_CIRCUIT = ITEMS.register("nuclear_matter_circuit",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> QUARK_MATTER_CIRCUIT = ITEMS.register("quark_matter_circuit",
            () -> new Item(new Item.Properties()));

    // Unrefined matter
    public static final DeferredItem<Item> UNREFINED_STRANGE_MATTER = ITEMS.register("unrefined_strange_matter",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> UNREFINED_NUCLEAR_MATTER = ITEMS.register("unrefined_nuclear_matter",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> UNREFINED_QUARK_MATTER = ITEMS.register("unrefined_quark_matter",
            () -> new Item(new Item.Properties()));

    // Refined matter
    public static final DeferredItem<Item> REFINED_STRANGE_MATTER = ITEMS.register("refined_strange_matter",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> REFINED_NUCLEAR_MATTER = ITEMS.register("refined_nuclear_matter",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> REFINED_QUARK_MATTER = ITEMS.register("refined_quark_matter",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
