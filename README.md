# Labseq_Exercise
Implement a REST service, using a JAVA framework ( Quarkus) , returning a value from the labseq sequence.
A simple JavaScript web GUI (AngularJS) was use to invoke the service.

This exercise can be divided into two parts: the Backend part which was developed using Quarkus and the Frontend part which used Angular.
You need to run the Frontend and Backend separately. We'll explain how to do this below.

Backend
---------------------
The Backend is responsible for calculating the values of the requested sequence, given by the index "n", implementing a recursive method 
to calculate these values and a Cache method to improve the efficiency of this calculation. It is also responsible for exposing two RESTful endpoints.


Frontend
--------------------
