📌 Project Highlights

In this project, we:

Set up dependencies required for the app.

Integrated Dagger Hilt for dependency injection and created a Constants class for centralized values.

Defined Models and Interfaces to represent and fetch game data.

Built a Repository and ViewModel to manage data flow, and displayed it in the HomeView using Retrofit.

Created a reusable TopBar component for consistent UI across screens.

Designed a Game Card and displayed it in the HomeView.

Customized themes by applying background colors.

Implemented Navigation to move from HomeView to DetailView, passing the game ID as an argument.

Fetched game details by ID using a SingleGameModel via getGameById implemented in ApiGames, Repository, and ViewModel.

Displayed the selected game details, using Scaffold with back navigation support.

Opened game websites in the browser via an intent when pressing the website button.

Added a Review Card to display the Metacritic score.

Enabled scrolling in the description section for better readability.

Implemented state-cleaning functions to reset UI states when necessary.

Added TopBar actions with a search button that opens the SearchGameView.

Implemented a SearchBar to query games.

Enhanced the SearchBar with incremental search (search-as-you-type) for better UX.
<p align="center">
  <img src="https://github.com/nolvertou/GamesRetrofitApp/blob/4f660c988b4ab9e49ee0defb01f95fecd8cabb87/app/src/main/res/drawable/HomeView.jpg" alt="HomeView" width="200"/>
  <img src="https://github.com/nolvertou/GamesRetrofitApp/blob/4f660c988b4ab9e49ee0defb01f95fecd8cabb87/app/src/main/res/drawable/DetailView.jpg" alt="DetailView" width="200"/>
  <img src="https://github.com/nolvertou/GamesRetrofitApp/blob/4f660c988b4ab9e49ee0defb01f95fecd8cabb87/app/src/main/res/drawable/SearchGameView.jpg" alt="SearchGameView" width="200"/>
</p>


