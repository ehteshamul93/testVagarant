This Java project implements an in-memory store for recently played songs per user. It allows storing a list of song-user pairs, where each user can have up to N songs in their recently played list. When the store reaches its initial capacity, it removes the least recently played songs to accommodate new entries.


Features: 

Addition of Songs: Allows adding songs to a user's recently played list.
Retrieval of Songs: Retrieves the list of recently played songs for a user.
Capacity Management: Automatically remove the least recently played songs when the store exceeds capacity.
Testing: Includes TestNG tests to validate the functionality of the SongManager class.

Getting Started

Prerequisites
Java Development Kit (JDK) installed on your machine.
Maven (optional, for running tests via command line with Maven).
Installation
Clone the repository to your local machine:

git clone <repository url>
Open the project in your any IDE

Running the Code
Run SongManager:

Navigate to src/main/java/SongManager.java.
Run the main method to execute the sample usage and see the output.
Run TestNG Tests:

Navigate to src/test/java/SongManagerTest.java.
Right-click on the file or on a specific test method.
Select "Run" or "Run as TestNG Test" to execute the tests.

OR

If using Maven, open a terminal or command prompt.

Navigate to your project directory.

Run the following Maven command to execute TestNG tests:

mvn test



