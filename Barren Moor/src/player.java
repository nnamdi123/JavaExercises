
public class player{
		
		String name;
		int lives = 5;
		int x;
		int y;
		
		
		public player(String name) {
			this.name = name;
			
		}
		
		public void movePlayer(int x,int y) {
			this.x = x;
			this.y = y;
		}	
			
			
			
						
		public void spawn() {
			/*
			 * Do spawn
				when die() = true
			 */
		}

		public void die() {
			
		}
	}