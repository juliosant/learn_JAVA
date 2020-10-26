package courseJava.classRoom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import courseJava.classRoom.entities.Order;
import courseJava.classRoom.enums.OrderStatus;

public class Day07 {
	public static void main(String[] args) throws ParseException {
		// DATE
		/*
		 * //formatos de data e hora 
		 * SimpleDateFormat sdf1 = newSimpleDateFormat("dd/MM/yyyy"); 
		 * SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		 * SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 * sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); //Definir horário padrão de
		 * Local
		 * 
		 * //Instâncias 
		 * Date x1 = new Date(); 
		 * Date x2 = new Date(System.currentTimeMillis()); 
		 * Date x3 = new Date(0L); //Primeiro horário armazenado(3 horas atrasado) 
		 * Date x4 = new Date(1000L * 60L * 60L *8L); //Remover manualmentee atraso
		 * 
		 * Date y1 = sdf1.parse("30/10/2020"); 
		 * Date y2 = sdf2.parse("30/10/2020 08:13:00"); 
		 * Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //ao invés de 15 ira
		 * imprimir 12 plas 3 horas de atraso do horário de Brailia
		 * 
		 * System.out.println("Today #1: " +x1); System.out.println("Today #2: " +x2);
		 * System.out.println("Day x3: " +x3); //Mostará mais antiga com 3 horas de
		 * atraso. System.out.println("Day x3: " +x4);
		 * 
		 * System.out.println("Day y1: " +y1); System.out.println("Day y2: " +y2);
		 * System.out.println("Day y3: " +y3);
		 * 
		 * System.out.println("------------------------");
		 * System.out.println("Today #1: " +sdf2.format(x1));
		 * System.out.println("Today #2: " +sdf2.format(x2));
		 * System.out.println("Day x3: " +sdf2.format(x3));
		 * System.out.println("Day x3: " +sdf2.format(x4));
		 * 
		 * System.out.println("Day y1: " +sdf2.format(y1));
		 * System.out.println("Day y2: " +sdf2.format(y2));
		 * System.out.println("Day y3: " +sdf2.format(y3));
		 * 
		 * System.out.println("------------------------");
		 * System.out.println("Today #1: " +sdf3.format(x1));
		 * System.out.println("Today #2: " +sdf3.format(x2));
		 * System.out.println("Day x3: " +sdf3.format(x3));
		 * System.out.println("Day x3: " +sdf3.format(x4));
		 * 
		 * System.out.println("Day y1: " +sdf3.format(y1));
		 * System.out.println("Day y2: " +sdf3.format(y2));
		 * System.out.println("Day y3: " +sdf3.format(y3));
		 */

		// CALENDAR
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		 * Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		 * System.out.println(sdf.format(d));
		 * 
		 * // Alterar unidade de horas 
		 * Calendar cal = Calendar.getInstance();
		 * cal.setTime(d); //receber instância a ser alterada
		 * cal.add(Calendar.HOUR_OF_DAY, 4); //add(unidade, quantidade) d =
		 * cal.getTime(); //alterar instância
		 * 
		 * System.out.println(sdf.format(d));
		 * 
		 * int minutes = cal.get(Calendar.MINUTE); System.out.println("minutes: " +
		 * minutes);
		 * 
		 * 
		 * int month = 1 + cal.get(Calendar.MONTH); //A contagem dos meses começa a
		 * partir de 0 )0-11) por isso soma mais 1 System.out.println("Month: " +
		 * month);
		 */

		// ENUUM
		Order order = new Order(1080, new Date(), OrderStatus.PRCESSING);

		System.out.println(order);
		
		//converter string para enum
		OrderStatus os1 = OrderStatus.DELIVERED;
	
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}
}
