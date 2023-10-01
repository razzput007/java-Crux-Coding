package Lec50;
import java.util.*;
public class Cars {
	int speed;
	String Color;
	int price;
	
	public Cars(int speed,String Color,int price) {
		this.speed=speed;
		this.Color=Color;
		this.price=price;
	}
	@Override
	public String toString() {
		return this.speed +" s "+this.Color+" c "+this.price+" p ";
	}

}
