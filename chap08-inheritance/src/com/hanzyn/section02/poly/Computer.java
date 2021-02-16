package com.hanzyn.section02.poly;

public class Computer {

	public static void main(String[] args) {
		
		GraphicCard gc = new GraphicCard();
		gc.process();
		
		gc = new Amd();
		gc.process();
		
		gc = new Nvidia();
		gc.process();
		
		//교체
		GraphicCard gc1 = new Amd();
		gc1.process();
		GraphicCard gc2 = new Nvidia();
		gc2.process();
		
	}

}
