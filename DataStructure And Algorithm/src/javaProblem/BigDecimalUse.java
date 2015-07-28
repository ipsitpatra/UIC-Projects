/**
 * 
 */
package javaProblem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ipsit
 *
 */
public class BigDecimalUse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		if(count<=200){
			List<BigDecimal> list = new ArrayList<BigDecimal>();
			for (int i = 0; i < count; i++){
				BigDecimal tmp = in.nextBigDecimal();
				if(tmp.toPlainString().length()<=300)
				list.add(tmp);
				else
					System.exit(0);
				}
			Collections.sort(list);
			Collections.reverse(list);
			for (BigDecimal val: list){ 
				int index = val.toString().indexOf(".");
				if(index != -1 && val.toString().indexOf("0") == 0 && index ==1) {
					System.out.println(val.toPlainString().substring(index, val.toPlainString().length()));
				}else if(index != -1 && index ==1) {
					System.out.println(val.toPlainString().substring(index, val.toPlainString().length()));
				}else
					System.out.println(val.toPlainString());
			}
		}
		in.close();
	}
	
}
