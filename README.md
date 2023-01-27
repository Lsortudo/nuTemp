# nuTemp

🔴 Projeto descontinuado por motivo que os correios cancelaram 2 APIs publica que não precisava de AUTH e a que precisa utiliza conta juridica/minhas importações e o token expira de 24 em 24 horas.


This challenge boils down to: An idea to be able to add packages and track them with a **clean** and **simple** interface; and it'll also help me to learn more about API, logic, testing, architecture and the sky is the limit.
Also i'll try to use push notifications, email notifications and Crashlytcs.

## API
I've used **Correios** **API** to get the data about all your packages;
Link to API (**docs**) -> [Correios.](https://cws.correios.com.br/ajuda)



## Technologies i've used

 - **MVVM** - Architecture choosed;
 - **Retrofit** - To get API requests;
 - **Coroutines** - Asynchronous programming;
 - **RecyclerView** - To list data;
 - **DataBinding** - To change UI data with less pollution in activity;
 - **LifeCycle** - Android lifecycle to avoid errors/crashs;

# Current state

#### That's the current state of the app, I'll try my best to keep the app true to the design and utilize all technologies i've previously listed.

### Checkboxes

 - [x]  Project idea;
 - [x]  Design;
 - [x]  Readme;
 - [x]  Project setup;
 - [x]  Gradle updated;
 - [x]  Main screen;
 - [x]  Add package screen;
 - [ ]  Track package screen;
 - [ ]  API connection;
 - [ ]  API data;
 - [ ]  Main screen redesign with API data;
 - [ ]  Track package screen redesign with ROOM/Firebase data;
 - [ ]  Clipboard to paste on Add package tracking number  {**not listed as required, it's a plus**};
 - [x]  Have the project available on Github;
 - [ ]  Code refactoring;
 - [ ]  Architecture;
 - [ ]  Tests;
 - [ ]  Publish the app on Play Store {**not listed as required, it's a plus**};
 - [ ]  Loading animation{**not listed as required, it's a plus**};


## Language

Which language and why did I choose?

|                |Kotlin                          |JAVA                         |
|----------------|-------------------------------|-----------------------------|
|Code			 	  |**It's not that complex**     |*A more complex and larger syntax*|            
|Popularity     	  |**It's gaining popularity after Kotlin first**            |*More popular making it easy to find guides about bugs and doubts*         |
|Community       	  |**Small community, but it's not impossible to find people**|*Huge community which makes it possible to make connections quickly* |
|NullPointerException |**The code won't work if you set it to null unless you do certain things...**|*Well well well* |

# APP Screenshot/Videos

![Main screen](https://github.com/Lsortudo/nuTempu/blob/master/screenshots/MainScreen.png) <br>
![Add package Screen](https://github.com/Lsortudo/nuTempu/blob/master/screenshots/AddPackageScreen.png)
![Track package Screen](https://github.com/Lsortudo/nuTempu/blob/master/screenshots/TrackPackageScreen.png) <br>

## Diagram about companies


> Situation of companies today.

```mermaid
graph LR
A[Companie] -- Looking for developer --- B([Experienced programmer])
B --- D[Developer]
A --- C(Inexperienced programmer)
C
C[Inexperienced programmer] -- looking for experience --- D[Developer]
```
