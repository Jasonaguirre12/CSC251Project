import java.util.Scanner;

public class PolicyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PolicyHolder[] policyHolders = new PolicyHolder[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Please enter the Policy Number:");
            int policyNumberInput = scanner.nextInt(); // Rename the variable to avoid re-declaration
            scanner.nextLine(); // Consume the newline character

            System.out.println("Please enter the Provider Name:");
            String providerName = scanner.nextLine();

            System.out.println("Please enter the Policyholder’s First Name:");
            String firstName = scanner.nextLine();

            System.out.println("Please enter the Policyholder’s Last Name:");
            String lastName = scanner.nextLine();

            System.out.println("Please enter the Policyholder’s Age:");
            int age = scanner.nextInt(); // Define the variable age here

            System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker):");
            String smokingStatus = scanner.next();

            System.out.println("Please enter the Policyholder’s Height (in inches):");
            double heightInInches = scanner.nextDouble();

            System.out.println("Please enter the Policyholder’s Weight (in pounds):");
            double weightInPounds = scanner.nextDouble();

            policyHolders[i] = new PolicyHolder(policyNumberInput, providerName, firstName, lastName, age,
                    smokingStatus, heightInInches, weightInPounds);
        }

        for (PolicyHolder holder : policyHolders) {
            System.out.println(holder);
        }

        System.out.println("There were " + PolicyHolder.getNumOfPolicies() + " Policy objects created.");

        int smokers = 0;
        int nonSmokers = 0;
        for (PolicyHolder holder : policyHolders) {
            if (holder.smokingStatus.equalsIgnoreCase("smoker")) {
                smokers++;
            } else {
                nonSmokers++;
            }
        }

        System.out.println("The number of policies with a smoker is: " + smokers);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokers);

        scanner.close();
    }
}


