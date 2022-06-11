/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.StrategyPattern;

import java.util.ArrayList;
import src.DecoratorPattern.Menu;
import src.FactoryPattern.BurgerStoreIngredientFactory;
import src.StrategyPattern.SelectVegetable;
import src.StrategyPattern.SelectSauce;
import src.StrategyPattern.SelectPatty;
import src.StrategyPattern.CheeseWheather;

/**
 *
 * @author JaeHyuk
 */
public abstract class Burger extends Menu{
    
    // 팩토리 원재료군
    //protected Bun indBun;
    //protected Cheese indCheese;
    //protected Vegetable indVegetable;
    //protected Potato indPotato;
    //protected IndCola indCola;
    //protected IndBeefPatty indBeefPatty;
    
    // 스트레티지
    protected CheeseWheather cheeseWheather;
    protected SelectSauce selectSauce;
    protected SelectPatty selectPatty;
    protected SelectVegetable selectVegetable;
    protected boolean cheese;
    protected String sauce;
    protected String patty;
    protected String vegetable;
    
    private BurgerStoreIngredientFactory ingregientFactory;
    
    public Burger() {
        
    }
    
    public abstract int cost();
    
    //public abstract String getDescription();
    
    //public abstract String testDisplay();
    
    //public abstract ArrayList<String> getBeefBurgerInd();
    
    public void setCheeseWheather(CheeseWheather scw) {
        cheeseWheather = scw;
    }
    public void setPatty(SelectPatty sp) {
        selectPatty = sp;
    }
    public void setSauce(SelectSauce ss) {
        selectSauce = ss;
    }
    public void setVegetable(SelectVegetable sv) {
        selectVegetable = sv;
    }
    
    
}
