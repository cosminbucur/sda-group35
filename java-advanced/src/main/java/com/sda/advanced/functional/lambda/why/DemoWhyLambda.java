package com.sda.advanced.functional.lambda.why;

public class DemoWhyLambda {

    public static void main(String[] args) {
        // var 1: separate interface and implementation
        Cleanable cleanable = new CleanableImpl();
        cleanable.clean();

        // var: 2 anonymous class
        Cleanable anonymousClass = new Cleanable() {
            @Override
            public void clean() {
                System.out.println("cleaning");
            }
        };
        anonymousClass.clean();

        // var 3: with lambda expression
        // interface = (input) -> { body }
        Cleanable lambdaExpression = () -> {
            System.out.println("cleaning");
        };

        Cleanable simpleLambdaExpression = () -> System.out.println("cleaning");
    }
}
