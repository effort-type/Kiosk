/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.CommandPattern;

import src.FactoryPattern.BurgerStore;
import src.StrategyPattern.BeefBurger;
import src.StrategyPattern.Burger;

/**
 *
 * @author JaeHyuk
 * 클래스 역할 : Command패턴에서 ConcreteCommand 역할
 */
public class SetBeefBurgerCommand implements Command {
    
    private BurgerReceiver burgerReceiver;
    Burger burger;
    BurgerStore burgerStore;
    
    //해당 객체의 생성자로써 리시버를 설정하는 메서드
    public SetBeefBurgerCommand(BurgerReceiver burgerReceiver, BurgerStore BurgerStore) {
        this.burgerReceiver = burgerReceiver;
        this.burgerStore = BurgerStore;
    }
    
    //들어온 매장에 따라 다른 원재료를 사용하는 비프 버거 객체 생성하여 리시버로 전달
    public void execute() {
        burger = new BeefBurger(burgerStore.getFactory());
        burgerReceiver.addBurger(burger, burgerStore);
    }
}
