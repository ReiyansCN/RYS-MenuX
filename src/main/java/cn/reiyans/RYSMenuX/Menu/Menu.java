package cn.reiyans.RYSMenuX.Menu;

import cn.reiyans.RYSMenuX.Button.BaseButton;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Menu{
    @Setter
    @Getter
    private String title;

    @Setter
    @Getter
    private String text;

    @Setter
    @Getter
    private ArrayList<BaseButton> buttons;

    public Menu(String title,String text,ArrayList<BaseButton> buttons){
        this.title = title;
        this.text = text;
        this.buttons = buttons;
    }

}
