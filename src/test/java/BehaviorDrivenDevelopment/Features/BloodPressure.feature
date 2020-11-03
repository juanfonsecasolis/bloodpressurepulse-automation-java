Feature: Visualize my blood pressure levels

  Scenario: User wants to filter by keyword in the detailed data table

    Given User logs into his profile page

    When He filters by an ESC-ESH category

    Then He sees only measurements with the specified category
