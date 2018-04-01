package commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public interface Command
{

    boolean called(String[] args, MessageReceivedEvent event);
    void action(String[] args, MessageReceivedEvent event);
    void executed(boolean sucess, MessageReceivedEvent event);
    String help();


}
