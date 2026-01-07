package cn.reiyans.RYSMenuX.Button;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class ModalButton extends BaseButton{

    @Setter
    @Getter
    private String tip;

    public ModalButton(int type, String name, String texture, int money, List<String> allCmds, String tip, String permission) {
        super(type, name, texture, money, allCmds, permission);
        this.tip = tip;
    }

}
