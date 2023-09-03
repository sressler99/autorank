package catsarethebest.autorank.command;

import com.mojang.authlib.GameProfile;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import org.apache.logging.log4j.LogManager;
import static net.minecraft.server.command.CommandManager.*;

public class Commands {
    
    // public static void register() {

    //     CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
    //         dispatcher.register(
    //             literal("rank")
    //                 .executes(context -> {
    //                     context.getSource().sendMessage(() -> Text.literal("Called /rank with no arguments"));
    //                     return 1;
    //                 }));

    //                 //check
    //                     //everyone

    //                 //set
    //                     //admin only
    //     });

    }

}
