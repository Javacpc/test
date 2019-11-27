import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;

public class Mytest {

	public static void main(String[] args) {

		Date dat1=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(dat1);
		String endday="20190930";
		if(Integer.parseInt(today)  >=Integer.parseInt(endday) ){
		
			System.out.println("超时");
		}else
		System.out.println("可以继续使用");
		
		//hahhahahaha
		
		
		//将字符串形式的时间转化为Date类型的时间

	}
	
	public boolean isOdd(int i) {
	    return (i & 1) == 1;
	}
}
