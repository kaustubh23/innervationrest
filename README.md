**Project:** Innervation assignment <br />

**Technical Spec:** <br />
Java 8, Spring boot, Apache Camel, cfx <br />
Database: H2 <br />
Build tool: Maven <br />

**How to run:**  <br />
Checkout the code from github repository-> https://github.com/kaustubh23/InnervationOrder.git <br />
Open the project in eclipse as existing maven project <br />
Right click on Application.java class -> Run as -> Java Application <br />


**Endpoint: **  <br />
localhost:9090/sendOrder

Sample Request:

{
"orderNumber": "123",
"itemCode": "123",
"description": "kaustubh",
"qty": "2",
"amount": 9000
}

Sample Response:
{
    "responseCode": "01",
    "responseMessage": "Out of stock)"
}



H2 Database: <br />
http://localhost:9090/h2-console/
 <br />
Connection URL:  <br />
jdbc:h2:mem:inner <br />
UserName: <br />
sa <br />
Password:(Not Required) <br />


Remaining Tasks: <br />
Code analysis tool implementation <br />
Negative test scenarios <br />
Containerization <br />
