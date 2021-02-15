package by.academy.Homework.HW3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
	public final static Pattern pattern = Pattern.compile("\\+375([\\-]?)(25|29|33|44)([\\-])[\\d]{7}");

	@Override
	public boolean validate(String valNumber) {
		Matcher matcher = pattern.matcher(valNumber);
		return matcher.find();
	}

}
