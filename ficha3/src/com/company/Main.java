package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    char original = 'b';
    char[] array1 = {'a','b','c','d'};
    char[] array2 = {'z','f','g','n'};
    char letter = CharacterUtilities.lowerLetterSuccessorOf(original);
    System.out.println(letter);
    char letterLast = CharacterUtilities.lowerLetterPredecessorOf(original);
    System.out.println(letterLast);
    char letterSteps = CharacterUtilities.lowerLetterSuccessorStepsOf(original,27);
    System.out.println(letterSteps);
    char letterStepsrPredecessorS = CharacterUtilities.lowerLetterPredecessorStepsOf(original,26);
    System.out.println("StepsrPredecessorS = " +  letterStepsrPredecessorS);
    int letteroccurrences = CharacterUtilities.occurrencesOfCharacterIn(array1,'a');
    System.out.println(letteroccurrences);
    char[] lettereCharacterIn = CharacterUtilities.replaceCharacterIn(array1,'d','b');
    System.out.println(lettereCharacterIn);
    char[] lettereconcatenation = CharacterUtilities.concatenationOf(array1,array2);
        System.out.println(lettereconcatenation);
    char[] lettercopy = CharacterUtilities.copyOfPartOf(array1,2,5);
        System.out.println(lettercopy);



    }
}
