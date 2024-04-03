
import java.util.Scanner;

/**
 * Represents a policy with various attributes such as policy number or provider name.
 */
public class Policy {
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double heightInInches;
    private double weightInPounds;

    /**
     * Default constructor for Policy class.
     */
    public Policy() {
        // Default constructor
    }

    /**
     * Constructor with parameters for Policy class.
     *
     * @param policyNumber      The policy number.
     * @param providerName      The name of the insurance provider.
     * @param firstName         The first name of the policyholder.
     * @param lastName          The last name of the policyholder.
     * @param age               The age of the policyholder.
     * @param smokingStatus     The smoking status of the policyholder.
     * @param heightInInches    The height of the policyholder in inches.
     * @param weightInPounds    The weight of the policyholder in pounds.
     */
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

    /**
     * Retrieves the policy number.
     *
     * @return The policy number.
     */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the policy number.
     *
     * @param policyNumber The policy number to set.
     */
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    /**
     * Retrieves the name of the insurance provider.
     *
     * @return The name of the insurance provider.
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the name of the insurance provider.
     *
     * @param providerName The name of the insurance provider to set.
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * Retrieves the first name of the policyholder.
     *
     * @return The first name of the policyholder.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the policyholder.
     *
     * @param firstName The first name of the policyholder to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Retrieves the last name of the policyholder.
     *
     * @return The last name of the policyholder.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the policyholder.
     *
     * @param lastName The last name of the policyholder to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Retrieves the age of the policyholder.
     *
     * @return The age of the policyholder.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the policyholder.
     *
     * @param age The age of the policyholder to set.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Retrieves the smoking status of the policyholder.
     *
     * @return The smoking status of the policyholder.
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /**
     * Sets the smoking status of the policyholder.
     *
     * @param smokingStatus The smoking status of the policyholder to set.
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    /**
     * Retrieves the height of the policyholder in inches.
     *
     * @return The height of the policyholder in inches.
     */
    public double getHeightInInches() {
        return heightInInches;
    }

    /**
     * Sets the height of the policyholder in inches.
     *
     * @param heightInInches The height of the policyholder in inches to set.
     */
    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    /**
     * Retrieves the weight of the policyholder in pounds.
     *
     * @return The weight of the policyholder in pounds.
     */
    public double getWeightInPounds() {
        return weightInPounds;
    }

    /**
     * Sets the weight of the policyholder in pounds.
     *
     * @param weightInPounds The weight of the policyholder in pounds to set.
     */
    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    /**
     * Calculates the Body Mass Index (BMI) of the policyholder.
     *
     * @return The BMI of the policyholder.
     */
    public double calculateBMI() {
        return (weightInPounds * 703) / (heightInInches * heightInInches);
    }

    /**
     * Calculates the price of the policy based on various factors such as age, smoking status, and BMI.
     *
     * @return The price of the policy.
     */
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

    /**
     * Displays the details of the policy including policy number, provider name, policyholder's information, BMI, and policy price.
     */
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

   
