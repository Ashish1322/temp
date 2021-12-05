import java.util.Scanner;
class hangman {
    
    // Globla Declarations of some variables and Scanner Class Object
    Scanner inputObject = new Scanner(System.in);
    String UserInput, word;
     
    // function to check if the char guesses by user is present in the word or not
    public boolean is_preset(String word , char guess)
    {
        for(int index= 0 ; index < word.length() ; index++)
        {
            if(word.charAt(index) == guess)
            return true;
        }
        return false;
    }

    // Function to find the index of char guessed by user in the word String and update that index in the UserInput String as correct.
    public void find_index_update(String word,char guess)
    {
        for(int index = 0 ; index < word.length() ; index++)
        {
            if(word.charAt(index)==guess)
            
            {
               UserInput = UserInput.substring(0, index) + guess + UserInput.substring(index+1); 
            }
        }
        System.out.println(UserInput);
    
    }
    
    // Function to choose andy random String from the given array of String and store it in word string and set the userinput as blank initially
    public void SetData()
    {
        String words[] = {"hello","goodbye","amanyadav"};
        int random_index = (int)(Math.random()*3);
        word = words[random_index];
        
        UserInput = "";
        for(int index  = 0 ; index < word.length() ; index++)
        {
          UserInput += '-' ;
        }
        
        System.out.println(word + UserInput);
    }
    
    // Function to print star line as a separation view
    

    // Function for playing Game and taking inputs infinitely from the user until game is end.
    public void playGame()
    {
        char guess;
        while(true)
        {
            if(word.equals(UserInput))
            {
                System.out.println("Congratualtions...");
                System.out.println("You won ");
                break;
            }
        
            System.out.println("Guess a word .. ");
            guess = inputObject.nextLine().charAt(0);
            if(is_preset(word,guess))
            {
                System.out.println("Hurrah......");
                System.out.println("Your Guess is correct..");
                find_index_update(word,guess);
             
            }
            else
            {
                System.out.println("Ohhh!.....");
                System.out.println("Your Guess is incorrect, Pleae Try again....");
            }
        }
    }

   
    // Main Function
    public static void main(String[] args) {
     hangman player = new hangman();
     player.SetData();
     player.playGame();
    }
}