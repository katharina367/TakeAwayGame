import java.util.Random;

public class RandomStrategy implements Strategy{
	
	private Random rng = new Random();
	private int min;
	private int max;
	
	public RandomStrategy(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	public int getMin() {
		return min;
	}
	
	public int getMax() {
		return max;
	}
	
	public void setMin(int min) {
		this.min = min;
	}
	
	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public int calculateNextMove() {
		return rng.nextInt(getMin(),getMax()+1);
	}

	
}
