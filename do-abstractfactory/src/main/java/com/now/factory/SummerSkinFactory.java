package com.now.factory;

import com.now.button.Button;
import com.now.button.SummerButton;
import com.now.combobox.ComboBox;
import com.now.combobox.SummerComboBox;
import com.now.textfield.SummerTextField;
import com.now.textfield.TextField;

public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
