package com.now.factory;

import com.now.button.Button;
import com.now.button.SpringButton;
import com.now.combobox.ComboBox;
import com.now.combobox.SpringComboBox;
import com.now.textfield.SpringTextField;
import com.now.textfield.TextField;

public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
