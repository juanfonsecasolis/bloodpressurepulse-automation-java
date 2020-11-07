Feature: Visualize my blood pressure levels

  Scenario Outline: User wants to filter by keyword in the detailed data table

    Given User logs into his profile page as <userId>

    When He filters by an <escEshCategory> category

    Then He sees only results with the specified <escEshCategory> category

    Examples:
      | userId | escEshCategory |
      | xxyn4pz8yhb0i7n | optimal |
      | xxyn4pz8yhb0i7n | high normal |

