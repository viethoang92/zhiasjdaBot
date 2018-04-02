package commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import util.STATIC;

public class cmdPing implements Command
{
    @Override
    public boolean called(String[] args, MessageReceivedEvent event)
    {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event)
    {
        event.getTextChannel().sendMessage("Pong").queue();
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event)
    {
        System.out.println(String.format("[INFO] Command '%sping' was executed.", STATIC.PREFIX));
    }

    @Override
    public String help()
    {
        return null;
    }
}
