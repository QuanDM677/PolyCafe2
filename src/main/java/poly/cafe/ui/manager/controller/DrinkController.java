/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.cafe.ui.manager.Controller;

import poly.cafe.entity.Drink;

/**
 *
 * @author PC
 */
public interface DrinkController extends CrudController<Drink> {

    void fillCategories();

    void chooseFile();
}
