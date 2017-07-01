package myCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ball {
//	BallProperties bp;
//	public Ball(BallProperties bp){
//		this.bp = bp;
//	}
	private String color;
	private int size;
	Ball(){
		
	}
	
	public Ball(String color, int size) {
		this.color = color;
		this.size = size;
	}

	//get count of ball of given color 
	public static int getColorCount(String color, List<Ball> b){
		int count = 0;
		Iterator<Ball> i = b.iterator();
		while(i.hasNext()){
			Ball b1 = (Ball) i.next();
			if(b1.color.equals(color))
				count++;
		}
		return count;
	}
	
	//get count of ball of given size
	public static int getCountSize(int size , List<Ball> b){
		int count = 0;
		Iterator<Ball> i = b.iterator();
		while(i.hasNext()){
			Ball b1 = (Ball) i.next();
			if(b1.size == size)
				count++;
		}
		return count;
		
	}
	
	public static int getCount(String color , int size , List<Ball> b){
		
		int count = 0;
		Iterator<Ball> i = b.iterator();
		while(i.hasNext()){
			Ball b1 = (Ball) i.next();
			if(b1.color.equals(color) && b1.size == size)
				count++;
		}
		return count;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Ball> ball = new ArrayList<>();
		ball.add(new Ball("Red",2));
		ball.add(new Ball("Red",4));
		ball.add(new Ball("Red",6));
		ball.add(new Ball("Red",2));
		ball.add(new Ball("Red",4));
		ball.add(new Ball("Red",6));
		ball.add(new Ball("Green",2));
		ball.add(new Ball("Green",4));
		ball.add(new Ball("Green",6));
		ball.add(new Ball("Blue",2));
		ball.add(new Ball("Blue",4));
		ball.add(new Ball("Blue",6));
		ball.add(new Ball("Blue",2));
		ball.add(new Ball("Blue",4));
		ball.add(new Ball("Blue",6));
		ball.add(new Ball("Green",2));
		ball.add(new Ball("Blue",4));
		ball.add(new Ball("Green",6));
		ball.add(new Ball("Red",2));
		ball.add(new Ball("Red",4));
		ball.add(new Ball("Red",6));
		ball.add(new Ball("Red",2));
		ball.add(new Ball("Red",4));
		ball.add(new Ball("Red",6));
		ball.add(new Ball("Green",2));
		ball.add(new Ball("Green",4));
		ball.add(new Ball("Green",6));
		ball.add(new Ball("Blue",2));
		ball.add(new Ball("Blue",4));
		ball.add(new Ball("Blue",6));
		ball.add(new Ball("Blue",2));
		ball.add(new Ball("Blue",4));
		ball.add(new Ball("Blue",6));
		ball.add(new Ball("Red",6));
		ball.add(new Ball("Green",6));
		ball.add(new Ball("Blue",2));
		
		System.out.println("Total number of Ball in List : "+ball.size());
		System.out.println("Number of RED Balls :"+Ball.getColorCount("Red", ball));
		System.out.println("Number of Blue Balls :"+Ball.getColorCount("Blue", ball));
		System.out.println("Number of Green Balls :"+Ball.getColorCount("Green", ball));
		System.out.println("Number of 2 size Balls :"+Ball.getCountSize(2,ball));
		System.out.println("Number of 4 size Balls :"+Ball.getCountSize(4,ball));
		System.out.println("Number of 6 size Balls :"+Ball.getCountSize(6,ball));
		System.out.println("Number of balls having color Red with size 4: "+Ball.getCount("Red", 4, ball));
		System.out.println("Number of balls having color Blue with size 2: "+Ball.getCount("Blue", 2, ball));
		

	}

}
