package com.constant;

import lombok.Getter;
import lombok.Setter;

public enum EnumDeleteFlag {
    NORMAL(0, "正常"),
    DELETE(1, "删除");
    /**
     * code
     */
    @Getter
    @Setter
    private Integer code;

    /**
     * 描述
     */
    @Getter
    @Setter
    private String display;

    /**
     * 构造函数
     */
    EnumDeleteFlag(Integer code, String display) {
        this.code = code;
        this.display = display;
    }
}
