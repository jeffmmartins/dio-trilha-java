//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AutoPolicy autoPolicy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
        AutoPolicy autoPolicy2 = new AutoPolicy(22222222, "Ford Fusion", "MF");

        policyInNoFaultState(autoPolicy1);
        policyInNoFaultState(autoPolicy2);
    }

    public static void policyInNoFaultState (AutoPolicy policy){
        System.out.println("The auto policy");
        System.out.printf("Account #: %d; Car: %s;  State: %s %s a no-fault state%n%n",
                policy.getAccountNumber(),policy.getMakeANdModel(),
                policy.getSatate(),
                (policy.isNoFaultState() ? "is" : "is not"));
    }
}