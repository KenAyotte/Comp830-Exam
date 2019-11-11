import java.util.Random;

public class SumRandomNumbers {
	public int FindSum() {
		int total = 0;
		for (int i = 1; i<=10; i++) {
			System.out.println(GetRandomNumber());
			total += GetRandomNumber();
		}
		System.out.println(total);
		return total;
	}

	
	public int GetRandomNumber() {
		Random rand = new Random();
		int randomNum = rand.nextInt(100);
		return randomNum;
	}
	
public static void main (String[] args) {
	SumRandomNumbers SumRandomNumbers = new SumRandomNumbers();
	SumRandomNumbers.FindSum();
}
}
