/*
 * Introduction :
 * Download selinium and add add it to lib
 * First will try to do with firefox then will do with chrome
 * Same as 1st will do with copy xpath from chrome then will learn xpath at last
 * 
 * 									Search context
 * 											|
 * --------------------------------------------------------------
 * |					|					|					|
 * |-> Webdriver (I)  	|-> Java script		|-> Take 			|-> ....13 Interface
  			|				executor (I)		screenshot (I)				|
  			|					|					|						|
  			|					|					|						|
  			-----------------------------------------------------------------
  											|
  											|
  									______________________		
  	-------------------------------|Remote Web Driver (c)|-------------------------										
  								   -----------------------
  								   			|
  								   			|
  	---------------------------------------------------------------------------------------------
  	|						|						|					|						|
  	|->Firefox Driver (c)	|-> Chrome Driver (c)	|-> IE Driver (c)	|-> HTML Unit Driver	|-> ...Etc,.		
  	
  		   			
  		   			
  * Webdriver Architecture
  		   
  		 Java			Json			FF Driver
  		 Python    =>   wire		=>	Chrome Driver
  		 Ruby			protocol		IE Driver
  		 C++
  		 
  	Webdriver is an interface which stimulates the user actions
  	Locator is used to interact with webdriver to work on webpage 
  	i.e <HTML>
  			-----
  			-----
  			-----
  		<HTML>
  		
  	Types of locators :
  			1. Name 2. ID 3. Xpath (Relative path, Absolute path) 4. CSS selector 5. Linktext
  			6. Partial linktext 7. Tag name 8. Class name
  			
  			Note : We can use DOM (Document Object Module) when these 8 locators are not working
 */

package a_Introduction;

public class A_Introduction {
	public static void main (String[] args) {
		System.out.println("Introduction");
	}
}
