# Orange_HRM

Feature file : 
OrangeArtifact\src\main\java\features\Login.java

Associated Step definition file : 
OrangeArtifact\src\main\java\StepDefinition\Login_Step_Definition.java

Locator_List.xlsx : 
Column Names : 1) Sl No   ---->   Numbering the elements
               2) Name	  ---->   Same as that of the fields in the BDD steps (from feature file)
               3) Value	  ---->   Locator values from the DOM
               4) LocatorType	->  Locator type ( ID, Name, ClassName, XPath etc)
               5) Comments ---->  Documentation purposes only

Error Screenshots :
OrangeArtifact\src\main\java\utilityClasses\Error_Screenshot.java
Modify the filename path in Error_Screenshot.ScreenSave(String ) method
In case of an error the associated screenshot is saved in the specified folder as .BMP file
Name of this .BMP file includes Feature+Scenario specified 
