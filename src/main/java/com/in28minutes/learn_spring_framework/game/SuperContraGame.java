package com.in28minutes.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole{
    public void up(){
        System.out.println("up");
    }

    public void down(){
        System.out.println("Sit down");
    }

    public void left(){
        System.out.println("Go backwards");
    }

    public void right(){
        System.out.println("Shoot a bullet");
    }
}
