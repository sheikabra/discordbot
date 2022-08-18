package me.abrahim;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;

public class discordbot {
    public static void main(String[] args) throws LoginException {
        JDA bot = JDABuilder.createDefault("OTk3MzA2NjUyNDU1ODYyMzAz.GpdhB3.duksCLJAAdJ1S9oNe2kSxa_co2ZDl4L_BrviO8")
                .setActivity(Activity.playing("a game"))
                .addEventListeners(new BotListeners())
                .build();

    }


}
