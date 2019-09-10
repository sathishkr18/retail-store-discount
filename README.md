# The Retail Store Discounts

This command-line project finds the net payable amount of the user by applying the discounts based on the below conditions from the given bill.

On a retail website, the following discounts apply:
1. If the user is an employee of the store, he gets a 30% discount
2. If the user is an affiliate of the store, he gets a 10% discount
3. If the user has been a customer for over 2 years, he gets a 5% discount.
4. For every $100 on the bill, there would be a $5 discount (e.g. for $990, you get $45
as a discount).
5. The percentage based discounts do not apply on groceries.
6. A user can get only one of the percentage based discounts on a bill.

## Build

To run the test cases,
>**mvn test**

To build the project and generate PMD report and Jacoco (Code Coverage) report,
>**mvn clean install pmd:pmd**

On running the test cases, it displays the bill receipt and net payable amount in the console.

>**Note:** User details and list of Line Items are the inputs to prepare the final bill. 
