package core;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import util.SECRETS;

import javax.security.auth.login.LoginException;

public class Main
{
    public static void main(String[] args)
    {
        JDABuilder builder = new JDABuilder(AccountType.BOT);

        builder.setToken(SECRETS.TOKEN);
        builder.setAutoReconnect(true);

        builder.setStatus(OnlineStatus.DO_NOT_DISTURB);

        try
        {
            JDA jda = builder.buildBlocking();
        } catch (LoginException e)
        {
            e.printStackTrace();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
