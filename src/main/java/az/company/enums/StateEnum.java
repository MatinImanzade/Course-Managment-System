package az.company.enums;

import java.util.Arrays;

public enum StateEnum {
    ACTIVE (1),
    DEACTIVE(0);

    int code;
    StateEnum(int i) {
        this.code = i;
    }

    public int getCode(){
        return code;
    }

    public static StateEnum getEnum(int code){
        return Arrays.stream(StateEnum.values())
                .filter(p->p.code == code)
                .findFirst().orElse(null);
    }
}
