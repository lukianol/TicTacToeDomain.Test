package lukianol.tictactoe.gamestate.test;

import lukianol.tictactoe.Field;
import lukianol.tictactoe.GameEventListener;
import lukianol.tictactoe.GameState;
import lukianol.tictactoe.IGame;
import lukianol.tictactoe.Position;
import lukianol.tictactoe.StrokeKind;
import lukianol.tictactoe.TicTacToeException;

public final class StubGame implements IGame {
	
	private int _size;
	private Field[][] _fields;
	
	public StubGame(Field[][] fields, int size){
		
		if (fields == null)
			throw new IllegalArgumentException();
		
		if (fields.length != size)
			throw new IllegalArgumentException();
		
		for(Field[] sub : fields){
			if (sub.length != size)
				throw new IllegalArgumentException();
		}
		
		_size = size;
		_fields = fields;
	}

	@Override
	public void Stroke(Position position) throws TicTacToeException {
		throw new UnsupportedOperationException();
	}

	@Override
	public StrokeKind getCurrentStroke() {
		throw new UnsupportedOperationException();
	}

	@Override
	public GameState getGameState() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addGameEventListener(GameEventListener listener) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeGameEventListener(GameEventListener listener) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Field getField(Position position) {
		return getField(position.getColumn(), position.getRow());
	}

	@Override
	public int getPlaygroundSize() {
		return _size;
	}

	@Override
	public Field getField(int column, int row) {
		return _fields[column][row];
	}

	@Override
	public Boolean isPlaying() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Position[] getWonPositions() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
