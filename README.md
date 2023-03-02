
Practising LLD / Machine Code for an online ticket booking app (like book my show)


- Understand requirements : 

    Requirements
    • App will be listing current movies and the shows.
    • App allows user to search for movies.
    • App will be listing different shows for a movie.
    • App allows registered user to book ticket for a show.
    • App allows theaters to add/edit a show.


- Ask questions and specify assumptions :

    Assumptions
        • Every theater has single screen.
        • Every theater has some capacity (No. of seats).
        • Registered users can book tickets, but Guest users are allowed to search movies.
        • Registered users will have the history of their bookings.
        • Movies can be in two languages: Hindi and English
        • Movies can have any of the four genres: Action, Romance, Comedy and Horror.
        • We are not considering Payment module for now.


- Make use case diagrams :

    • Make a box and write system name on top

    • Indentify actors 

    • Identify use cases : actions taken by actors : search for verbs in requirements

    • Add Associations : 
        • connect actors with use cases
        • Identify Inclusive use cases : break use cases into smaller use cases 
        • add extension use cases (usually ignored in mvp 1)
        • add generalisation/inheritance on actors  (modify Associations accordingly)



- Make class diagrams
    • Tag all the nouns in requirements : App, movies, shows, user, shows, registered user, ticket, theatre 
    • Tag all the nouns in assumptions : screen, guest user, language, genre 
    • make class for each noune and draw relationships btw them 
    • tricky, needs practise 


- Make db diagrams 

SELECT * FROM MOVIE ;
SELECT * FROM SHOW  ;
SELECT * FROM THEATRE;  
Select * from Registered_user;
Select * from ticket;
