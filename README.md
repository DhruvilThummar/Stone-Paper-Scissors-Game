# Stone-Paper-Scissors-Game


🪨📃
![XboxOneControllerGIF](https://github.com/user-attachments/assets/eca7436a-7e9f-4048-989c-e8194b7c08da)
✂️🎮


#Stone Paper Scissor Game Without loop

This Java program is a simple **Stone, Paper, Scissors** game that allows a user to play against the computer. Below is a detailed description of its functionality:

---

### **Program Overview**:
1. **Purpose**:
   - The program simulates a game of "Stone, Paper, Scissors" between a user and the computer.
   - The game continues in a loop until the user decides to stop by typing anything other than "yes."

2. **Core Features**:
   - The user enters their choice (`Stone`, `Paper`, or `Scissors`).
   - The computer makes a random selection from the same options.
   - The program determines the winner of each round based on standard rules.
   - The user can play multiple rounds, and the program asks after each round if the user wants to continue.

---

### **Code Walkthrough**:

1. **Scanner and Random Initialization**:
   - A `Scanner` object is used to read input from the user.
   - A `Random` object is used to generate the computer's random choice.

   ```java
   Scanner scanner = new Scanner(System.in);
   Random random = new Random();
   ```

2. **Choices Array**:
   - An array `choices` contains the three possible options: `Stone`, `Paper`, and `Scissors`.
   - The computer will randomly select one of these options using `random.nextInt(3)`.

   ```java
   String[] choices = {"Stone", "Paper", "Scissors"};
   ```

3. **Game Loop**:
   - The `while (true)` loop ensures the game continues until the user decides to stop.

   ```java
   while (true) {
       ...
   }
   ```

4. **User Input**:
   - The program prompts the user to input their choice.

   ```java
   System.out.println("Enter your choice (Stone, Paper, Scissors): ");
   String userChoice = scanner.nextLine();
   ```

5. **Computer's Choice**:
   - A random index between `0` and `2` is generated, and the corresponding choice from the `choices` array is assigned to `computerChoice`.

   ```java
   int computerChoiceIndex = random.nextInt(3);
   String computerChoice = choices[computerChoiceIndex];
   ```

6. **Outcome Determination**:
   - The program compares the user’s choice and the computer’s choice:
     - **Tie**: If both choices are the same.
     - **User Wins**: Based on standard game rules (e.g., Stone beats Scissors, etc.).
     - **Computer Wins**: If it doesn’t tie and the user doesn’t win.

   ```java
   if (userChoice.equalsIgnoreCase(computerChoice)) {
       System.out.println("It's a tie!");
   } else if ((userChoice.equalsIgnoreCase("Stone") && computerChoice.equalsIgnoreCase("Scissors"))
           || (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Stone"))
           || (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
       System.out.println("You win!");
   } else {
       System.out.println("Computer wins!");
   }
   ```

7. **Replay Prompt**:
   - After each round, the user is asked whether they want to play again.
   - If the user types anything other than "yes," the game exits.

   ```java
   System.out.println("Play again? (yes/no): ");
   String playAgain = scanner.nextLine();
   if (!playAgain.equalsIgnoreCase("yes")) {
       break;
   }
   ```

8. **Closing the Scanner**:
   - The `scanner.close()` statement ensures that the `Scanner` object is closed properly, releasing any associated resources.

   ```java
   scanner.close();
   ```

---

### **Program Strengths**:
- **Basic Functionality**:
  - Implements the game effectively and includes all basic components.
- **Replay Option**:
  - Allows users to play multiple rounds without restarting the program.
- **Case Insensitivity**:
  - Handles user input in a case-insensitive manner using `equalsIgnoreCase`.

---

### **Potential Improvements**:
1. **Input Validation**:
   - Currently, the program does not handle invalid input (e.g., "Rock" instead of "Stone").
   - Adding a check to ensure only valid inputs are accepted would make the program more robust.

2. **Score Tracking**:
   - Implement a scoring system to keep track of wins, losses, and ties over multiple rounds.

3. **Output Formatting**:
   - Enhance the display to make it more user-friendly, such as better formatting for each round's outcome and final scores.

---
