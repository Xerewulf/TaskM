/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.project;


import ViewData;
import ViewInterface;
import java.util.*;
/**
 *
 * @author Admin
 */
public class EntryMenuView  implements ViewInterface {
    
    @Override
    public ViewData create(ModelData modelData, String functionName, String operationName) throws Exception{
    
    Integer choice;
		do {
			System.out.println("1. Show all departments");
			System.out.println("2. Show departments");
			System.out.println("3. Add a department");
			System.out.println("4. Update a department");
			System.out.println("5. Delete a department");
			System.out.println("6. Quit");
			System.out.println();

			choice = getInteger("Enter your choice : ", false);
		} 
		while (choice == null || choice < 1 || choice > 6);
    
        }
}