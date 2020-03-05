package chap06;

public class FinalMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorldChess w = new WorldChess();
		w.getFirstPlayer();

	}

}

class Chess {
	enum ChessPlayer {WHITE, BLACK}
	
	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.WHITE;
	}
}

class WorldChess extends Chess {
	// 부모 클래스 
//	ChessPlayer getFirstPlayer() {
//	System.out.println("체스 플레이어는 : " + ChessPlayer.WHITE);
//	return ChessPlayer.WHITE;	
//	}
}
