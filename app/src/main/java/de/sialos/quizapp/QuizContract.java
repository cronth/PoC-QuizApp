package de.sialos.quizapp;

import android.provider.BaseColumns; //

// provides constants for the App. Each Class gets an inner Class here.
public final class QuizContract {

    private QuizContract() {} // privater Konstruktor -> es können in anderen Klassen keine Objekte
    // erzeugt werden. Hier nicht unbedingt nötig, aber in Kollaborationen sinnvoll.

    public static class QuestionsTable implements BaseColumns {
        public static final String TABLE_NAME = "quiz_questions";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_ANSWER_NR = "answer_nr";

    }
}
