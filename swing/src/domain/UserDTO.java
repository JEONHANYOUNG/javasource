package domain;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor





public class UserDTO {
	private int no;
	private String userName;
	private int birthYear;
	private String addr;
	private String mobile;
	
	
	
	
	
}