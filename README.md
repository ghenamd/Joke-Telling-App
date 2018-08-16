# Joke-Telling-App

### Project Overview
In this project, you will create an app with multiple flavors that uses multiple libraries and Google Cloud Endpoints. The finished app will consist of four modules:

A Java library that provides jokes
A Google Cloud Endpoints (GCE) project that serves those jokes
An Android Library containing an activity for displaying jokes
An Android app that fetches jokes from the GCE module and passes them to the Android Library for display
### Why this Project?
As Android projects grow in complexity, it becomes necessary to customize the behavior of the Gradle build tool, allowing automation of repetitive tasks. Particularly, factoring functionality into libraries and creating product flavors allow for much bigger projects with minimal added complexity.

### What Will I Learn?

Add free and paid flavors to an app, and set up your build to share code between them
Factor reusable functionality into a Java library
Factor reusable Android functionality into an Android library
Configure a multi-project build to compile your libraries and app
Use the Gradle App Engine plugin to deploy a backend
Configure an integration test suite that runs against the local App Engine development server
![](https://d17h27t6h515a5.cloudfront.net/topher/2017/October/59f8ff3d_screen-shot-2017-10-31-at-3.54.32-pm/screen-shot-2017-10-31-at-3.54.32-pm.png)

### How Do I Complete this Project?
#### Step 0: Starting Point
This is the starting point for the final project, which is provided to you in the course repository. It contains an activity with a banner ad and a button that purports to tell a joke, but actually just complains. The banner ad was set up following the instructions here:
https://developers.google.com/mobile-ads-sdk/docs/admob/android/quick-start

#### Step 1: Create a Java library
Your first task is to create a Java library that provides jokes. Create a new Gradle Java project either using the Android Studio wizard, or by hand. Then introduce a project dependency between your app and the new Java Library.
Make the button display a toast showing a joke retrieved from your Java joke telling library.

#### Step 2: Create an Android Library
Create an Android Library containing an Activity that will display a joke passed to it as an intent extra. Wire up project dependencies so that the button can now pass the joke from the Java Library to the Android Library.
#### Step 3: Setup GCE
This next task will be pretty tricky. Instead of pulling jokes directly from our Java library, we'll set up a Google Cloud Endpoints development server, and pull our jokes from there. The starter code already includes the GCE module in the folder called backend.
Introduce a project dependency between your Java library and your GCE module, and modify the GCE starter code to pull jokes from your Java library. Create an AsyncTask to retrieve jokes using the template included int these instructions. Make the button kick off a task to retrieve a joke, then launch the activity from your Android Library to display it.

#### Step 4: Add Functional Tests
Add code to test that your Async task successfully retrieves a non-empty string.

#### Step 5: Add a Paid Flavor
Add free and paid product flavors to your app. Remove the ad (and any dependencies you can) from the paid flavor.
