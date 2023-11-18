# SW_SOAP_consommationfrom_Web_ClientJava
2applications java : Service Web SOAP and Application for consommation via WebClient JEE 

![Execution_web_of_SOAP_service](https://res.cloudinary.com/dvz16ceua/image/upload/v1700342392/github/soap_urk4on.png)

## Requirements

Ensure you have the following prerequisites installed before setting up and running the application.

- Java 1.8
- Apache Tomcat 9

## Static Data

This application utilizes static data for [change to dynamic : next RestApi Java application Repository]. The static data files are located in the `GestionNotes /` class.

If you need to update the static data,  modify the data as needed.

## Web Service Integration

This project uses a web service, and the client artifacts are generated using `wsimport`. To update the web service client:

1. Run the following command to generate client artifacts:

   ```bash
   wsimport -keep -p com.java [http://your-wsdl-url-here?wsdl](http://localhost:8080/MyTomcatdsws/ws/GestionNotes?wsdl)http://localhost:8080/MyTomcatdsws/ws/GestionNotes?wsdl
