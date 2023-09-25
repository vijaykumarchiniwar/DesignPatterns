package strategy;

public class Client {

    public static void main(String args[]) {
        StrategyContext context = new StrategyContext();
        context.setStrategy(new MergeSort());
        context.handle();

        context.setStrategy(new QuickSort());
        context.handle();
    }
}
