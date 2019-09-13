package com.skooltchdev.multiplechoicequiz;


public class QuestionLibrary {

    private String mQuestions [] = {
            "Which of the following is NOT stored in RAM?",
            "The Microsoft Word document you are working on",
            "This part of the plant attracts bees, butterflies and hummingbirds.",
            "The _______ holds the plant upright."

    };


    private String mChoices [][] = {
            {"The BIOS settings", "The Microsoft Word document you are working on", "A Web browsing session"},
            {"Fruit", "Leaves", "Seeds"},
            {"Bark", "Flower", "Roots"},
            {"Flower", "Leaves", "Stem"}
    };



    private String mCorrectAnswers[] = {"The BIOS settings", "Leaves", "Flower", "Stem"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
