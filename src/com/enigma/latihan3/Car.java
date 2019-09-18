package com.enigma.latihan3;

import java.util.Arrays;

public class Car {
private Integer postX;
private Integer postY;

private Integer fuel = 0;
private String Left = "L";
private String Right = "R";
private String Forward = "F";
private String Backward = "B";

char [] commands;

public Car(Integer postX, Integer postY) {
	this.postX = postX;
	this.postY = postY;
	}

public void move(Character movement) {
	if(movement.equals('R')) {
		this.postX = this.postX + 1;
	}else if(movement.equals('L')) {
		this.postX = this.postX - 1;
	}else if(movement.equals('F')){
		this.postY = this.postY + 1;
	}else if(movement.equals('B')) {
		this.postY = this.postY - 1;
	}else {
		System.out.println("Your input is wrong");
	}
	
}

public void setCommand(String command) {
	this.commands = command.toCharArray();
}

public void run() {
	for (int i = 0; i < this.commands.length; i++) {
		move(this.commands[i]);
		System.out.println(this.commands[i]);
	}
}

public String print() {
	return "Car [postX=" + postX + ", postY=" + postY + ", commands=" + Arrays.toString(commands)
			+ "]";
}



}
