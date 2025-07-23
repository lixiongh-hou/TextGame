package com.sq.common_module.common.utils;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;


public class EditViewUtil {

    public static void inputTypeForMoney(EditText editText) {
        inputTypeForMoney(editText, null);
    }

    public static void inputTypeForMoney(EditText editText, OnTextChangeListener onTextChangeListener) {
        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            //从start索引开始的before个字符被count个字符替换掉了
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String inputStr = s.toString();
                String newInputStr = setInputModeForMoney(editText, inputStr);
                if (onTextChangeListener != null) {
                    onTextChangeListener.onTextChange(newInputStr);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public static void inputTypeForMoneyOne(EditText editText, OnTextChangeListener onTextChangeListener) {
        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            //从start索引开始的before个字符被count个字符替换掉了
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String inputStr = s.toString();
                String newInputStr = setInputModeForMoneyOne(editText, inputStr);
                if (onTextChangeListener != null) {
                    onTextChangeListener.onTextChange(newInputStr);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }


    public static String setInputModeForMoney(EditText editText, String inputStr) {
        //如果用户输入的第一个字符是“.”时，自动在“.”前补“0”
        if (inputStr.startsWith(".")) {
            inputStr = "0" + inputStr;
            editText.setText(inputStr);
            editText.setSelection(inputStr.length());
            return inputStr;
        }
        if (inputStr.length() > 1 && inputStr.startsWith("-") && inputStr.charAt(1) == '0') {
            inputStr = inputStr.substring(1);
            editText.setText(inputStr);
            editText.setSelection(editText.getText().toString().length());
            return inputStr;
        }
        //如果用户在第一位上输入“0”时，去掉“0”
        if (inputStr.length() > 1 && inputStr.startsWith("0") && inputStr.charAt(1) != '.') {
            inputStr = inputStr.substring(1);
            editText.setText(inputStr);
            editText.setSelection(editText.getText().toString().length());
            return inputStr;
        }
        //限制用户只能输入小数点后两位
        if (inputStr.contains(".")) {
            String[] input = inputStr.split("\\.");
            if (input.length >= 2 && input[1].length() > 2) {
                input[1] = input[1].substring(0, 2);
                String inputs = input[0] + "." + input[1];
                editText.setText(inputs);
                int index = inputs.length();
                editText.setSelection(index);
            }
        }
        return inputStr;
    }


    public static String setInputModeForMoneyOne(EditText editText, String inputStr) {
        //如果用户输入的第一个字符是“.”时，自动在“.”前补“0”
        if (inputStr.startsWith(".")) {
            inputStr = "0" + inputStr;
            editText.setText(inputStr);
            editText.setSelection(inputStr.length());
            return inputStr;
        }
        //如果用户在第一位上输入“0”时，去掉“0”
        if (inputStr.length() > 1 && inputStr.startsWith("0") && inputStr.charAt(1) != '.') {
            inputStr = inputStr.substring(1);
            editText.setText(inputStr);
            editText.setSelection(editText.getText().toString().length());
            return inputStr;
        }
        //限制用户只能输入小数点后Yi 位
        if (inputStr.contains(".")) {
            String[] input = inputStr.split("\\.");
            if (input.length >= 2 && input[1].length() > 1) {
                input[1] = input[1].substring(0, 1);
                inputStr = input[0] + "." + input[1];
                editText.setText(inputStr);
                int index = inputStr.length();
                editText.setSelection(index);
            }
        }
        return inputStr;
    }

    public interface OnTextChangeListener {
        void onTextChange(String inputStr);
    }
}
