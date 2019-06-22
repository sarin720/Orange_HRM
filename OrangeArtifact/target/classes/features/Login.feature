Feature: Login

  Scenario: Login
    Given I navigate to url "https://opensource-demo.orangehrmlive.com"
    Then I enter "Admin" in the "Username" field
    Then I enter "admin123" in the "Password" field
    Then I click on "Login"
    Then I verify "OrangeHRM" page is launched correctly
    Then I click on "Heading_Admin"
    Then I click on "Heading_Organization"
    Then I verify if "General_Information" is displayed
    Then I click on "General_Information" 
    Then I click on "Edit_Button" 
    Then I enter "New Organization" in the "Organization_Name" field
    Then I enter "1234" in the "Organization_TaxId" field
    Then I enter "5678" in the "Organization_RegistraionNumber" field
    Then I enter "New Notes" in the "Organization_Note" field
    Then I enter "7890" in the "Organization_Fax" field
    Then I click on "Save_Button" 
    Then I click on "Heading_PIM" 
    Then I click on "PIM_EmployeeList" 
    Then I click on "Employee_Add_Button" 
    Then I enter "New FN" in the "PIM_FirstName" field
    Then I enter "New MN" in the "PIM_MiddleName" field
    Then I enter "New LN" in the "PIM_LastName" field
    Then I enter "1234" in the "PIM_EmployeeID" field
    Then I click on "PIM_Photo_Upload" 
    Then I upload file "File" 
    Then I click on "Heading_DashBoard" 
    Then I move to the element "Image_Dashboard" 
    