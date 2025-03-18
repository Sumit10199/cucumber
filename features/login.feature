Feature: Login

Scenario: Login with valid Cred
    Given Launch chrome browser
    When opens Url "https://irakhay.codequestor.com/account"
    And Email as "russisumit@yopmail.com" and password as "Tester@123"
    And Click on login