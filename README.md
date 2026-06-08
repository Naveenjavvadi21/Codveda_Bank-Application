# Codveda_Bank-Application
Simple Banking Application is a Java console-based system that allows users to deposit money, withdraw funds, and check account balances. Built using Object-Oriented Programming principles, it includes transaction validation and error handling for insufficient funds, providing a practical introduction to banking operations in Java.

# Simple Banking Application

## Description

Simple Banking Application is a Java console-based project that simulates basic banking operations. Users can deposit money, withdraw funds, and check their account balance. The application uses Object-Oriented Programming principles and includes error handling for scenarios such as insufficient funds and invalid transaction amounts.

## Features

* Deposit money into an account
* Withdraw money from an account
* Check current account balance
* Handle insufficient balance errors
* Validate transaction amounts
* Menu-driven console interface
* Object-Oriented Programming implementation

## Technologies Used

* Java
* OOP (Object-Oriented Programming)
* Scanner Class for User Input

## Project Structure

### BankAccount.java

Contains:

* Account balance field
* Deposit method
* Withdraw method
* Check balance method

### BankingApplication.java

Contains:

* Main menu
* User interaction
* Transaction handling

## Objectives

* Understand OOP concepts in Java
* Implement real-world banking operations
* Practice method creation and class design
* Handle exceptions and invalid inputs
* Build interactive console applications

## How to Run

### Compile

```bash
javac BankingApplication.java
```

### Execute

```bash
java BankingApplication
```

## Menu Options

```text
1. Deposit Money
2. Withdraw Money
3. Check Balance
4. Exit
```

## Sample Input and Output

### Deposit Money

Input:

```text
1
5000
```

Output:

```text
Amount Deposited Successfully!
Current Balance: 5000.0
```

### Withdraw Money

Input:

```text
2
2000
```

Output:

```text
Withdrawal Successful!
Current Balance: 3000.0
```

### Insufficient Funds

Input:

```text
2
5000
```

Output:

```text
Error: Insufficient Funds!
Available Balance: 3000.0
```

### Check Balance

Input:

```text
3
```

Output:

```text
Current Balance: 3000.0
```

## Future Enhancements

* Multiple bank accounts
* Account number generation
* Transaction history
* Interest calculation
* Database integration
* GUI using Java Swing or JavaFX
* Online banking features

## Learning Outcomes

* Classes and Objects
* Encapsulation
* Method Implementation
* User Input Handling
* Conditional Statements
* Error Handling
* Menu-Driven Programming

## Author

Naveen Kumar
