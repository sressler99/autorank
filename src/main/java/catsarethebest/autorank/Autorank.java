package catsarethebest.autorank;

import net.fabricmc.api.ModInitializer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.PlayerManager;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.server.command.ExecuteCommand;
import net.minecraft.server.command.ServerCommandSource;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.ParseResults;

import net.minecraft.server.function.CommandFunction;
import net.minecraft.server.function.CommandFunctionManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Autorank implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("autorank");
	public static final String MOD_ID = "autorank";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
	
		MinecraftServer server = MinecraftClient.getInstance().getServer();
		ServerCommandSource source = server.getCommandSource();
		CommandManager commandManager = server.getCommandManager();
		
		CommandFunctionManager cfm = server.getCommandFunctionManager();
		

		//CommandManager commandManager = player.getServer().getCommandManager();


		for (var player : server.getPlayerManager().getPlayerList()){
			// ParseResults<ServerCommandSource> parseResults = 
			// String rank = commandManager.execute(source, "lp user" + player + "parent info");
			
		}
		
		//server.ExecuteCommand("lp user " + player.getName() + " parent add " + "beginner");




		//MinecraftServer server = MinecraftServer.getServer();



		LOGGER.info("Hello Fabric world!");
	}
}