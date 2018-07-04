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
		Locale español = new Locale("es", "AR");

		return (Character.toUpperCase(date.getDayOfWeek().getDisplayName(TextStyle.FULL, español).charAt(0))
				+ date.getDayOfWeek().getDisplayName(TextStyle.FULL, español).substring(1) + " " + date.getDayOfMonth()
				+ " de " + date.getMonth().getDisplayName(TextStyle.FULL, español).toLowerCase() + " " + date.getHour()
				+ ":" + date.getMinute());
	}
}
