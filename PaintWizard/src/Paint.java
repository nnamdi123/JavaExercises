
public class Paint {
	
	private String paintName;
	private int paintSize;
	private double paintCost;
	
	public Paint(String paintName, int paintSize, double paintCost) {
		
		this.paintName = paintName;
		this.paintSize = paintSize;
		this.paintCost = paintCost;
	}

	public String getPaintName() {
		return paintName;
	}

	public void setPaintName(String paintName) {
		this.paintName = paintName;
	}

	public int getPaintSize() {
		return paintSize;
	}

	public void setPaintSize(int paintSize) {
		this.paintSize = paintSize;
	}

	public double getPaintCost() {
		return paintCost;
	}

	public void setPaintCost(double paintCost) {
		this.paintCost = paintCost;
	}
	
	public static void main(String [] args) {
		
		Paint cm = new Paint("CheapoMax", 20, 19.99);
		Paint aj = new Paint("AverageJoes", 15, 17.99);
		Paint dp = new Paint("DuluxPaints", 10, 25);
		
		
	}
	
	public void paintMatch () {
		
	
	}

}
