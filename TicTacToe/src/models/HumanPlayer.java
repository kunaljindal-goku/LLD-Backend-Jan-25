package models;

import models.enums.PlayerType;

import java.util.Scanner;

public class HumanPlayer extends Player{
    private int age;
    private Scanner sc = new Scanner(System.in);

    public HumanPlayer(int id,
                       String name,
                       Symbol symbol,
                       int age) {
        super(id,name,symbol, PlayerType.HUMAN);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("Enter the row and column no");
        int row = sc.nextInt();
        int col = sc.nextInt();
        return new Move(this,new Cell(row,col));
    }
}
