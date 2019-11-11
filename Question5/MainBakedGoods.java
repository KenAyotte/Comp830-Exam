public class MainBakedGoods {
	
	public static void main(String[] args) {
		Cookie cookie = new Cookie();
		CinnamonRoll roll = new CinnamonRoll();
		Brownie brownie = new Brownie();
		
		System.out.println(cookie.getPrice());
		System.out.println(roll.getPrice());
		System.out.println(brownie.getPrice());

		System.out.println(cookie.getDescription());
		System.out.println(roll.getDescription());
		System.out.println(brownie.getDescription());
		
		System.out.println(cookie.getSellByDate());
		System.out.println(roll.getSellByDate());
		System.out.println(brownie.getSellByDate());
		
	}

}
