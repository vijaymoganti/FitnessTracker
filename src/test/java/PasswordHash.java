import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

import junit.framework.TestCase;

public class PasswordHash extends TestCase {
	
	public void testMD5Hash() {
		
		int password = 12345;
		Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
		String hashedPassword = passwordEncoder.encodePassword(Integer.toString(password), null);
		System.out.println(hashedPassword);
	}
}
