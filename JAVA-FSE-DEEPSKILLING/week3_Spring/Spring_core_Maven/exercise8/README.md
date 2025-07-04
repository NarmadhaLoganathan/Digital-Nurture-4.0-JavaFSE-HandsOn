Exercise 8: Implementing Basic AOP with Spring
Scenario:
The library management application requires basic AOP functionality to separate cross-cutting concerns like logging and transaction management.
Steps:
1.	Define an Aspect:
o	Create a package com.library.aspect and add a class LoggingAspect.
2.	Create Advice Methods:
o	Define advice methods in LoggingAspect for logging before and after method execution.
3.	Configure the Aspect:
o	Update applicationContext.xml to register the aspect and enable AspectJ auto-proxying.
4.	Test the Aspect:
o	Run the LibraryManagementApplication main class to verify the AOP functionality.
