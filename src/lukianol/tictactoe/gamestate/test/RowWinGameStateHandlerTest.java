package lukianol.tictactoe.gamestate.test;

import static org.junit.Assert.*;
import lukianol.tictactoe.GameState;
import lukianol.tictactoe.GameBase;
import lukianol.tictactoe.TicTacToeException;
import lukianol.tictactoe.gamestate.GameStateResult;
import lukianol.tictactoe.gamestate.RowWinGameStateHandler;

import org.junit.Test;

public class RowWinGameStateHandlerTest {

	@Test
	public void testHandleState() throws TicTacToeException {
		GameBase game = GameFactory.createRowStrokedGame();
		RowWinGameStateHandler handler = new RowWinGameStateHandler();
		GameStateResult result = handler.handleState(game);
		assertNotNull(result.getWinnerStroke());
		assertEquals(GameState.Won, result.getGameState());
		assertEquals(game.getPlaygroundSize(), result.getWonPositions().length);
	}

}
