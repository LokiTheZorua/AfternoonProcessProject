package prossess.controller;

import java.util.Scanner;

import prosses.model.PlayDohScircle;
import prosses.model.PlayDohRoll;

public class ProcessController
{
	public void start()
	{
		System.out.println("This is a practice project");
		System.out.println("By practiving I develp muscle memory");
		
		PlayDohScircle firstCircle = new PlayDohScircle();
		PlayDohScircle secondCircle;
		secondCircle =new PlayDohScircle();
		System.out.println("Look, I made a circle");
		System.out.println(firstCircle);
		System.out.println(secondCircle);
		
		PlayDohScircle thirdCircle = new PlayDohScircle(10);
		System.out.println(thirdCircle);
		
		PlayDohRoll firstRoll = new PlayDohRoll();
		PlayDohRoll secondRoll;
		secondRoll = new PlayDohRoll(1);
		System.out.println(firstRoll);
		System.out.println(secondRoll);
		
		Scanner myScanner = new Scanner (System.in);
		System.out.println("How big of a circle do you want?");
		int circleSize = myScanner.nextInt();
		
		
	}
}
