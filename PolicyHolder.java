import java.util.Scanner;

class PolicyHolder {
    int policyNumber;
    String providerName;
    String firstName;
    String lastName;
    int age;
    String smokingStatus;
    double heightInInches;
    double weightInPounds;
    static int numOfPolicies = 0;

    PolicyHolder(int policyNumber, String providerName, String firstName, String lastName,
                 int age, String smokingStatus, double heightInInches, double weightInPounds) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
        numOfPolicies++;
    }

    public String toString() {
        return "Policy Number: " + policyNumber + "\n" +
                "Provider Name: " + providerName + "\n" +
                "Policyholder's First Name: " + firstName + "\n" +
                "Policyholder's Last Name: " + lastName + "\n" +
                "Policyholder's Age: " + age + "\n" +
                "Policyholder's Smoking Status (Y/N): " + smokingStatus + "\n" +
                "Policyholder's Height: " + heightInInches + " inches\n" +
                "Policyholder's Weight: " + weightInPounds + " pounds\n" +
                "Policyholder's BMI: " + String.format("%.2f", calculateBMI()) + "\n" +
                "Policy Price: $" + String.format("%.2f", calculatePolicyPrice()) + "\n";
    }

    private double calculateBMI() {
        return (weightInPounds * 703) / (heightInInches * heightInInches);
    }

    private double calculatePolicyPrice() {
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

    static int getNumOfPolicies() {
        return numOfPolicies;
    }
}



