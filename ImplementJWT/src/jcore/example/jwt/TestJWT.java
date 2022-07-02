package jcore.example.jwt;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.security.InvalidKeyException;

public class TestJWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stubO
		String token = null;
		try {
			token = CreateJWT.createJWTNosign("nghia", "nghiat.nguyen@btmglobal.com");
			System.out.println(CreateJWT.createJWTNosign("nghia", "nghiat.nguyen@btmglobal.com"));
		} catch (InvalidKeyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvalidKeySpecException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Jws<Claims> jwt = null;
		try {
			jwt = CreateJWT.parseJwt(token);
		} catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(jwt.toString());
	}

}
