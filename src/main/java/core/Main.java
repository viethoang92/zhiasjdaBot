package core;

import listeners.ReadyListener;
import listeners.VoiceListener;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
//import util.SECRETS;

import javax.security.auth.login.LoginException;

public class Main
{
    public static JDABuilder builder;
    public static void main(String[] args)
    {
        builder = new JDABuilder(AccountType.BOT);


        builder.setToken(System.getenv("TOKEN"));
        //builder.setToken(SECRETS.TOKEN);
        builder.setAutoReconnect(true);

        addListeners();


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

    // LISTENERS
    public static void addListeners()
    {
        builder.setStatus(OnlineStatus.ONLINE);
        builder.addEventListener(new ReadyListener());
        builder.addEventListener(new VoiceListener());
    }
}
