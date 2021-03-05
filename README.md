# Demo-Swagger

This project is a demo created to demonstrate that swagger-maven-plugin will only generate a single definition in the swagger json file when there are two different classes/schemas
that have the exact same simple name but are part of 2 different namespaces. Namespaces thus are not considered in the generation process.

**Module : demo-schema:**

Contains 2 schema xsds - 
firstservice_V1_0.xsd
secondservice_V1_0.xsd

These schemas under a different namespace use same simple names for a type/schema (demoModel-> modelA)



**Module : demo-ws**

Contains 2 rest services -
FirstServiceV10Rs
SecondServiceV10Rs

FirstServiceV10Rs uses the schema from the firstservice-ws-types_V1_0.xsd and firstservice_V1_0.xsd
SecondServiceV10Rs uses the schema from secondservice-ws-types_V1_0.xsd and secondservice_V1_0.xsd



**ISSUE:**

Schemas/Types that undergoes conflict - FirstServiceResponse.FirstServiceDetailsResponse.ModelA AND SecondServiceResponse.SecondServiceDetailsResponse.ModelA
Swagger definitions for both the services end up refering to a single ModelA definition which is artbitrarily picked up from FirstServiceResponse.FirstServiceDetailsResponse.ModelA OR 
SecondServiceResponse.SecondServiceDetailsResponse.ModelA



**Building the project : **

mvn clean install in the root of Demo-Swagger directory



**What to look for when you have built it : **

Go to ..Demo-Swagger\demo-ws\target\classes\META-INF\resources and check the file swagger-v6.json. On viewing the file in json viewer we can see that the there is only one type definition 
generated for ModelA. Due to which both the FirstServiceResponse and SecondServiceResponse end up referring to same ModelA definition thus creating an incorrect definition.
