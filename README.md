# Way4R  [![Way4R App](https://i.imgur.com/OEPP0CV.png)](https://i.imgur.com/OEPP0CV.png)

## Table of content

- [Details](#details)
- [Introduction](#introduction)
    - [Feature List](#feature-list)
- [Demo](#demo)
    - [Home Page](#home-page)
    - [Map Types](#map-types)
    - [Autocomplete Search](#autocomplete-search)
    - [Place Picker](#place-picker)
    - [Google Sign In](#google-sign-in)
    - [Customized Marker](#customized-marker)
- [Links](#links)

---- 

## Details

|Title | Detail|
|---|---|
| University | [SJSU UNIVERSITY]( http://www.sjsu.edu/) |
| Domain | [SMARTPHONE APPLICATION DEVELOPMENT](http://info.sjsu.edu/web-dbgen/catalog/courses/CMPE277.html)|
| Developer | [HARINI BALAKRISHNAN](https://www.linkedin.com/in/harini-balakrishnan/) |

---- 

## Introduction 
The main objective of this project is to explore in-depth understanding of various Google APIs by integrating with an android application. I named this project as Way4R because in english dictionary ‘wayfarer’ means a person who loves to travel on foot. We have all come across various Map based applications like Google maps, waze. In this application, I have mixed the features like getting nearby places suggestions, customized markers, getting more information about places like the address, phone number, star rating and their website link. This application is built using android studio with Google Maps Android API, Google Places API and Google SignIn.
[![Way4R App](https://i.imgur.com/al2cmaL.png)](https://i.imgur.com/al2cmaL.png)

---- 

## Feature List 
- Find and mark device locations in the Google map using Google Maps Android API. 
- Determine latitude and longitude coordinates of locations. 
- Get the nearby locations based on the city, street, business names and postal codes  
- Get autocomplete location suggestions based on keyword searches. 
- Get location suggestions from the Google Places API and the Place Picker Interface. 
- Get informations about Businesses like their website URL and phone number. 
- Create customized markers with description and customized marker icons.
- Login and Logout using the Google Sign In service. 

[![Way4R App](https://i.imgur.com/p5pAQiD.png)](https://i.imgur.com/p5pAQiD.png)    [![Way4R App](https://i.imgur.com/QRHxGlm.png)](https://i.imgur.com/QRHxGlm.png)

---- 

## Demo
### Home Page 
When the user starts this application, initially the Android App asks permission to the user to access the device’s location. The GPS receiver in the device listens to a particular frequency for radio signals. Satellite sends the code messages every milli second. Each satellite has an atomic clock to send current time to the device as well. The message from he satellite includes the current position, time and few other informations. Thus the App after accessing the permission, tracks the device’s current location and shows it as a small blue dot on the Google Map.  Below image describes the main activity of the App (i.e) the first page with all the icons and their features.  Any user can use these features except to add customized marker to the map for which the user must login their Google account

[![Way4R App](https://i.imgur.com/wM7fLbQ.png)](https://i.imgur.com/wM7fLbQ.png) 

### Map Types 
> One of the essential feature of Google Maps is the Map types. There are 
5 basic types of map that is implemented in this application.        

- **Normal**: Typical road map with rivers, natural features, buildings
- **Hybrid**: Satellite photograph with road maps added as shown.                                             
- **Terrain**: Topographic data with colors and shadings with few roads.
- **Satellite**: Pure Satellite photograph with no labels or roads 
- **None**:  No tiles. The map is a empty grid with no extra tiles like road maps or building or shades. Gives a top view of the places

[![Way4R App](https://i.imgur.com/dHPtJb6.png)](https://i.imgur.com/dHPtJb6.png)         

### Autocomplete Search 

The search bar is used to search for places with autocomplete feature which is provided by Google Places API. When the user search for a place starting with letter ‘F’, the search listener shows list of places whose names starts with ‘F’. This is gathered using popularity and relevant searches based on the location. When the user searches for a place the results are collected based on the user’s location. Thus nearby places. Once the user clicks enter, the pin is fixed to the searched place and when the user clicks the info icon, it shows the details like full address, phone number and website URL along with the rating which tells how expensive is this place. 

[![Way4R App](https://i.imgur.com/iJFmIQd.png)](https://i.imgur.com/iJFmIQd.png) [![Way4R App](https://i.imgur.com/Y3s6j6O.png)](https://i.imgur.com/Y3s6j6O.png) 

### Place Picker
Third feature is to implement the Place Picker which has built-in  UI widget as a part of Google Places API for Android. It displays an interactive map with list of nearby places based on geographical addresses and local businesses. Users are allowed to select a place and get more informations. In order to implement this feature, we need to follow google document to get the certificate with SH1 key and enable the API in the Google developer console page. In this app, PlacePicker.IntentBuilder() is used to construct the Intent which helps to set the latitude and longitude by calling the setLatLngBounds() method. These bounds are called as ‘viewport’.  PlacePicker has code snippets in google document that allows to get the Place details by using their latitude and longitude bounds. Thus is allows to get name using place.getName() and so on. 

[![Way4R App](https://i.imgur.com/6FcWo0m.png)](https://i.imgur.com/6FcWo0m.png)[![Way4R App](https://i.imgur.com/3raBfKE.png)](https://i.imgur.com/3raBfKE.png)           

### Googel Sign in
Fourth feature is to allow users to drop markers on the map to notify other users about the place. This helps users to know new vista spots, or even blocks roads in advance which will help them to plan their walk accordingly. But not all users can drop markers because it might cause transferring of wrong informations. So, I have implemented Google SignIn feature which allows the user to login using their existing google account. User can logout at anytime. Only authenticated users are allowed to place the customized markers on the map.

[![Way4R App](https://i.imgur.com/1AFpAgW.png)](https://i.imgur.com/1AFpAgW.png)[![Way4R App](https://i.imgur.com/a9m0D4I.png?2)](https://i.imgur.com/a9m0D4I.png?2)   

### Customized Marker 
Once the user log-in, the Add Customized Marker form shows up. I designed this form as an AlertDialog which checks for user authentication initially and on click of ‘Save’ button all the details that the user entered is saved in the SQLite database. If the form is incomplete or user left any of the fields blank, the data is not saved and the app prompts a message to the user. Once the data is saved successfully, the customized icon for ‘vista’ is shown on the map with the details. I have used various customized icons like road block, etc

[![Way4R App](https://i.imgur.com/bdA78bG.png)](https://i.imgur.com/bdA78bG.png) [![Way4R App](https://i.imgur.com/KbM5CZE.png)](https://i.imgur.com/KbM5CZE.png)   

The performance of the Google APIs can be tracked in the Google developers console as show in the screen shots. Helps to track errors, no of requests and so on. All the credentials are maintained here.
[![Way4R App](https://i.imgur.com/ZDkbae8.png)](https://i.imgur.com/ZDkbae8.png)       

---- 

## Links 

- [Android Place Picker Document](https://developers.google.com/places/android-api/placepicker)
- [Sign In Document](https://developers.google.com/identity/sign-in/android/)
- [Google Maps API Document](https://developers.google.com/maps/documentation/android-api/)
 
