/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamegrid;

/**
 *
 * @author raphaelr
 */
public interface IGameCharacter {
    String move();
    void attack(GameCharacter gc);
}
