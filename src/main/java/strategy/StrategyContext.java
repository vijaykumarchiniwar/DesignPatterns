package strategy;

public class StrategyContext {
    Strategy strategy;


    public Strategy getStrategy() {
        return strategy;
    }


    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }


    public void handle() {
        strategy.handle();
    }
}
