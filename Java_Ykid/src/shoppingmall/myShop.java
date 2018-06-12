package shoppingmall;

import java.util.*;
//IShop 인터페이스의 구현클래스 
public class myShop implements IShop {
	
	//회원 정보 등록을 위한 배열 선언
	User[] users = new User[2];
	
	//상품 정보 등록을 위한 배열 선언
	Product[] products = new Product[4];
	
	//상품 추가를 위한 장바구니
	ArrayList<Product> cart = new ArrayList<Product>();
	
	Scanner scan = new Scanner(System.in);
	
	int selUser;
	String title;
	
	@Override
	public void setTitle(String title) {
		this.title=title;
		
	}

	@Override
	public void genUser() {
		User user = new User("홍길동",PayType.CARD);
		users[0]=user;
		user = new User("스타벅",PayType.CASH);
		users[1]=user;
		
	}

	@Override
	public void genProduct() {
		CellPhone cp = new CellPhone("갤럭시", 690000,"SK");
		products[0]=cp;
		cp = new CellPhone("아이폰", 990000,"KT");
		products[1]=cp;
		SmartTv st = new SmartTv("삼성 3D Smart TV", 5000000, "4K");
		products[2]=st;
		st = new SmartTv("LG Smart TV", 3000000, "UHD");
		products[3]=st;
		
		
	}

	@Override
	public void start() {
		
		System.out.println(title+" : 메인화면 - 계정선택");
		System.out.println("=======================");
		/*for(int i=0;i<users.length;i++) {
			System.out.println("["+i+"]"+users[i].getName()+users[i].getPayType());
		}*/
		int i=0;
		for(User u : users) {
			
			System.out.println("["+(i++)+"]"+u.getName()+u.getPayType());
		}
		System.out.println("[x]종료");
		System.out.print("선택 : ");
		String sel = scan.next();
		System.out.println("## "+sel + "선택 ##");
		
		switch(sel) {
			case "x" : System.exit(0);
			break;
			default :
				selUser = Integer.parseInt(sel);
				productList();
		}
		
	}
	public void productList() {
		System.out.println(title+" : 상품목록 - 상품선택");
		System.out.println("=======================");
		int i=0;
		for(Product p : products) {
			System.out.print("["+(i++)+"]");
			p.printDetail();
		}
		System.out.println("[h]메인화면");
		System.out.println("[c]체크아웃");
		System.out.print("선택 : ");
		String sel = scan.next();
		System.out.println("## "+sel + "선택 ##");
		switch(sel) {
			case "h" : start();
			break;
			case "c" : checkOut();
			break;
			default :
			int psel = Integer.parseInt(sel);
			cart.add(products[psel]);
			productList();
			
		}
	}
	public void checkOut() {
		System.out.println(title+" : 체크아웃");
		System.out.println("=======================");
		int total=0;
		int i=0;
		
		//장바구니에 담긴 상품 정보 출력
		for(Product p : cart) {
			System.out.println("["+(i++)+"]"+p.pName+p.price);
			total = total + p.price;
		}
		System.out.println("=======================");
		
		System.out.println("결제 방법"+users[selUser].getPayType());
		
		System.out.println("합계 : "+total+" 원 입니다.");
		System.out.println("[p]이전, [q]결제 완료");
		System.out.print("선택 : ");
		String sel = scan.next();
		
		switch(sel) {
		case "p":
			productList();
			break;
		case "q":
			System.out.println("결제가 완료되었습니다. 종료합니다.");
			System.exit(0);
			break;
		default : 
			checkOut();
		}
		
	}

}
