# Bible History Flashcard App - Assignment 2

**ST10494672**

## Description

The Bible Quiz Flashcard App is an Android app that presents users with a series of Bible-themed True/False questions. 
The app tracks the user’s score, provides instant feedback, and allows users to review all questions and answers after completing the quiz.

## Features
Welcome Screen : Introduces the app and includes a start button.

Quiz Screen : Presents one question at a time with True/False options.

Score Screen : Shows how many questions were answered correctly.

Review Screen : Displays all questions along with their correct answers.

Simple Navigation : Uses standard Android navigation with Intent.

Clean UI : Uses LinearLayout and basic styling for readability.

## UI Enhancements
Centered layout with padding for better readability.

Distinct text for questions and answer explanations.

Clean typography and spacing for accessibility.

Optional enhancements include background images and semi-transparent overlays.

## Technologies Used 
Android Studio-IDE for building and testing Android apps

Kotlin-Primary programming language for logic and UI

XML-Layout design for each screen

Intents-Navigation between activities

## Prerequisites
Before you begin, make sure you have:

Android Studio 

A virtual or physical Android device for testing
## Clone the repository

## Open in Android Studio

Launch Android Studio

Select Open an existing Android Studio project

Navigate to the folder where you saved the project

Click OK

## Running the App

Connect your emulator or plug in a real Android device

Click the Run button in Android Studio

The app should install and launch automatically

## Code structure and Logic 
app/

src/

 main/
 
java/vcmsa.ci.assignment2/

MainActivity.kt
      
QuizActivity.kt
      
  ScoreActivity.kt
       
 ReviewActivity.kt
      
res/
  layout/
          
activity_welcome.xml
          
   activity_quiz.xml
     
 activity_score.xml
          
 activity_review.xml
           
## Logic behind the App

App Flow

MainActivity → User clicks Start

QuizActivity → Presents one question at a time

User answers by clicking True or False

Automatically advances to next question

At end of quiz, user is taken to ScoreActivity

From there, user can go to ReviewActivity to view all correct answers
## Screenshots of the app 
![front page](https://github.com/user-attachments/assets/2e276d58-8c37-46f7-85da-6c959be3ed45)
![question 1 page ](https://github.com/user-attachments/assets/43258382-958e-4b53-8f56-7341d9a5ac60)
![score page ](https://github.com/user-attachments/assets/6642f03b-90e9-4738-8656-e7850b969175)
![review page](https://github.com/user-attachments/assets/eb61d292-428c-493d-9a89-c328c7c080fc)
## YT link for app 
https://youtu.be/UQ_g1hYiRDI




