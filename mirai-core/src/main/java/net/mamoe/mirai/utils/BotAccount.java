package net.mamoe.mirai.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BotAccount {
    public final long qqNumber;
    public final String password;
}
