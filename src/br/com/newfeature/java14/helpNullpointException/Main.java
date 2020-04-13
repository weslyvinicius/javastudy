package br.com.newfeature.java14.helpNullpointException;

public class Main {

    public static void main(String[] args) {

        // ao adiconar o comando abaixo:
        // -XX:+ShowCodeDetailsInExceptionMessages
        // na VM Options do compilador e retornavel uma informação melhorada
        // do erro de nullPointerException

        String a = null;
        String b  = a.toUpperCase();
    }


}
