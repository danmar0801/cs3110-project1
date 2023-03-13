// cs3110, Project 1, March 11th 2023
// By: Dany Marcha, Ausitn Aluzzi, Daniel (Dont forget Daniel last Name)
// This code will simulate the NFA for Decimal Integers
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        State[] states = {
                new State(0, false),
                new State(1, false),
                new State(2, false),
                new State(3, true),
                new State(4, false),
        };

        Transition[] transitions = {
                new Transition(states[0], states[1], new char[] { '0' }),
                new Transition(states[1], states[2], new char[] { 'o', 'O' }),
                new Transition(states[2], states[3], new char[] { '0','1','2','3','4','5','6','7' }),
                new Transition(states[3], states[3], new char[] { '0','1','2','3','4','5','6','7' }),
                new Transition(states[3], states[4], new char[] { '-'}),
                new Transition(states[4], states[3], new char[] { '0','1','2','3','4','5','6','7' }),
        };

        Automaton nfa = new Automaton(transitions, states[0]);

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter input string: ");
                String input = sc.nextLine();

                System.out.println(nfa.accepts(input) ? "accepted" : "rejected");
            }
        }
    }
}