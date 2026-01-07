package cn.reiyans.RYSMenuX.Button;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class ChoseButton extends BaseButton{

    @Setter
    @Getter
    private String tip;

    @Setter
    @Getter
    private ArrayList<String> list;

    public ChoseButton(int type, String name, String texture, int money, List<String> allCmds, String tip, ArrayList<String> list,String permission) {
        super(type, name, texture, money, allCmds, permission);
        this.tip = tip;
        this.list = list;
    }

}
