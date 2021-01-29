# Lab 3.6
Labs are mandatory and must be completed before the start of the next class.

You make work collaboratively with your classmates, but you may not copy and paste another students code.

## INSTRUCTIONS
Create a new github repository named Enterprise-Java-Development-3.6

Add your instructor and the class graders to your repository and ensure that your repository is private. Public repositories will receive a zero on the assigment.

If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.

Upload the code for all of the following prompts to your repository.

## SPECIFICATIONS
Using Spring JPA model the relationships of the below application:

1. Assume that you are working with a Task Management software. Below are the requirements in regards to data storage:

    - Tasks have a title, dueDate, and a boolean status
    - There are 2 kinds of tasks BillableTask and InternalTask. BillableTask have an hourlyRate
    - Using Spring JPA model the relationships of the below application:

2. Assume that you are working with a PR company to model their data. Below are the requirements in regards to data storage:

    - The database consists of Contacts. Each Contact has a Name, title, and company.
    - Names are their own object and have a firstName, lastName, middleName, and salutation.
    - Names should not be stored in a separate table in the database.

3. List 3 tasks that can be accomplished with native SQL that you cannot do with JPQL

- **Perform set operations: UNION, INTERSECT, and EXCEPT allow you to perform standard set operations on the result sets of independent queries.** 

- **Use subqueries outside of WHERE and HAVING clauses. With JPQL, you can use subqueries only in the WHERE and HAVING clauses but not in the SELECT and FROM clause.**

- **Use database specific hints: most databases support proprietary query hints that allow you to provide additional information about your query. For some queries, the right set of hints can have a huge performance impact.**
