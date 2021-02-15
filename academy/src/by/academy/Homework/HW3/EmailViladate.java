package by.academy.Homework.HW3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailViladate implements Validator {
	public final static Pattern pattern = Pattern.compile("[\\w]+@[\\w]+[\\.](com)|(by)|(ru)");
	
	@Override
	public boolean validate(String valEmail) {
		Matcher matcher = pattern.matcher(valEmail);
		return matcher.find();
	}


}
