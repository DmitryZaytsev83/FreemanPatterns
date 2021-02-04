package ru.dmitryzaytsev.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new ru.dmitryzaytsev.strategy.FlyRocketPowered());
        modelDuck.performFly();
    }
}
