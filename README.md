
# Compose Fancy Dialog 

### About Fancy Dialog or Compose Fancy Dialog 

Fancy Compose Dialog - 
1. Custom Dialog with two buttons
2. Custom Dialog with background
3. You can set custom background color and button color

## About me

Hi, I am [**Dheeraj Singh Bhadoria**](https://dheeruapps.in), Mobile Applicaiton Developer. I am passionate about sharing knowledge through open-source, blogs, and videos.

## Using Progress Button in your application

Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Add this in your build.gradle
```groovy
implementation 'com.github.dheeraj-bhadoria:Compose-Fancy-Dialog-Library:0.0.1'

```

How to use this  :
```kotlin
     FancyAlertDialog(
                title = "Rate us if you like the app",
                backgroundColor = Color(0xFF303F9F),
                message = "Do you really want to Exit ?",
                negativeBtnText = "Cancel",
                positiveBtnBackground = Color(0xFFFF4081),
                positiveBtnText = "Rate",
                negativeBtnBackground = Color(0xFFA9A7A8),
                onPositiveClicked = {
                    // Positive button clicked action
                    // Add your logic here
                    println("Rate")
                    showDialog = false // Dismiss the dialog
                },
                onNegativeClicked = {
                    // Negative button clicked action
                    // Add your logic here
                    println("Cancel")
                    showDialog = false // Dismiss the dialog
                }
            )
```
Complete Code  :
```kotlin
 Column() {
        var showDialog by remember { mutableStateOf(false) }

        Button(
            onClick = { showDialog = true }
        ) {
            Text("Show Dialog")
        }

        if (showDialog) {

            FancyAlertDialog(
                title = "Rate us if you like the app",
                backgroundColor = Color(0xFF303F9F),
                message = "Do you really want to Exit ?",
                negativeBtnText = "Cancel",
                positiveBtnBackground = Color(0xFFFF4081),
                positiveBtnText = "Rate",
                negativeBtnBackground = Color(0xFFA9A7A8),
                onPositiveClicked = {
                    // Positive button clicked action
                    // Add your logic here
                    println("Rate")
                    showDialog = false // Dismiss the dialog
                },
                onNegativeClicked = {
                    // Negative button clicked action
                    // Add your logic here
                    println("Cancel")
                    showDialog = false // Dismiss the dialog
                }
            )

        }
    }
```
Output  :
<img src="https://github.com/dheeraj-bhadoria/Compose-Fancy-Dialog-Library/blob/main/composefancydialog.gif" >


### License
```
   Copyright (C) 2023 Dheeraj Singh Bhadoria

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
