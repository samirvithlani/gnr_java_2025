package com.oops;

public class Instagram {

	//01010 -->
	public int followers; //copy 4 copy
	
	public Instagram(int followersCount) {
		//200 -->200
		System.out.println("param const of instagram !!!");
		followers = followersCount; //200 //300 //1000 // 987
	}
	
	public int getFollowersCount () {
		//db logic...
		return followers; //01010
	}
	
	public static void main(String[] args) {
		
		Instagram neev =new Instagram(200);
		Instagram divya =new Instagram(300);
		Instagram raj =new Instagram(1000);
		Instagram vedant =new Instagram(987);
		
		System.out.println(neev.getFollowersCount());
		System.out.println(divya.getFollowersCount());
		System.out.println(raj.getFollowersCount());
		System.out.println(vedant.getFollowersCount());
	}
}
