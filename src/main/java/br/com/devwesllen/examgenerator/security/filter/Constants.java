package br.com.devwesllen.examgenerator.security.filter;

import java.util.concurrent.TimeUnit;

public class Constants {
    public static final String SECRET="secret";
    public static final String TOKEN_PREFIX="bearer";
    public static final String HEADER_STRING="authorization";
    public static final long EXPIRATION_TIME= 86400000L; // 1 Day

    public static void main(String[] args) {
        System.out.println(TimeUnit.MILLISECONDS.convert(1,TimeUnit.DAYS));
    }

}
