package pl.decerto.workshop.elastic.app.party;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {

	private long addressId;

	private String country;

	private String postalCode;

	private String postOffice;

	private String city;

	private String street;

	private String houseNumber;

	private String doorNumber;

	public static final class Fields {

		public static final String CITY = "city";

		public static final String STREET = "street";

		public static final String HOUSE_NUMBER = "houseNumber";

		public static final String DOOR_NUMBER = "doorNumber";

		public static final String POSTAL_CODE = "postalCode";

		private Fields() {
		}
	}

}
