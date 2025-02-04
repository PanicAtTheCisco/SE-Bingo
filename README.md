# SE Bingo

* This repository is the home of my Bingo project for Software Engineering Principles

## Project Secification

* Implement a bingo game.  If you don't know anything about Bingo, read this reference https://www.wikihow.com/Play-BingoLinks to an external site. 
* The program shall do the following:
* Read in a set of bingo cards from the given input file: BingoCards.txtDownload BingoCards.txt
* Allow the user to choose 1 to 4 bingo cards to play.  
* Implement two modes of play: random and manual
* For random play, the program will randomly select that chosen number of cards from the set of cards read in from the input file and display each card to the user.  In addition to the typical Bingo card data, the card will have a unique identifier and also row labels of  BINGO vertically down the card.  Use Tabs, Dashes, and Straight vertical lines to make the card look like a card on the command line prompt.  Then the automated caller will randomly generate the letter/number to call.  No combination may be called more than once in a game.  The combinations start with a letter from the work BINGO with the following constraints: "B" (numbers 1–15), "I" (numbers 16–30), "N" (numbers 31–45), "G" (numbers 46–60), and "O" (numbers 61–75).  This letter/number will be displayed to the user. Then show the user their card to identify the location with input by typing in a position value using the letter for the row followed by the letter for the column.  For example, BB would indicate the upper left cell.  If the value is not found, the user will indicate with input that is the case.  If it was found, redisplay the card with XX in place of the number of the marked location.  If the user believes they have completed a row, column, or diagonal, the user will type in input to indicate that they achieved Bingo.  The system will double check that they user accurately marked the card at this time to verify the Bingo.  If so, they win.  If not, they lose the card with the error.  If the user did not observe an earned a Bingo, they user indicate to go to the next card until all of their cards have been processed.  After each card has been processed, the next random value will be called until a Bingo is achieved.
* For manual play, the program will allow the user to select the card by its given name instead of randomly giving the user their cards.  The caller is not automated.  The program allows the user to type in the value selected by the caller.  Manual play would be used in cases where the caller was drawing physical BINGO balls randomly and reading the values or for testing.  The process of marking the found value is the same and calling Bingo is the same.