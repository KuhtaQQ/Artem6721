package by.academy.Homework.HW3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericaPhoneValidator implements Validator {
	public final static Pattern pattern = Pattern.compile(("\\+1([\\- ]?)[\\d]([\\- ]?){10}"));

	@Override
	public boolean validate(String valNumber) {
		Matcher matcher = pattern.matcher(valNumber);
		return matcher.find();
	}
	

}
