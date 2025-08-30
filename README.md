
<h1>🎮 Games Retrofit App</h1>

<p>The <strong>Games Retrofit App</strong> is an Android application built with <strong>Kotlin</strong> and <strong>Jetpack Compose</strong> that allows users to explore video games and view detailed information about each title.</p>

<ul>
  <li>Fetches data from a REST API using <strong>Retrofit</strong>.</li>
  <li>Displays a list of games in a modern <strong>Compose UI</strong>.</li>
  <li>Supports <strong>search-as-you-type</strong> functionality for quick game discovery.</li>
  <li>Includes detailed game information such as description, reviews, Metacritic score, and official website links.</li>
  <li>Implements <strong>MVVM architecture</strong>, <strong>Dagger Hilt</strong> for dependency injection, and <strong>Navigation Compose</strong> for smooth screen transitions.</li>
</ul>

<p>This project demonstrates clean architecture practices, state management in Jetpack Compose, and integration with external APIs in a scalable Android app.</p>


<div>
  <h3>📌 Project Highlights</h3>
  <ul>
    <li><strong>Set up dependencies</strong> required for the app.</li>
    <li><strong>Integrated Dagger Hilt</strong> for dependency injection and created a <code>Constants</code> class for centralized values.</li>
    <li><strong>Defined Models and Interfaces</strong> to represent and fetch game data.</li>
    <li><strong>Built a Repository and ViewModel</strong> to manage data flow, and displayed it in the <code>HomeView</code> using Retrofit.</li>
    <li><strong>Created a reusable TopBar component</strong> for consistent UI across screens.</li>
    <li><strong>Designed a Game Card</strong> and displayed it in the <code>HomeView</code>.</li>
    <li><strong>Customized themes</strong> by applying background colors.</li>
    <li><strong>Implemented Navigation</strong> to move from <code>HomeView</code> to <code>DetailView</code>, passing the game ID as an argument.</li>
    <li><strong>Fetched game details by ID</strong> using a <code>SingleGameModel</code> via <code>getGameById</code> implemented in <code>ApiGames</code>, Repository, and ViewModel.</li>
    <li><strong>Displayed the selected game details</strong>, using <code>Scaffold</code> with back navigation support.</li>
    <li><strong>Opened game websites in the browser</strong> via an intent when pressing the website button.</li>
    <li><strong>Added a Review Card</strong> to display the Metacritic score.</li>
    <li><strong>Enabled scrolling in the description section</strong> for better readability.</li>
    <li><strong>Implemented state-cleaning functions</strong> to reset UI states when necessary.</li>
    <li><strong>Added TopBar actions</strong> with a search button that opens the <code>SearchGameView</code>.</li>
    <li><strong>Implemented a SearchBar</strong> to query games.</li>
    <li><strong>Enhanced the SearchBar with incremental search (search-as-you-type)</strong> for better UX.</li>
  </ul>
</div>


<h3> App Views </h3>
<p align="center">
  <img src="https://github.com/nolvertou/GamesRetrofitApp/blob/1fe2815d9326d23b0286c24edcc6733977a640b1/app/src/main/res/drawable/homeview.jpg" alt="HomeView" width="200" style="margin: 0 50px;"/>
  <img src="https://github.com/nolvertou/GamesRetrofitApp/blob/1fe2815d9326d23b0286c24edcc6733977a640b1/app/src/main/res/drawable/detailview.jpg" alt="DetailView" width="200" style="margin: 0 50px;"/>
  <img src="https://github.com/nolvertou/GamesRetrofitApp/blob/1fe2815d9326d23b0286c24edcc6733977a640b1/app/src/main/res/drawable/searchgameview.jpg" alt="SearchGameView" width="200" style="margin: 0 50px;"/>
</p>




