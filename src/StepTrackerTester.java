public class StepTrackerTester {
    public static void main(String[] args) {
        StepTracker test = new StepTracker(10000);

        test.addDailySteps(100);
        System.out.println(test.activeDays());
        System.out.println(test.averageSteps());
        test.addDailySteps(1500);
        System.out.println(test.activeDays());
        System.out.println(test.averageSteps());
        test.addDailySteps(1400);
        System.out.println(test.activeDays());
        System.out.println(test.averageSteps());
    }
}
