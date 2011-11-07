package lukianol.tictactoe.test;

import static org.junit.Assert.*;
import lukianol.tictactoe.Field;
import lukianol.tictactoe.Position;
import lukianol.tictactoe.StrokeKind;
import lukianol.tictactoe.TicTacToeException;

import org.junit.Test;

public class FieldTest {

	@Test
	public void canNotSetStrokeTwice() {
		Field field = new Field(Position.Create(0, 0));
		try {
			field.setStroke(StrokeKind.X);
			field.setStroke(StrokeKind.O);
			fail("You can not set stroke twice for one field");
		} catch (TicTacToeException e) {
			
		}
		
	}

}
