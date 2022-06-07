/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.FactoryPattern;

import src.FactoryPattern.IndBeefPatty;

/**
 *
 * @author Minsu <jminsu084@gmail.com>
 */
public class MediumRare implements IndBeefPatty{
    String indname;
    
    public MediumRare() {
        indname = "소고기 패티 굽기 : 미디움 레어";
    }
    
    @Override
    public String getIndBeefPatty() {
        return indname;
    }
}
