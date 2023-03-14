# CS3110 - project 1
### March 12th 2023

| Names         | GitHub User Names |                            Tasks                                        |
| --------------|:-----------------:| ------------------------------------------------------------------------|
| Dany Marcha   | danmar0801        | Created diagrams for NFA, helped with code to simulate different NFA's  |
| Austin Aluzzi    | aaaluzzi              | Created Diagrams For NFA, wrote code to simulate the NFA                |
| Daniel plascencia        | exodiusLux            |    Cretaed diagrams for NFA, helped with code to simulate nfas                                                   |

## Diagram for the NFA's:
### Decimal Integers.
![DeciInteger NFA](https://user-images.githubusercontent.com/48169746/224893148-d76d3b9a-7c05-48f1-ad41-31261bc0d5ba.png)

### Hexi-Integers.
![HexiInteger NFA](https://user-images.githubusercontent.com/48169746/224893195-72259929-6553-4136-8cbf-c1695790b587.png)

### Octal-Integers.
![OctalInteger NFA](https://user-images.githubusercontent.com/48169746/224893104-158fc1bd-8911-44ac-b4b8-a5259838c6ae.png)

## To view the code, please head to this Link
[cs3110-project1/cs3110-project1/src/](https://github.com/danmar0801/cs3110-project1/tree/master/cs3110-project1/src)

#### The master branch will show the code for the decimal integer.
#### the hexiIteger branch will show the code for the Hexa-Integer.
#### The octalInteger branch will show the code for the OCTAL-Integer.

We broke up the code into multiple files to make it easier to understand. The Main.java file is the file that puts all the code together to simulate the different NFA's.

Each NFA is manually created as an Automaton object based on the NFA diagrams. An Automaton is constructed with an array of Transition objects and an initial state. Transition objects are constructed with a from State, to State, and an array of values for the transition arrow. State objects simply contain an id and whether they are an accept state or not.

Potential integer inputs are tested using Automaton.accepts(input). This method takes the first character of the input, checks the current state, and for each valid Transition, if any, the method is called again recursively with the next appropriate input and state. It is only when the input is empty and the current state is accept state that the method returns true (which is the recursive base case).
