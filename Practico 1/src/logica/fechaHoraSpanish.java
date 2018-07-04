/**
 * 
 */
package logica;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * @author carlos
 *
 */
public interface fechaHoraSpanish {
	public default String fechaHoraSpanish(LocalDateTime date) {
		Locale espa�ol = new Locale("es", "AR");

		return (Character.toUpperCase(date.getDayOfWeek().getDisplayName(TextStyle.FULL, espa�ol).charAt(0))
				+ date.getDayOfWeek().getDisplayName(TextStyle.FULL, espa�ol).substring(1) + " " + date.getDayOfMonth()
				+ " de " + date.getMonth().getDisplayName(TextStyle.FULL, espa�ol).toLowerCase() + " " + date.getHour()
				+ ":" + date.getMinute());
	}
}
