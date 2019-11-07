package com.now;

import com.now.button.Button;
import com.now.combobox.ComboBox;
import com.now.factory.SkinFactory;
import com.now.textfield.TextField;
import com.now.utils.XMLUtil;

public class Client {
    public static void main(String[] args) {
        SkinFactory factory = (SkinFactory) XMLUtil.getBean();
        Button button = factory.createButton();
        TextField textField = factory.createTextField();
        ComboBox comboBox = factory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();
    }
}
