package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;

public class ConstrController {
	@FXML
	private TextField p1;
	@FXML
	private TextField p2;
	@FXML
	private TextField p3;
	@FXML
	private TextField p4;
	@FXML
	private TextField p5;
	@FXML
	private Button btnCalc;
		Integer i1,i2,i3,sum;
	// Event Listener on Button[#btnCalc].onMouseClicked
	@FXML
	public void btnCalcClick(MouseEvent event) {
		// TODO Autogenerated

		String Buf;
		i1 = Integer.valueOf(p1.getText());
		i2 = Integer.valueOf(p2.getText());

		/*
		if(i1>i2){
			Buf = "������ ������";
		} else if(i1==i2) {
			Buf = "��� �����";	
		} else {
			
			Buf = "������ ������";
		}
	
		sum = 0;
		for(i3=i1;i3<=i2;i3++){
			sum = sum+i3;			
		}
	
		//i3 = i1 % 2;
	
		Integer from,to;
		from = i1;
		if(from % 2 != 0){
			from++;
		} 
		to = i2;
		
		sum = 0;
		for(i3=from;i3<=to;i3=i3+2){
			sum = sum+i3;
		}
		
		sum=mySum(3,5);
		
		
		p3.setText(sum.toString());
		int max;
		max = myMax(6,88);
		*/		
/*		boolean divide= isSimple(i1);
		if(){
	System.out.println("Simple");
		}else{
			System.out.println("Combine");
		}
		
		//String ans= ;
		System.out.println( divide  ? "Simple":"Combine" )  ;
*/		
		PrintSimples(i1,i2);
	}
	//btnCalcClick end!!!!
	
	
	private int myMax(int a,int b){
			
		if(a>b){			
			return a;
		} 
			return b;	
	
	} 

	private int mySum(int a,int b){
		int res;
		res=a+b;
		return res;
	}
	
	private boolean isDivide(int a,int b){
		return a % b == 0;
	}
	
	private boolean isSimple(int a){
		int k;
		for(k=2;k<a;k++){
			if(a%k==0){
				return false;
			}	
		}
		return true;		
	}
	
	private void PrintSimples(int x, int y){
		int k;
		k=1;
		
		while(k<=y){
			if(isSimple(k)){
				System.out.println(k);	
			}

			k++;
		}
	}
}

