package lukianol.tictactoe.gamestate.test;

import static org.junit.Assert.*;
import lukianol.tictactoe.GameState;
import lukianol.tictactoe.IGame;
import lukianol.tictactoe.TicTacToeException;
import lukianol.tictactoe.gamestate.GameStateResult;
import lukianol.tictactoe.gamestate.NeDiagWinGameStateHandler;
import org.junit.Test;

public class NeDiagWinGameStateHandlerTest {

	@Test
	public void testHandleState() throws TicTacToeException {
		IGame game = GameFactory.createNeStrokedGame();
		NeDiagWinGameStateHandler handler = new NeDiagWinGameStateHandler();
		GameStateResult result = handler.handleState(game);
		assertNotNull(result.getWinnerStroke());
		assertEquals(GameState.Won, result.getGameState());
		assertEquals(game.getPlaygroundSize(), result.getWonPositions().length);
	}

}
