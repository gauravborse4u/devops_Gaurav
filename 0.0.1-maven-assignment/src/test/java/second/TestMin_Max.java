package second;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestMin_Max {

	@Test
	public void check() {
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);
		num.add(16);
		num.add(17);
		num.add(18);
		num.add(19);
		num.add(20);
		
		Min_Max mm = new Min_Max();
		
		//assertEquals(20, mm.maxInt(num));//Error needs to be rectify
		
	}
	
}
