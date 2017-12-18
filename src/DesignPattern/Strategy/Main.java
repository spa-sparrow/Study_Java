package DesignPattern.Strategy;

public class Main {
	public static void main(String[] args) {
		// 500円のコミック
		Book comic = new Book(500);
		
		// 2500円の技術書
		Book technicalBook = new Book(2500);
		
		// 割引価格計算用ストラテジー
		Strategy discountStrategy = new DiscountStrategy();
		// 特別割引価格計算用ストラテジー
		Strategy specialDiscountStrategy = new SpecialDiscountStrategy();
		
		// コミックに、割引を適用
		Shop shop = new Shop(discountStrategy);
		shop.sell(comic);
		System.out.println("割引後金額は、" + comic.getAmount() + "円" );
		
		// 技術書に、特別割引を適用
		shop.setStrategy(specialDiscountStrategy); //shopインスタンスを使いまわせるのがメリット
		shop.sell(technicalBook);
		System.out.println("割引後金額は、" + technicalBook.getAmount() + "円" );
	}
}
