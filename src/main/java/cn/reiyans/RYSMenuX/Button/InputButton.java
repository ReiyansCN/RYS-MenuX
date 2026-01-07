package cn.reiyans.RYSMenuX.Button;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class InputButton extends BaseButton{

    @Setter
    @Getter
    private String tip;

    @Setter
    @Getter
    private String text;

    public InputButton(int type, String name, String texture, int money, List<String> allCmds, String tip, String text,String permission) {
        super(type, name, texture, money, allCmds, permission);
        this.tip = tip;
        this.text = text;
    }

}
