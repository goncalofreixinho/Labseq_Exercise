# Labseq_Exercise
Implement a REST service, using a JAVA framework ( Quarkus) , returning a value from the labseq sequence.
A simple JavaScript web GUI (AngularJS) was use to invoke the service.

This exercise can be divided into two parts: the Backend part which was developed using Quarkus and the Frontend part which used Angular.
You need to run the Frontend and Backend separately. We'll explain how to do this below.

Backend
---------------------
The Backend is responsible for calculating the values of the requested sequence, given by the index "n", implementing a recursive method 
to calculate these values and a Cache method to improve the efficiency of this calculation. It is also responsible for exposing two RESTful endpoints.
These main responsibilities are reflected in the classes: Labseq and Labseq_REST.

URLS:
REST API documentation - http://localhost:8080/q/swagger-ui/
Backend: http://localhost:8080/labseq/{n}/

Frontend
--------------------
The Frontend plays a crucial role in user interaction with the Quarkus backend. It is mainly made up of the AppComponent class and the ApiService 
service, which together provide a graphical user interface and manage communication with the backend.

URLS:
Frontend: http://localhost:4200/

How to Run 
--------------------
Run Frontend:

Check if you have docker installed and what version you have. If you don't have it, install. In the development of this project Docker version 20.10.21 was used.
