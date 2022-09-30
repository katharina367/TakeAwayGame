import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class TokenContainer implements Iterable<Token>{

	private static TokenContainer unique = null;
	private ArrayList<Token> tokens = new ArrayList<Token>();
	
	private TokenContainer() {}
	
	public static TokenContainer instance() {
		if(unique == null) unique = new TokenContainer();
		return unique;
	}
	
	public void linkToken(Token token) {
		if(!tokens.contains(token)) tokens.add(token);
	}
	
	public void unlinkToken (Token token) {
		if(!tokens.isEmpty())tokens.remove(token);
	}
	
	public ArrayList<Token> getLinkToken() {
		ArrayList<Token> copy = new ArrayList<Token>(tokens);
		return copy;
	}
	
	public void unlinkAnyToken() {
		if(!tokens.isEmpty()) {
			Random r = new Random();
			tokens.remove(r.nextInt(tokens.size()));
		}	
	}
	
	public void clear() {
		tokens.clear();
	}
	
	public int getSize() {
		return tokens.size();
	}
	
	@Override
	public Iterator<Token> iterator() {
		return tokens.iterator();
	}
	
	
	
}
