
public class Robot{
	private Strategy strategy;
	
	public Robot(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public Strategy getStrategy() {
		return strategy;
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int calculateNextMove() {
		return strategy.calculateNextMove();
	}
}
