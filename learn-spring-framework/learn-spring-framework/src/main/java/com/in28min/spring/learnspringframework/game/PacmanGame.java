package com.in28min.spring.learnspringframework.game;

//@Component
public class PacmanGame implements GamingConsole {
	public void up() {
		System.out.println("PacmanGame jump");
	}

	public void down() {
		System.out.println("PacmanGame slide down");
	}

	public void left() {
		System.out.println("PacmanGame stop");
	}

	public void right() {
		System.out.println("PacmanGame accelerate");
	}
}
