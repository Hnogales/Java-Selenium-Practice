package XPath;

public class Xpath {
	
	// guru99.com/xpath-selenium.html
	
	/*
	 * What is XPath? - It is an XML used for navigation in the HTML structure page. 
	 * 					It is a syntax for finding ANY elements on web page. 
	 * 					Can be used for both HTML and XML documents.
	 * 
	 * Structure: Xpath=//tagname[@Attribute='Value']
	 * 
	 * Types of locators: 	ID
	 * 						Classname
	 * 				 		Name
	 * 						Link text 
	 * 						Xpath
	 * 						CSS path
	 * 
	 * Types of XPath: 		Absolute 
	 * 						Relative
	 * 
	 * Absolute - Direct way to find an element, BUT if there are any changes made in the path the XPaths fails. 
	 * 
	 * Example: /html/body/div[2]/div[1]/div/h4[1]/b/html[1]/body[1]/div[2]/div[1]/div[1]/h4[1]/b[1]
	 * 
	 * Relative - 	Starts from the middle of the DOM structure. 
	 * 				Starts with double forward slash(//)
	 * 				Can search elements anywhere on the webpage
	 * 				ALWAYS PREFFERED because it is not a complete path from root element. 
	 * 
	 * Example: //div[@class='featured-box cloumnsize1']//h4[1]//b[1]
	 * 
	 * 
	 * Basic examples of XPaths: 
	 * 					
	 * 						Xpath= //input[@name='uid']
	 * 						Xpath= //input[@type='text']				
	 * 						Xpath= //label[@id='message23']
	 * 						Xpath= //input[@value='RESET']
	 * 						Xpath= //*[@class='barone']
	 * 						Xpath= //a[@href='http://demo.guru99.com/']
	 * 						Xpath= //img[@src='//cdn.guru99.com/images/home/java.png']
	 * 
	 * 
	 * Contains() - Contains() is a method used in XPath expression. 
	 * 				It is used when the value of any attribute changes dynamically, for example, login information.
	 * 
	 * Examples: 	Xpath=	//*[contains(@type,'sub')] - Complete value of ‘Type’ is ‘submit’ but using only partial value ‘sub’.
	 * 				
	 * 				Xpath=	//*[contains(@name,'btn')] - Complete value of ‘name’ is ‘btnLogin’ but using only partial value ‘btn’.
	 * 
	 * 				Xpath=	//*[contains(@id,'message')]
	 * 
	 * 				Xpath=	//*[contains(text(),'here')]
	 * 
	 * 				Xpath=//*[contains(@href,'guru99.com')]	
	 * 
	 * Using OR & AND - 
	 * 			
	 * 	
	 * Examples: 	Xpath=	//*[@type='submit' or @name='btnReset']
	 * 
	 * 				Xpath=	//input[@type='submit' and @name='btnLogin']
	 * 
	 * 
	 * Using Starts-with -
	 * 
	 * 
	 * Examples: 	Xpath=	//label[starts-with(@id,'message')]
	 * 
	 * 
	 * Text() Function - used to locate elements based on text of a web element.
	 * 
	 * Examples: 	Xpath=	//td[text()='UserID']				
	 * 
	 * 
	 * XPath axes methods - used to find the complex or dynamic elements.
	 * 
	 * 
	 * Examples:	Xpath=	//*[@type='text']//following::input
	 * 
	 * 				Xpath=	//*[@type='text']//following::input[1]
	 * 
	 * 
	 * Ancestor - The ancestor axis selects all ancestors element (grandparent, parent, etc.) of the current node as shown in the below screen.
	 * 
	 * 
	 * Examples: 	Xpath=	//*[text()='Enterprise Testing']//ancestor::div
	 * 
	 * 				Xpath=	//*[@id='java_technologies']//child::li[1]
	 * 
	 * 
	 * Preceding - Select all nodes that come before the current node as shown in the below screen.
	 * 
	 * 
	 * Examples:  	Xpath=	//*[@type='submit']//preceding::input
	 * 
	 * 				Xpath=	//*[@type='submit']//preceding::input[1]
	 * 
	 * 
	 * Following-sibling - 	Select the following siblings of the context node. Siblings are at the same level of the current node as shown in the below screen. 
	 * 						It will find the element after the current node.
	 * 
	 * 
	 * Examples: 	Xpath=	//*[@type='submit']//following-sibling::input
	 * 
	 * 
	 * Parent - Selects the parent of the current node as shown in the below screen.
	 * 
	 * 
	 * Examples: 	Xpath=	//*[@id='rt-feature']//parent::div
	 * 
	 * 				Xpath=	//*[@id='rt-feature']//parent::div[1]
	 * 
	 * Self - Selects the current node or ‘self’ means it indicates the node itself as shown in the below screen.
	 * 
	 * Examples: 	Xpath =//*[@type='password']//self::input
	 * 
	 * 
	 * Decendant - Selects the descendants of the current node as shown in the below screen.
	 * 
	 * Examples: 	Xpath=//*[@id='rt-feature']//descendant::a
	 * 
	 * 
	 */

}
