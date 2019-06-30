Feature: DemoWebShop login functionality
  I want to use this template for my feature file

  Scenario Outline: Test login functionality on demowebshop app.
    Given Alex on home page
    When Alex entered "<username>" and "<password>"
    When Alex clicks on login button.
    Then Alex should be logged in

    Examples: 
      | username           | password  |
      | pratiksha@test.com | pratiksha |
      | rick@test.com      | tester    |
