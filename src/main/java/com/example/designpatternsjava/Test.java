package com.example.designpatternsjava;

import Facade.Facade;
import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strategy.*;

public class Test {
    public static void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Strategy

        Behavior defensive = new DefensiveBehavior();
        Behavior normal = new NormalBehavior();
        Behavior agressive = new AgressiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.move();
        robot.move();
        robot.setBehavior(defensive);
        robot.move();
        robot.setBehavior(agressive);
        robot.move();
        robot.move();
        robot.move();

        // Facade

        Facade facade = new Facade();
        facade.ClientMigrate("Bob", "14801788");
    }
}
