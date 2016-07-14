package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.image.PixelWriter;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class GameLifeController {
	
	private class myField{
		private myDot myDots[][];
		private int sizeX, sizeY;
		private  GraphicsContext gc;
		private int dotHeight=10;
		private int dotWidth=10;
		private int dotSpase=15;
		private GraphicsContext myGC;
		public myField(GraphicsContext parGC, int parW, int parH){
			myDots = new myDot[parW][parH];
			myGC = parGC;
			for(int i = 0;i<parH;i=i+dotSpase){
				for(int j = 0; j<parW;j=j+dotSpase){
					myDots[i][j] = new myDot();
					//parGC.getPixelWriter().setColor(i, j, myDots[i][j].myDotColor);
					setPoint(i,j,myDots[i][j].myDotColor);
				}
			i=i;
			}
			
		}
		//-----------------------------------------------
		public void setPoint(int x, int y, Color c){		
			for(int k = x;k<x+dotWidth;k++){					
						for(int n = y;n<y+dotHeight;n++){
							myGC.getPixelWriter().setColor(k, n, c);
						}					
					}			
		}

		public int getSizeX() {
			return sizeX;
		}
		public void setSizeX(int sizeX) {
			this.sizeX = sizeX;
		}
		public int getSizeY() {
			return sizeY;
		}
		public void setSizeY(int sizeY) {
			this.sizeY = sizeY;
		} 		
	}
	
	
	/**
	 * @author Betelgaze
	 *
	 */
	public class myDot{
		private  Color myDotColor;
		private int myDotFriends;
		public myDot(){
			myDotColor = Color.BLACK;
			myDotFriends = 0;
		};
		public myDot(Color c){
			myDotColor = c;
			myDotFriends = 0;
		};

	}
//	
	private myDot myDots[][];
	@FXML
	private Canvas Field;
	@FXML
	private Button Calc;
	public GraphicsContext gc;
	public PixelWriter pw;
	int gw = 600;
	int gh = 600;
	private myField John;
	// Event Listener on Button[#Calc].onMouseClicked
	@FXML
	public void onMouseCalcClicked(MouseEvent event) {
//		// TODO Autogenerated
//		gc = Field.getGraphicsContext2D();
		//pw = gc.getPixelWriter();
//		for(int i = 2;i<gh;i = i+5){
//			
//			for(int j = 2;j<gw; j = j+5){
//				// Dot
//				setPoint(i,j,Color.rgb(i>255?100:i, j>255?100:j, 128));
//				
//			}
		
		
//			
//		}
		John = new myField(Field.getGraphicsContext2D(), gw, gh);
/*		myDots=new myDot[gw][gh];
		for(int i = 0;i<gh;i++){
			for(int j = 0; j<gw;j++){
				myDots[i][j] = new myDot(Color.RED);
				pw.setColor(i, j, myDots[i][j].myDotColor);
				//setPoint(i,j,myDots[i][j].myDotColor);
				
			}

		}
	*/	
	}
/*	public void setPoint(int x, int y, Color c){
		
		for(int k = x-2;k<x+2;k++){
					
					for(int n = y-2;n<y+2;n++){
						pw.setColor(k, n, c);
					}
					
				}
				
	}*/
}

