package com.starlucks.menu.application.command;


import com.starlucks.common.Codes.Size;
import java.util.List;

public record MenuAddCommand(
    String menuName,
    long menuPrice,
    Size size,
    List<MenuOptionAddCommand> menuOptionAddCommands
) {

}
