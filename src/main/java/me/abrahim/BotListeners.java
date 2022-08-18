package me.abrahim;

import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.channel.ChannelDeleteEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class BotListeners extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (!event.getAuthor().isBot()){
            String messageSent = event.getMessage().getContentRaw();
            event.getTextChannel().sendMessage("This was sent " + messageSent).queue();
            super.onMessageReceived(event);
        }

    }

    @Override
    public void onChannelDelete(@NotNull ChannelDeleteEvent event) {

        String channelName = event.getChannel().getName();
        TextChannel general = event.getGuild().getTextChannelById(997304650837544962L);

        if (general != null) {
            general.sendMessage("The channel : \"" + channelName + "\" was deleted").queue();


        }
    }
}
