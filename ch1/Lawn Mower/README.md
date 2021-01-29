# Lawn Mower

This code will generate a lawn in ASCII art and then display a little lawn mower mowing the lawn. The size of the lawn is determined by the user.

## Pseudocode
* '' =
* '' =
* '' =

### Problem Statement
Write an algorithm that allows a robot to mow a rectangular lawn, provided it has been placed in a corner. The robot can:
* Move forward by one unit.
* Turn left or right.
* Sense the color of the ground one unit in front of it.

### Inputs and Outputs
* Class Main
  * Scanner cin
  * int lawnW, lawnH
  * char array lawn[][]
* Class LawnMower
  * int x, y, facing

### Tasks
Lawn Mower Class
* if next block is unmowed
  * move forward
  * change grass to mowed;
* else
  * rotate to the left
Main class
* Welcome the user
* Ask user for lawn width
* Ask user for lawn height
* Generate lawn array
* Construct LawnMower object
* while lawn not mowed
  * do mower stuff
  * display lawn
  * display mower
