package online.minipixel.smp.DiscordBot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Builder {

        public static JDA jda;

        public void create() throws LoginException {

                try {
                        jda = JDABuilder.createDefault("")
                                .setActivity(Activity.watching("minipixel.online"))
                                .build()
                                .awaitReady();
                } catch (InterruptedException | LoginException e) {
                        e.printStackTrace();
                }
        }

        public void kill() {

                jda.shutdownNow();
        }
}
