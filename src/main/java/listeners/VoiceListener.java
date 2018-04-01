package listeners;

import net.dv8tion.jda.core.events.guild.voice.GuildVoiceJoinEvent;
import net.dv8tion.jda.core.events.guild.voice.GuildVoiceLeaveEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import util.Time;

public class VoiceListener extends ListenerAdapter
{
    public void onGuildVoiceJoin(GuildVoiceJoinEvent event)
    {
        event.getGuild().getTextChannelById("430080889477660682").sendMessage(
                Time.getTime() + "Member " + event.getVoiceState().getMember().getUser().getName() +
                        " joined voice channel " + event.getChannelJoined().getName() + "!"
        ).queue();

    }
    public void onGuildVoiceLeave(GuildVoiceLeaveEvent event)
    {
        event.getGuild().getTextChannelById("430080889477660682").sendMessage(
                Time.getTime() + "Member " + event.getVoiceState().getMember().getUser().getName() +
                        " left voice channel " + event.getChannelLeft().getName() + "!"
        ).queue();
    }
}
