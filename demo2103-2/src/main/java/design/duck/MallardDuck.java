package design.duck;

public class MallardDuck extends Duck {
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack(); // 이 부분이 없으면 터짐
	}
	@Override
	public void display() {
		System.out.println("나는 청둥 오리입니다.");
	}
}
