package lukianol.tictactoe.gamestate.test;

import lukianol.tictactoe.Field;
import lukianol.tictactoe.GameBase;
import lukianol.tictactoe.Position;
import lukianol.tictactoe.StrokeKind;
import lukianol.tictactoe.TicTacToeException;

public class GameFactory {

	public static GameBase createJustStartedGame() throws TicTacToeException {
		
		Field[][] fields = {
				{F(0, 0, null), F(0, 1, null), F(0, 2, null),},
				{F(1, 0, null), F(1, 1, null), F(1, 2, null),},
				{F(2, 0, null), F(2, 1, null), F(2, 2, null),}
			};
		
		return new StubGame(fields, 3);
	}
	
	public static GameBase createAlmostFullfilGame() throws TicTacToeException {
		
		Field[][] fields = {
				{F(0, 0, StrokeKind.O), F(0, 1, StrokeKind.X), F(0, 2, StrokeKind.X),},
				{F(1, 0, StrokeKind.X), F(1, 1, StrokeKind.X), F(1, 2, StrokeKind.O),},
				{F(2, 0, StrokeKind.O), F(2, 1, StrokeKind.O), F(2, 2, null),}
			};
		
		return new StubGame(fields, 3);
	}
	
	public static GameBase createDrawnGame() throws TicTacToeException {
		
		Field[][] fields = {
				{F(0, 0, StrokeKind.O), F(0, 1, StrokeKind.X), F(0, 2, StrokeKind.X),},
				{F(1, 0, StrokeKind.X), F(1, 1, StrokeKind.X), F(1, 2, StrokeKind.O),},
				{F(2, 0, StrokeKind.O), F(2, 1, StrokeKind.O), F(2, 2, StrokeKind.X),}
			};
		
		return new StubGame(fields, 3);
	}
	
	public static GameBase createColumnStrokedGame() throws TicTacToeException{
		Field[][] fields = {
				{F(0, 0, StrokeKind.O), F(0, 1, StrokeKind.X), F(0, 2, StrokeKind.X),},
				{F(1, 0, StrokeKind.X), F(1, 1, StrokeKind.O), F(1, 2, StrokeKind.O),},
				{F(2, 0, StrokeKind.X), F(2, 1, StrokeKind.X), F(2, 2, StrokeKind.X),}
			};
		
		return new StubGame(fields, 3);
	}

	public static GameBase createRowStrokedGame() throws TicTacToeException {
		
		Field[][] fields = {
				{F(0, 0, StrokeKind.O), F(0, 1, StrokeKind.X), F(0, 2, StrokeKind.X),},
				{F(1, 0, StrokeKind.X), F(1, 1, StrokeKind.O), F(1, 2, StrokeKind.X),},
				{F(2, 0, StrokeKind.O), F(2, 1, StrokeKind.O), F(2, 2, StrokeKind.X),}
			};
		
		return new StubGame(fields, 3);
	}

	public static GameBase createNwStrokedGame() throws TicTacToeException {
		
		Field[][] fields = {
				{F(0, 0, StrokeKind.O), F(0, 1, StrokeKind.X), F(0, 2, StrokeKind.X),},
				{F(1, 0, StrokeKind.X), F(1, 1, StrokeKind.O), F(1, 2, StrokeKind.O),},
				{F(2, 0, StrokeKind.O), F(2, 1, StrokeKind.X), F(2, 2, StrokeKind.O),}
			};
		
		return new StubGame(fields, 3);
	}
	
	public static GameBase createNeStrokedGame() throws TicTacToeException {
		
		Field[][] fields = {
				{F(0, 0, StrokeKind.O), F(0, 1, StrokeKind.X), F(0, 2, StrokeKind.X),},
				{F(1, 0, StrokeKind.X), F(1, 1, StrokeKind.X), F(1, 2, StrokeKind.O),},
				{F(2, 0, StrokeKind.X), F(2, 1, StrokeKind.O), F(2, 2, StrokeKind.X),}
			};
		
		return new StubGame(fields, 3);
	}
	
	
	private static Field F(int column, int row, StrokeKind stroke) throws TicTacToeException{
		Field field =  new Field(Position.Create(column, row));
		field.setStroke(stroke);
		return field;
	}	

}

