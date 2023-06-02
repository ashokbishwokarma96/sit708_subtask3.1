package com.ashok.calculation;

import android.text.InputFilter;
import android.text.Spanned;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecimalDigitsInputFilter implements InputFilter {
    private Pattern pattern;

    public DecimalDigitsInputFilter(int digitsAfterDecimal) {
        pattern = Pattern.compile("^[0-9]+(\\.[0-9]{0," + digitsAfterDecimal + "})?$");
    }

    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        String input = dest.subSequence(0, dstart) + source.toString() + dest.subSequence(dend, dest.length());
        Matcher matcher = pattern.matcher(input);
        if (!matcher.matches()) {
            return "";
        }
        return null;
    }
}