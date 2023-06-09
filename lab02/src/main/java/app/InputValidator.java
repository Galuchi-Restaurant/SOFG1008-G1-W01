package app;

import vacation.Destination;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class InputValidator {
    private static final int MIN_TRAVELERS = 1;
    private static final int MAX_TRAVELERS = 80;
    private static final int MIN_DURATION = 1;

    
    public boolean isValidDestination(String destination) {
        String cityRegex = "^[A-Za-z\\s]+$"; 
        
        return Pattern.matches(cityRegex, destination);
    }
    
    public boolean isValidNumberOfTravelers(int numberOfTravelers) {
        return numberOfTravelers >= MIN_TRAVELERS && numberOfTravelers <= MAX_TRAVELERS;
    }
    
    public boolean isValidDuration(int duration) {
        // Implement your validation logic for duration
        // Check if the duration is within the valid range
        return duration >= MIN_DURATION;
    }
    


}
