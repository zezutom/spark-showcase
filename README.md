# Planning App

## Overview
 
You are required to write code to complete a number of exercises and answer a set of questions 
from a dataset we have provided. 

* The code must be written using the Scala API of the latest version of Apache Spark.
* The code for each question must be contained within its own class as a self-contained application. 
* The classes and methods are expected to be parameterised for flexibility and adopt any 
other good coding practices as you see fit.
 
Please include the following:

* Code for each question.
* Instructions describing how the code is to be compiled and / or executed.
* The standard output and / or output files resulting from the execution of the code.
 
## Input Data
The dataset for this assessment is a set of building planning application records 
(i.e. applications submitted to request approval to construct / modify building structures) in JSON format. 
This data has been selected based on its small size in order to take the emphasis of the challenge away from 
data manipulation with big data. You should be able to analyse this dataset locally on a single machine 
without the need for a distributed computing cluster.
 
An overview of the dataset can be found here:
http://data.gov.uk/dataset/planning-applications-northumberland
 
The actual JSON dataset required to answer the questions can be found here:
http://opendata.northumberland.gov.uk/static/datasets/planning-applications-weekly-list/planning-applications-weekly-list.json
 
## Exercises & Questions
1. Discover the schema of the input dataset and output it to a file.
2. What is the total number of planning application records in the dataset? Feel free to output this to a file or standard output on the console.
3. Identify the set of case officers (CASEOFFICER field) and output a unique list of these to a file.
4. Who are the top N agents (AGENT field) submitting the most number of applications? Allow N to be configurable and output the list to a file.
5. Count the occurrence of each word within the case text (CASETEXT field) across all planning application records. Output each word and the corresponding count to a file.
6. Measure the average public consultation duration in days (i.e. the difference between PUBLICCONSULTATIONENDDATE and PUBLICCONSULTATIONSTARTDATE fields). Feel free to output this to a file or standard output on the console.
