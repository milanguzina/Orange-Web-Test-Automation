
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


 /**
	 * Refresh browser
	 */ 
def static "orange.keywords.refreshBrowser"() {
    (new orange.keywords()).refreshBrowser()
}

 /**
	 * Click element
	 * @param to Katalon test object
	 */ 
def static "orange.keywords.clickElement"(
    	TestObject to	) {
    (new orange.keywords()).clickElement(
        	to)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */ 
def static "orange.keywords.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new orange.keywords()).getHtmlTableRows(
        	table
         , 	outerTagName)
}


def static "orange.keywords.userLogin"(
    	TestObject to	
     , 	String username	
     , 	TestObject to1	
     , 	String password	
     , 	TestObject to2	) {
    (new orange.keywords()).userLogin(
        	to
         , 	username
         , 	to1
         , 	password
         , 	to2)
}

 /**
	 * Clicks on the random dropdown list option
	 * @param to Katalon TestObject 
	 */ 
def static "orange.keywords.randomClick"(
    	TestObject to	) {
    (new orange.keywords()).randomClick(
        	to)
}
