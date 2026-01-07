package cn.reiyans.RYSMenuX.Button;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class SliderButton extends BaseButton{

    @Setter
    @Getter
    private String tip;

    @Setter
    @Getter
    private int min;

    @Setter
    @Getter
    private int max;

    public SliderButton(int type, String name, String texture, int money, List<String> allCmds, String tip,int min, int max, String permission) {
        super(type, name, texture, money, allCmds, permission);
        this.tip = tip;
        this.min = min;
        this.max = max;
    }

}
