package me.nieuwdorp;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.managers.AudioManager;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws LoginException, InterruptedException {
        JDA jda = JDABuilder
                .createDefault("")
                .addEventListeners(new Listener())
                .build()
                .awaitReady();
    }
}
