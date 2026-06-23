# Java Quiz Application 🎯

A simple console-based quiz application built in Java to practice Object-Oriented Programming concepts.

## 📋 Description

This project is a multiple-choice quiz game where the user is shown a question with three options, types their answer, and gets a final score based on how many answers were correct. It was built as a hands-on practice project while learning Core Java.

## ✨ Features

- Displays multiple-choice questions with 3 options each
- Takes user input for answer selection via console
- Stores all user answers and compares them with correct answers at the end
- Calculates and displays the final score

## 🛠️ Concepts Used

- **Classes and Objects** – `Questions` and `QuestionService` classes
- **Encapsulation** – private fields with public getters and setters
- **Constructors** – initializing each `Questions` object with id, question text, options, and answer
- **Arrays** – storing the list of questions and the user's selections
- **Loops** – `for-each` loop to iterate through questions and answers
- **Scanner** – reading user input from the console
- **Separation of concerns** – `Questions` (data model), `QuestionService` (quiz logic), `Main` (entry point)

## 📁 Project Structure

```
quizz/
├── Main.java              # Entry point — starts the quiz
├── Questions.java          # Model class representing a single question
└── QuestionService.java    # Holds questions, runs the quiz, and calculates score
```

## ▶️ How to Run

1. Clone this repository
   ```bash
   git clone https://github.com/YOUR_USERNAME/java-quiz-app.git
   ```
2. Navigate to the project folder
   ```bash
   cd java-quiz-app
   ```
3. Compile the Java files
   ```bash
   javac quizz/*.java
   ```
4. Run the application
   ```bash
   java quizz.Main
   ```

## 📷 Sample Output

```
Question no. : 1
whats the language that is object oriented?.
java
python
cpp
java

Question no. : 2
what is the language that is used more often for ML?.
java
python
cpp
python

java
python
Your score is: 2
```

## 🚀 Future Improvements

- Add more questions, ideally loaded from a file or database instead of hardcoding
- Add input validation (currently invalid input isn't handled gracefully)
- Show correct answers along with the score at the end
- Add a timer per question
- Build a GUI version using JavaFX or Swing

## 🙋‍♂️ About

This is one of my first Java projects, built while learning Core Java and Object-Oriented Programming concepts (encapsulation, constructors, arrays, and basic console I/O).

---

⭐ Feel free to fork this repo and add your own questions!
