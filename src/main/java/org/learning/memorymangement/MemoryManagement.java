package org.learning.memorymangement;

public class MemoryManagement {
    public static void main(String args[]){
        int primitiveVariable = 10;
        Person personObj = new Person();
        String stringLiteral = "24";
        String stringLiteral0 = "24";
        System.out.println("The hashCode of stringLiteral " + System.identityHashCode(stringLiteral));
        MemoryManagement memObj = new MemoryManagement();
        memObj.memoryManagementTest(personObj);
    }

    private void memoryManagementTest(Person personObj){
        Person personObj2 = personObj;

        String stringLiteral2 = "24";
        String stringLiteral3 = new String("24");
        String stringLiteral4 = "24";
        String stringLiteral5 = new String("24");

        System.out.println("The hashCode of stringLiteral2 " + System.identityHashCode(stringLiteral2));
        System.out.println("The hashCode of stringLiteral3 " + System.identityHashCode(stringLiteral3));
        System.out.println("The hashCode of stringLiteral4 " + System.identityHashCode(stringLiteral4));
        System.out.println("The hashCode of stringLiteral5 " + System.identityHashCode(stringLiteral5));


        System.out.println("Result of stringLiteral2 == stringLiteral3 : " + (stringLiteral2 == stringLiteral3));
        System.out.println("Result of stringLiteral2 == stringLiteral4 : " + (stringLiteral2 == stringLiteral4));
        System.out.println("Result of personObj2 == personObj : " + (personObj == personObj2));

    }
}
