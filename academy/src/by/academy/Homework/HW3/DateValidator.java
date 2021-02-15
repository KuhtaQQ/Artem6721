package by.academy.Homework.HW3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator implements Validator {
	public static final String regex = "(0[0-9]|[12][0-9]|3[01])(-|/)(0?[1-9]|1[012])(-|/)((19|20)\\d\\d)";
    private static final Pattern pattern = Pattern.compile(regex);


    @Override
    public boolean validate(String strDate) {
        Matcher matcher = pattern.matcher(strDate.trim());
        return matcher.matches();
    }

}
