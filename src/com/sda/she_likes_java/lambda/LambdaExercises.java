package com.sda.she_likes_java.lambda;

public class LambdaExercises {
    public static void main(String[] args) {
        Jogging slowman = new SlowRun();
        Jogging fastrunner = new FastRun();

        justRun(slowman);
        System.out.println("and now fast \n");
        justRun(fastrunner);

        //creating anonymous class
        Jogging midRun = new Jogging() {
            @Override
            public void run() {

            }
        };

        // Jogging doesn't need any arguments for run hence () and has no return from run hence {}
        Jogging firstLambda = () -> {};
        Jogging secondLambda = () -> {
            System.out.println("this is second Lambda");
        };

        justRun(secondLambda);

        //direct impr=lementation of Lambda when calling justRun
        justRun(() -> {
            System.out.println("in place:)");
        });
    }
    public static void justRun(Jogging jog){
        jog.run();
    }
}
