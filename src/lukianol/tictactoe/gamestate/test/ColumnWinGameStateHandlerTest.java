package lukianol.tictactoe.gamestate.test;

import static org.junit.Assert.*;
import lukianol.tictactoe.GameState;
import lukianol.tictactoe.GameBase;
import lukianol.tictactoe.TicTacToeException;
import lukianol.tictactoe.gamestate.ColumnWinGameStateHandler;
import lukianol.tictactoe.gamestate.GameStateResult;

import org.junit.Test;

public class ColumnWinGameStateHandlerTest {
	
	@Test
	public void testHandleState() throws TicTacToeException {
		GameBase game = GameFactory.createColumnStrokedGame();
		ColumnWinGameStateHandler handler = new ColumnWinGameStateHandler();
		GameStateResult result = handler.handleState(game);
		assertNotNull(result.getWinnerStroke());
		assertEquals(GameState.Won, result.getGameState());
		assertEquals(game.getPlaygroundSize(), result.getWonPositions().length);		
	}

}
