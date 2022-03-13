package com.bridgelab;

public class MoodAnalyser {
    public static String message;

    public MoodAnalyser() {
        String message;
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    enum MoodAnayserError{
        NULL, EMPTY;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to mood analyser programms");
    }

    public String analseMood(String message) {
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public String exceptionAnalysis(String message){
        try {
            if (message.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }catch (NullPointerException e) {
            System.out.println("Null pointer Exception");
            return "HAPPY";
        }
    }

    public String moodAnalyse(String message) {
        String value=null;
        if (message.equals(MoodAnayserError.NULL.toString()) || message.equals(MoodAnayserError.EMPTY.toString())) {
            try {
                throw new Exception("UserDefinedCustomException");
            } catch (Exception e) {
                e.fillInStackTrace();
                value= e.getMessage();
            }
        }
        if (message.equals("sad"))
            return "SAD";
        if(message.equals("happy")) {
            return "HAPPY";
        }
        return value;
    }

    @Override
    public String toString() {
        return "MoodAnalyser{" +
                "message='" + message + '\'' +
                '}';
    }
}