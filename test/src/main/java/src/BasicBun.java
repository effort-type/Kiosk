/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Minsu <jminsu084@gmail.com>
 */
public class BasicBun implements Bun{
    @Override
    public String getBun() {
        return "빵 : 클래식 번 사용";
    }
    public BasicBun() {
        //System.out.println("Basic Bun");
    }
}
