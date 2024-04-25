<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Sanity Checking</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>3f68b419-a65c-479b-ac7a-9288031934b3</testSuiteGuid>
   <testCaseLink>
      <guid>b3befcfe-f894-4ca5-ad11-bb237f8dd7bb</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <iterationNameVariable>
         <defaultValue>'places in Atlanta'</defaultValue>
         <description></description>
         <id>2f78578f-bd0e-4667-a702-427b4c24119c</id>
         <masked>false</masked>
         <name>expectedResult</name>
      </iterationNameVariable>
      <testCaseId>Test Cases/6. Test Authoring With Katalon_ Data-Driven Testing/Find a place</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>ac956b6b-2a7b-4a4c-96d2-5fc21afe3675</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/100 cities</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>ac956b6b-2a7b-4a4c-96d2-5fc21afe3675</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>17ab9421-4e94-430a-8307-f8b168a30e5f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ac956b6b-2a7b-4a4c-96d2-5fc21afe3675</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>result</value>
         <variableId>2f78578f-bd0e-4667-a702-427b4c24119c</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
