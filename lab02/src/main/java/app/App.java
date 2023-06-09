package app;
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.InputMismatchException;

import vacation.Destination;
import vacation.AddOn;
import vacation.AdventureActivitiesPackageDecorator;
import vacation.AllInclusivePackageDecorator;
import vacation.BasicVacationPackage;
import vacation.VacationPackage;
import vacation.DurationPenaltyDecorator;
import vacation.GroupDiscountDecorator;
import vacation.SpaAndWellnessPackageDecorator;


final class App {
    
    private App() {};
    
    private static AddOn getAddOnByName(String name) {
        for (AddOn addOn : AddOn.values()) {
            if (addOn.getName().equalsIgnoreCase(name)) {
                return addOn;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        
        InputValidator validator = new InputValidator();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to T02s Vacation Packages!\n\n");
        
        System.out.println("Enter the destination: ");

        try {
            String destinationName = scanner.nextLine();

            if (!validator.isValidDestination(destinationName)) {
                throw new IllegalArgumentException("Invalid destination entered: " + destinationName);
            }
            
            Destination destination = new Destination(destinationName);
            System.out.println("You selected: "+ destinationName);
            System.out.println("Enter the number of travelers: ");
            
            int numberOfTravelers = scanner.nextInt();
            scanner.nextLine();
            
            if(!validator.isValidNumberOfTravelers(numberOfTravelers)) {
                throw new IllegalArgumentException("Invalid Number of Travelers entered: " + numberOfTravelers);

            }

            System.out.println("You entered "+numberOfTravelers +" travelers");

            System.out.println("Enter the number of days you are traveling: ");
           
            
            int daysTraveling = scanner.nextInt();
            scanner.nextLine();
            
            if(!validator.isValidDuration(daysTraveling)) {
                throw new IllegalArgumentException("Invalid Number of Travelers entered: " + numberOfTravelers);

            }
            
            System.out.println("Available add-ons:");
            for (int i = 0; i < AddOn.values().length; i++) {
                AddOn addOn = AddOn.values()[i];
                System.out.println((i + 1) + ". " + addOn.getName() + " - Price $" + addOn.getPrice() + " per traveler");
            }

            
            System.out.println("Enter the add-ons you want to select (comma-separated): ");
            
            String userInput = scanner.nextLine();
            
            scanner.close();


            String[] selections = userInput.split(",");
            ArrayList<AddOn> selectedAddOns = new ArrayList<AddOn>();
            
            
            for (String selection : selections) {
                AddOn addOn = getAddOnByName(selection.trim());
                if (addOn != null) {
                    selectedAddOns.add(addOn);
                } else {
                    System.out.println("Invalid add-on selection: " + selection);
                }
            }
            
            VacationPackage vacationPackage = new BasicVacationPackage(destination,numberOfTravelers,daysTraveling);


            if (!selectedAddOns.isEmpty()) {
                System.out.println("You selected the following add-ons:");
                for (AddOn addOn : selectedAddOns) {
                    switch (addOn) {
                        case ALL_INCLUSIVE:
                            vacationPackage = new AllInclusivePackageDecorator(vacationPackage);
                            System.out.println("Selected All-Inclusive.");
                            break;
                        case ADV_ACTIVITIES:
                            vacationPackage = new AdventureActivitiesPackageDecorator(vacationPackage);
                            System.out.println("Selected Adventure Activities.");
                            break;
                        case SPA_AND_WELLNESS:
                            vacationPackage = new SpaAndWellnessPackageDecorator(vacationPackage);
                            System.out.println("Selected Spa and Wellness.");
                            break;
                    }
                }
            } else {
                System.out.println("No valid add-on selections.");
            }       
            
            vacationPackage = new DurationPenaltyDecorator(vacationPackage);
            vacationPackage = new GroupDiscountDecorator(vacationPackage);
            
            
            System.out.println("Total Cost is\n$"+vacationPackage.getCost());

            
            
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Total Cost is -1");

        
            }  catch (InputMismatchException e) {
               System.out.println("Error: It seems like you are trying to enter something that is not an Int");
               System.out.println("Total Cost is -1");

            }

        }


    }
    
  



