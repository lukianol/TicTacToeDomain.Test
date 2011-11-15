	package lukianol.tictactoe.gamestate.test;

import static org.junit.Assert.*;
import lukianol.tictactoe.GameState;
import lukianol.tictactoe.GameBase;
import lukianol.tictactoe.TicTacToeException;
import lukianol.tictactoe.gamestate.GameStateResult;
import lukianol.tictactoe.gamestate.PlayingOrDrawnGameStateHandler;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlayingOrDrawnGameStateHandlerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void emptyPlaygroundIsPlaying() throws TicTacToeException {
		
		GameBase game = GameFactory.createJustStartedGame();
		PlayingOrDrawnGameStateHandler handler = new  PlayingOrDrawnGameStateHandler();
		GameStateResult result = handler.handleState(game);
		
		assertNull(result.getWinnerStroke());
		assertNull(result.getWonPositions());
		assertEquals(result.getGameState(), GameState.Playing);

	}
	
	@Test
	public void almostFullfilPlaygroundIsPlaying() throws TicTacToeException {
		
		GameBase game = GameFactory.createAlmostFullfilGame();
		PlayingOrDrawnGameStateHandler handler = new  PlayingOrDrawnGameStateHandler();
		GameStateResult result = handler.handleState(game);
		
		assertNull(result.getWinnerStroke());
		assertNull(result.getWonPositions());
		assertEquals(result.getGameState(), GameState.Playing);

	}
	
	@Test
	public void filledPlaygroundIsDrawn() throws TicTacToeException {
		
		GameBase game = GameFactory.createDrawnGame();
		PlayingOrDrawnGameStateHandler handler = new  PlayingOrDrawnGameStateHandler();
		GameStateResult result = handler.handleState(game);
		
		assertNull(result.getWinnerStroke());
		assertNull(result.getWonPositions());
		assertEquals(result.getGameState(), GameState.Drawn);

	}
	

}
