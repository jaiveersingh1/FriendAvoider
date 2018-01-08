AP CSA Semester 1 Term Project Documentation

Application Name: 
FriendAvoider

Short Description:
An app designed to tackle the hardest problem of life: avoiding contact with the people you don’t like. FriendAvoider provides users with the option to avoid friends who also use this app by detecting your location and notifying you when they are nearby. The app includes a settings window where you can toggle which friends to look out for and which friends to not look out for. When the app is opened, the user can see exactly where the friends are, and their exact distance from the user’s location. 

Team Members:
Justin Lee, Jaiveer Singh, John So, Michael Zhu

Problem Statement:
When people go through their daily business, it is usually awkward to see friends from online, who may be just general acquaintances you barely know, in public places such as shops, restaurants, or parks. Starting an unexpected conversation with these type of people can be hard and ruin your social image, and people tend to worry about seeing “friends” and having awkward situations when going about their personal business.

Proto.io Design:
https://pr.to/48G5YA/


Unique Feature of Application:
Our app implements one of Google’s newest APIs, which is called NearbyMessages. NearbyMessages API enables 2 way communication between Android and iOS devices universally. By combining Bluetooth, BLE, Wi-Fi, and GPS, NearbyMessages sends data over ultrasonic audio heard between the devices. Once the devices receive each other's code, they can transmit proximity information between each other.



Project Summary:
In this project, each of the team members had their individual roles. Justin wrote the problem statement, app description, created the presentation, and designed the Proto.io prototype prior to creating the real app. John also helped write the problem statement, and created the UML diagram that showed the class structure of our app. Jaiveer was the lead programmer and project manager, and created the majority of the app. He also debugged any problems and researched various APIs for our app. Michael was the assistant programmer, and helped implement the map UI for our app and run unit tests for the project. 
When starting the development of our app, we decided to take on a fail fast/fail big process. We decided to try to use various APIs, even though we knew they were hard to implement. As a result, Stack Overflow was an invaluable resource for us during the app development. 
During our design process, we encountered many challenges that hindered the progress of our app development. These included getting the app to run without crashing problems, which we had to debug before moving on. These sources of crashes were mainly from our failure to correctly implement the API, as it is very new. 
Some improvements or enhancements we can make in the future are dynamically updating location payload to let you know when the coast is clear, and better notification settings to fully serve the warning.
