import java.util.Scanner;

public class Policy {
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double heightInInches;
    private double weightInPounds;

    // Default constructor
    public Policy() {
    }

    // Parameterized constructor for Policy class
    public Policy(int policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double heightInInches, double weightInPounds) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    // Retrieves the policy number
    public int getPolicyNumber() {
        return policyNumber;
    }

    // Sets the policy number
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    // Retrieves the insurance provider's name
    public String getProviderName() {
        return providerName;
    }

    // Sets the insurance provider's name
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    // Retrieves the policyholder's first name
    public String getFirstName() {
        return firstName;
    }

    // Sets the policyholder's first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Retrieves the policyholder's last name
    public String getLastName() {
        return lastName;
    }

    // Sets the policyholder's last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Retrieves the policyholder's age
    public int getAge() {
        return age;
    }

    // Sets the policyholder's age
    public void setAge(int age) {
        this.age = age;
    }

    // Retrieves the policyholder's smoking status
    public String getSmokingStatus() {
        return smokingStatus;
    }

    // Sets the policyholder's smoking status
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    // Retrieves the policyholder's height in inches
    public double getHeightInInches() {
        return heightInInches;
    }

    // Sets the policyholder's height in inches
    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    // Retrieves the policyholder's weight in pounds
    public double getWeightInPounds() {
        return weightInPounds;
    }

    // Sets the policyholder's weight in pounds
    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    // Calculates the Body Mass Index (BMI) of the policyholder
    public double calculateBMI() {
        return (weightInPounds * 703) / (heightInInches * heightInInches);
    }

    // Calculates the price of the policy based on various factors
    public double calculatePolicyPrice() {
        double baseFee = 600.0;
        double policyPrice = baseFee;
        if (age > 50) {
            policyPrice += 75.0;
        }
        if (smokingStatus.equalsIgnoreCase("smoker")) {
            policyPrice += 100.0;
        }
        double bmi = calculateBMI();
        if (bmi > 35) {
            policyPrice += (bmi - 35) * 20;
        }
        return policyPrice;
    }

    // Displays details of the policy including policy number, provider name, policyholder's details, BMI, and policy price
    public void displayPolicyDetails() {
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Provider Name: " + providerName);
        System.out.println("Policyholder’s First Name: " + firstName);
        System.out.println("Policyholder’s Last Name: " + lastName);
        System.out.println("Policyholder’s Age: " + age);
        System.out.println("Policyholder’s Smoking Status: " + smokingStatus);
        System.out.println("Policyholder’s Height: " + heightInInches + " inches");
        System.out.println("Policyholder’s Weight: " + weightInPounds + " pounds");
        System.out.printf("Policyholder’s BMI: %.2f\n", calculateBMI());
        System.out.printf("Policy Price: $%.2f\n", calculatePolicyPrice());
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the Policy Number:");
        int policyNumber = scanner.nextInt();

        System.out.println("Please enter the Provider Name:");
        String providerName = scanner.next();

        System.out.println("Please enter the Policyholder’s First Name:");
        String firstName = scanner.next();

        System.out.println("Please enter the Policyholder’s Last Name:");
        String lastName = scanner.next();

        System.out.println("Please enter the Policyholder’s Age:");
        int age = scanner.nextInt();

        System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker):");
        String smokingStatus = scanner.next();

        System.out.println("Please enter the Policyholder’s Height (in inches):");
        double heightInInches = scanner.nextDouble();

        System.out.println("Please enter the Policyholder’s Weight (in pounds):");
        double weightInPounds = scanner.nextDouble();

        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age,
                smokingStatus, heightInInches, weightInPounds);

        policy.displayPolicyDetails();

        scanner.close();
    }
}

