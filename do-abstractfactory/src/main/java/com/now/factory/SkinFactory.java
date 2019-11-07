package com.now.factory;

import com.now.button.Button;
import com.now.combobox.ComboBox;
import com.now.textfield.TextField;

public interface SkinFactory {
    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();
}
