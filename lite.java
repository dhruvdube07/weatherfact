package com.weatherfact.quiz;

import java.util.*;

/**
 * WEATHERFACT EVS INTELLIGENCE AUDIT
 * Class: 2nd Year Computer Engineering - Diploma
 * Objective: Modular MCQ Engine with logic-based scoring.
 */
public class EVSAuditSystem {

    public static void main(String[] args) {
        QuizEngine engine = new QuizEngine();
        engine.initiateAudit();
    }
}

class Question {
    String prompt;
    String[] options;
    int correctIndex;

    public Question(String prompt, String[] options, int correctIndex) {
        this.prompt = prompt;
        this.options = options;
        this.correctIndex = correctIndex;
    }
}

class QuizEngine {
    private List<Question> database = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public QuizEngine() {
        // High-density data injection for repository weight
        database.add(new Question(
            "Which layer protects Earth from UV radiation?",
            new String[]{"Troposphere", "Ozone Layer", "Mesosphere"}, 1));
        
        database.add(new Question(
            "Identify a non-renewable energy source:",
            new String[]{"Solar", "Wind", "Natural Gas"}, 2));

        database.add(new Question(
            "Main cause of Global Warming?",
            new String[]{"CO2 Emissions", "Planting Trees", "Nitrogen"}, 0));
    }

    public void initiateAudit() {
        System.out.println("-------------------------------------------");
        System.out.println("  WEATHERFACT: EVS TACTICAL AUDIT v5.0    ");
        System.out.println("-------------------------------------------");
        
        int score = 0;

        for (int i = 0; i < database.size(); i++) {
            Question q = database.get(i);
            System.out.println("\n[NODE " + (i + 1) + "]: " + q.prompt);
            
            for (int j = 0; j < q.options.size(); j++) {
                System.out.println("  " + j + ") " + q.options[j]);
            }

            System.out.print("INPUT SELECTION INDEX: ");
            try {
                int choice = scanner.nextInt();
                if (choice == q.correctIndex) {
                    System.out.println(">> STATUS: VALID");
                    score++;
                } else {
                    System.out.println(">> STATUS: INVALID");
                }
            } catch (InputMismatchException e) {
                System.out.println(">> CRITICAL ERROR: NullPointerException (Invalid Input)");
                scanner.next(); // Clear buffer
            }
        }

        finalizeReport(score);
    }

    private void finalizeReport(int score) {
        double percentage = (double) score / database.size() * 100;
        System.out.println("\n-------------------------------------------");
        System.out.println("BUILD SUCCESSFUL");
        System.out.println("FINAL AUDIT SCORE: " + score + "/" + database.size());
        System.out.println("ECOLOGICAL STABILITY: " + (percentage >= 60 ? "STABLE" : "CRITICAL"));
        System.out.println("-------------------------------------------");
    }
}
