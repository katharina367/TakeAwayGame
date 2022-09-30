
public class WinningStrategy implements Strategy{
		
	private int min;
	private int max;
		
	public WinningStrategy(int min, int max) {
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
		int a = TokenContainer.instance().getSize() % (max+1);
		if(a == 0) return min;
		return a;
	}

	
}
