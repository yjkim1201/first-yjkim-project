package com.hw3.run;

import com.hw3.model.Song;

public class Run {

	public static void main(String[] args) {
	
		
		//배열로 한번에 입력할 수 있다.
		Song s=new Song("Dancing Queen","Arrival","Benny Andersson, Bhorn Ulvaeus, Stig Anderson",1976,2);
	
		
		System.out.println(s.show());

	}

}
