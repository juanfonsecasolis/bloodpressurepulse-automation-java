Feature: Visualize my blood pressure levels

  Scenario: User wants to know the categorization used on the detailed data table

    Given User logs into his profile page

    When He chooses to see the details about the blood pressure categorization

    Then He sees the AHA and ESC references
