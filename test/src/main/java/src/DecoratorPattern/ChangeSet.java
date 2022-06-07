/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.DecoratorPattern;

import src.DecoratorPattern.BurgerToppingdecorator;
import src.StrategyPattern.CheeseBurger;
import src.StrategyPattern.Burger;
import db.MenuDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JaeHyuk
 */
public class ChangeSet extends BurgerToppingdecorator {
    MenuDAO menuDAO = new MenuDAO();
    int cost = 0;
    Burger burger;
    public ChangeSet(Burger burger) { this.burger = burger;}
    public String getDescription() {
        return burger.getDescription() + "+세트";
    }
    public int cost() { 
        try {
            cost = menuDAO.menuCost("세트");
        } catch (SQLException ex) {
            Logger.getLogger(CheeseBurger.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cost + burger.cost();
    }
}