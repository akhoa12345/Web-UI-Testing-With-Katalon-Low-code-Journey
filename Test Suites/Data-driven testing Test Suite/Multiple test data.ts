<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Multiple test data</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>a1d96b80-1c78-4588-a376-00da095f2a08</testSuiteGuid>
   <testCaseLink>
      <guid>2e26f809-29e1-4ea5-8152-3ed17a32bd96</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <iterationNameVariable>
         <defaultValue>'Atlanta'</defaultValue>
         <description></description>
         <id>17ab9421-4e94-430a-8307-f8b168a30e5f</id>
         <masked>false</masked>
         <name>city</name>
      </iterationNameVariable>
      <testCaseId>Test Cases/6. Test Authoring With Katalon_ Data-Driven Testing/Find a place</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>53b1a984-08a8-4eb6-87d5-ac1f2912676a</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/100 cities</testDataId>
      </testDataLink>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>f6e2c1aa-fde4-4c00-9a01-a3eabc8742ef</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/excelFile_100cities</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>f6e2c1aa-fde4-4c00-9a01-a3eabc8742ef</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>17ab9421-4e94-430a-8307-f8b168a30e5f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>53b1a984-08a8-4eb6-87d5-ac1f2912676a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>result</value>
         <variableId>2f78578f-bd0e-4667-a702-427b4c24119c</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
