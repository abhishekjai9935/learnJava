package org.learning.javavariables;

public class JavaVariables {

    public static void learningDownCasting(){

        int intVariable = 10;
        byte byteVariable = intVariable;

        //The above statement will show compile time error,
        // since explicit conversion is required, as shown below

        byte byteVariable = (byte) 10;
        System.out.println("intVariable = " + intVariable + "; the same variable when assigned to a byteVariable then its value = " + byteVariable);
        intVariable = 128;
        byteVariable = (byte) intVariable;
        System.out.println("intVariable = " + intVariable + "; the same variable when assigned to a byteVariable then its value = " + byteVariable);
        intVariable = 148;
        byteVariable = (byte) intVariable;
        System.out.println("intVariable = " + intVariable + "; the same variable when assigned to a byteVariable then its value = " + byteVariable);
    }

}